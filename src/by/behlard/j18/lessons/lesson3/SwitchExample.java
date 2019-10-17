package by.behlard.j18.lessons.lesson3;

public class SwitchExample {
    public static void main(String[] args) {

        String day = "Sunday";
        String result;

        switch (day) {
            case "Monday":
                result = "Too long";
                break;
            case "Tuesday":
                result = "A bit closer";
                break;
            case "Wednesday":
                result = "middle week";
                break;
            case "Thursday":
                result = "close enough";
                break;
            case "Friday":
                result = "at last";
                break;
            case "Saturday":
            case "Sunday":
                result = "WEEKEND!!!";
                break;
            default:
                result = "not a day of week";
        }

        System.out.println(result);
    }
}
