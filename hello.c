#include<stdio.h>

int main(){
    printf("hey i am a programmer\n");
    int a,b,c;
    printf("Enter the number of a and b : ");
    scanf("%d%d",&a,&b);
    c=a/b;
    printf("The sum of %d / %d = %d : \n",a,b,c);
    for(int i=1; i<=10; i++){
int x = a*i;
        printf("%d X %d = %d\n",a,i,x);
    }

    return 0;
}