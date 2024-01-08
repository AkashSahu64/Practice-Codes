import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class ClothesColorPredictor {
    public static void main(String[] args) {
        DayOfWeek currentDay = LocalDate.now().getDayOfWeek();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the color of your body: ");
        String bodyColor = scanner.nextLine();
        String clothesColor = predictClothesColor(currentDay, bodyColor);
        String clothesType = suggestClothesType(clothesColor);
        System.out.println("Prediction:");
        System.out.println("Based on your body color and today's weekday, you should wear " + clothesColor + " clothes.");
        System.out.println();

        System.out.println("Suggestion:");
        System.out.println("You can wear " + clothesType + " in " + clothesColor + " color.");
        scanner.close();
    }

    private static String predictClothesColor(DayOfWeek dayOfWeek, String bodyColor) {
        String clothesColor = "black";
        switch (dayOfWeek) {
            case MONDAY:
                clothesColor = "blue";
                break;
            case TUESDAY:
                clothesColor = "red";
                break;
            case WEDNESDAY:
               clothesColor = "green";
               break;
            case THURSDAY:
                clothesColor = "yellow";
                break;
            case FRIDAY:
                clothesColor = "white";
                break;
            case SATURDAY:
                clothesColor = "purple";
                break;
            case SUNDAY:
                clothesColor = "pink";
                break;
        }
        if (bodyColor.equalsIgnoreCase("white")) {
            clothesColor = "black";
        }

        return clothesColor;
    }

    private static String suggestClothesType(String clothesColor) {
        String clothesType = "casual";
        if (clothesColor.equalsIgnoreCase("black")) {
            clothesType = "formal";
        }
        return clothesType;
    }
}
