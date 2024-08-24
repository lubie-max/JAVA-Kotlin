package Enums;

public class Main {
    public static void main(String[] args) {
        // Enums -> listing things / enumeration
        Day day = Day.MONDAY;

//        System.out.println(Day.THURSDAY);

        // we can also create costume parmas to the constructor

        String result = switch (day){
            case MONDAY -> "Mon";
            case TUESDAY -> "Tu";
            case WEDNESDAY -> "Wed";
            case THURSDAY -> "Thu";
            case FRIDAY -> "Fri";
            case SATURDAY -> "Sat";
        };

        System.out.println("Result : " + result );



    }
}
