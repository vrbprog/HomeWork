package lesson1;

public class Main {

    //Task 1
    public static void main(String[] args) {

        //Task 2
        byte byteVar = 120;
        short shortVar = 1234;
        char charVar = 'a';
        int intVar = 123765;
        long longVar = 123456789L;
        float floatVar = 1.234f;
        double doubleVar = -2.431245698;
        boolean boolVar = true;

        //Task 3
        System.out.println(calculation(2,3,8,1));

        //Task 4
        System.out.println(checkSum(12,5));

        //Task 5
        printSign(7);

        //Task 6
        System.out.println(isNumberNegative(4));

        //Task 7
        printHello("Roman");

        //Task 8
        printYear(2020);
    }

    private static double calculation(double a, double b, double c, double d) {
        return a * (b + c / d);
    }

    private static boolean checkSum(int a, int b){
        int r = a + b;
        return (r >= 10 && r <= 20);
    }

    private static void printSign(int num){
        System.out.println("Число " + num + (num >= 0 ? " - положительное" : " - отрицательное"));
    }

    private static boolean isNumberNegative(int num){
        return num < 0;
    }

    private static void printHello(String name){
        System.out.println("Привет, " + name + "!");
    }

    private static void printYear(int year){
        System.out.println(year + " год " + (isYearHeight(year) ? "высокосный" : "не высокосный"));
    }

    private static boolean isYearHeight(int year){
        if(year % 400 == 0){
            return true;
        }
        else if(year % 100 == 0){
            return false;
        }
        else {
            return year % 4 == 0;
        }
    }
}
