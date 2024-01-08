#include <SDL.h>
#include <SDL_ttf.h>
#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#define SCREEN_WIDTH 640
#define SCREEN_HEIGHT 480
#define BOARD_SIZE 3
#define TILE_SIZE (SCREEN_WIDTH / BOARD_SIZE)

SDL_Window* window = NULL;
SDL_Renderer* renderer = NULL;
TTF_Font* font = NULL;

int board[BOARD_SIZE][BOARD_SIZE] = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 0}
};

int emptyTileRow = 2;
int emptyTileCol = 2;

int quit = 0;

int initSDL() {
    if (SDL_Init(SDL_INIT_VIDEO) < 0) {
        printf("SDL could not initialize! SDL_Error: %s\n", SDL_GetError());
        return 0;
    }

    window = SDL_CreateWindow("Sliding Puzzle", SDL_WINDOWPOS_UNDEFINED, SDL_WINDOWPOS_UNDEFINED, SCREEN_WIDTH, SCREEN_HEIGHT, SDL_WINDOW_SHOWN);
    if (window == NULL) {
        printf("Window could not be created! SDL_Error: %s\n", SDL_GetError());
        return 0;
    }

    renderer = SDL_CreateRenderer(window, -1, SDL_RENDERER_ACCELERATED);
    if (renderer == NULL) {
        printf("Renderer could not be created! SDL_Error: %s\n", SDL_GetError());
        return 0;
    }

    if (TTF_Init() < 0) {
        printf("SDL_ttf could not initialize! SDL_ttf Error: %s\n", TTF_GetError());
        return 0;
    }

    font = TTF_OpenFont("arial.ttf", 32);
    if (font == NULL) {
        printf("Failed to load font! SDL_ttf Error: %s\n", TTF_GetError());
        return 0;
    }

    return 1;
}

void closeSDL() {
    SDL_DestroyRenderer(renderer);
    SDL_DestroyWindow(window);
    TTF_CloseFont(font);
    TTF_Quit();
    SDL_Quit();
}

void drawBoard() {
    SDL_SetRenderDrawColor(renderer, 0, 0, 0, 255);
    SDL_RenderClear(renderer);

    for (int row = 0; row < BOARD_SIZE; ++row) {
        for (int col = 0; col < BOARD_SIZE; ++col) {
            int value = board[row][col];
            if (value == 0) {
                SDL_SetRenderDrawColor(renderer, 255, 255, 255, 255);
            } else {
                SDL_SetRenderDrawColor(renderer, 255, 0, 0, 255);
            }

            SDL_Rect rect = { col * TILE_SIZE, row * TILE_SIZE, TILE_SIZE, TILE_SIZE };
            SDL_RenderFillRect(renderer, &rect);

            if (value != 0) {
                SDL_Color textColor = { 255, 255, 255 };
                char str[2];
                snprintf(str, sizeof(str), "%d", value);
                SDL_Surface* surface = TTF_RenderText_Solid(font, str, textColor);
                SDL_Texture* texture = SDL_CreateTextureFromSurface(renderer, surface);
                SDL_Rect textRect = { col * TILE_SIZE + TILE_SIZE / 2 - surface->w / 2, row * TILE_SIZE + TILE_SIZE / 2 - surface->h / 2, surface->w, surface->h };
                SDL_RenderCopy(renderer, texture, NULL, &textRect);
                SDL_FreeSurface(surface);
                SDL_DestroyTexture(texture);
            }
        }
    }

    SDL_RenderPresent(renderer);
}

void shuffleBoard() {
    srand(time(NULL));

    for (int i = 0; i < BOARD_SIZE * BOARD_SIZE * 10; ++i) {
        int direction = rand() % 4;  // 0: up, 1: down, 2: left, 3: right

        switch (direction) {
            case 0:  // up
                if (emptyTileRow > 0) {
                    board[emptyTileRow][emptyTileCol] = board[emptyTileRow - 1][emptyTileCol];
                    board[emptyTileRow - 1][emptyTileCol] = 0;
                    emptyTileRow--;
                }
                break;
            case 1:  // down
                if (emptyTileRow < BOARD_SIZE - 1) {
                    board[emptyTileRow][emptyTileCol] = board[emptyTileRow + 1][emptyTileCol];
                    board[emptyTileRow + 1][emptyTileCol] = 0;
                    emptyTileRow++;
                }
                break;
            case 2:  // left
                if (emptyTileCol > 0) {
                    board[emptyTileRow][emptyTileCol] = board[emptyTileRow][emptyTileCol - 1];
                    board[emptyTileRow][emptyTileCol - 1] = 0;
                    emptyTileCol--;
                }
                break;
            case 3:  // right
                if (emptyTileCol < BOARD_SIZE - 1) {
                    board[emptyTileRow][emptyTileCol] = board[emptyTileRow][emptyTileCol + 1];
                    board[emptyTileRow][emptyTileCol + 1] = 0;
                    emptyTileCol++;
                }
                break;
        }
    }
}

void handleEvent(SDL_Event* event) {
    if (event->type == SDL_QUIT) {
        quit = 1;
    } else if (event->type == SDL_KEYDOWN) {
        switch (event->key.keysym.sym) {
            case SDLK_UP:
                if (emptyTileRow < BOARD_SIZE - 1) {
                    board[emptyTileRow][emptyTileCol] = board[emptyTileRow + 1][emptyTileCol];
                    board[emptyTileRow + 1][emptyTileCol] = 0;
                    emptyTileRow++;
                }
                break;
            case SDLK_DOWN:
                if (emptyTileRow > 0) {
                    board[emptyTileRow][emptyTileCol] = board[emptyTileRow - 1][emptyTileCol];
                    board[emptyTileRow - 1][emptyTileCol] = 0;
                    emptyTileRow--;
                }
                break;
            case SDLK_LEFT:
                if (emptyTileCol < BOARD_SIZE - 1) {
                    board[emptyTileRow][emptyTileCol] = board[emptyTileRow][emptyTileCol + 1];
                    board[emptyTileRow][emptyTileCol + 1] = 0;
                    emptyTileCol++;
                }
                break;
            case SDLK_RIGHT:
                if (emptyTileCol > 0) {
                    board[emptyTileRow][emptyTileCol] = board[emptyTileRow][emptyTileCol - 1];
                    board[emptyTileRow][emptyTileCol - 1] = 0;
                    emptyTileCol--;
                }
                break;
        }
    }
}

int checkWin() {
    int count = 1;
    for (int row = 0; row < BOARD_SIZE; ++row) {
        for (int col = 0; col < BOARD_SIZE; ++col) {
            if (board[row][col] != count) {
                return 0;
            }
            count++;
        }
    }
    return 1;
}

int main(int argc, char* argv[]) {
    if (!initSDL()) {
        return 1;
    }

    shuffleBoard();

    while (!quit) {
        SDL_Event event;
        while (SDL_PollEvent(&event) != 0) {
            handleEvent(&event);
        }

        drawBoard();

        if (checkWin()) {
            printf("Congratulations! You solved the puzzle!\n");
            break;
        }
    }

    closeSDL();

    return 0;
}
