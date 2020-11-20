package lesson1;

public class Main {

    public static void main(String[] args) {

        task1(10);
        task2(8);
        task3();
        task4(5);
        task5(10);
        int[] array = new int[]{1,2,4,5,2};
        System.out.println("\n\r" + task6(array));
        int[] array2 = new int[]{7,3,4,5,2,9};
        task7(array2, 3);
    }

    public static void task1(int number){
        int[] array = new int[number];
        System.out.print("Задание №1\n\rНачальный массив :  ");
        for (int i = 0; i < number; i++) {
            array[i] = (int)(Math.random() * 2);
            System.out.print(array[i] + ", ");
        }
        System.out.print("\n\rИзмененный массив : ");
        for (int i = 0; i < number; i++) {
            if(array[i] == 0){
                array[i] = 1;
            }else{
                array[i] = 0;
            }
            System.out.print(array[i] + ", ");
        }
    }

    public static void task2(int number){
        int[] array = new int[number];
        System.out.print("\n\rЗадание №2\n\rСозданный массив : ");
        for (int i = 0; i < number; i++) {
            array[i] = i * 3;
            System.out.print(array[i] + ", ");
        }
    }

    public static void task3(){
        System.out.print("\n\rЗадание №3\n\rНачальный массив :  ");
        int[] array = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
            if(array[i] < 6) array[i] *=2;
        }
        System.out.print("\n\rИзмененный массив : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }

    public static void task4(int number){
        int[][] array2D = new int[number][number];
        System.out.print("\n\rЗадание №4\n\r");
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if(i == j || (i + j) == number - 1) array2D[i][j] = 1;
            }
        }
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void task5(int number){
        int[] array = new int[number];
        System.out.print("\n\rЗадание №5\n\rСозданный массив : ");
        for (int i = 0; i < number; i++) {
            array[i] = (int)(Math.random() * 100);
            System.out.print(array[i] + ", ");
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < number; i++) {
            if(array[i] > max){
                max = array[i];
            }
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.printf("\n\rМинимум %d, максимум %d", min, max);
    }

    public static boolean task6(int[] array){
        System.out.print("\n\rЗадание №6");
        int left = 0, right = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length; j++) {
                if(j <= i){
                    left += array[j];
                }
                else{
                    right += array[j];
                }
            }
            if(left == right){
                return true;
            }else{
                left = 0; right = 0;
            }
        }
        return false;
    }

    public static void task7(int[] array, int shift) {
        boolean direction = false;
        int number = 0;
        int buf = 0;
        if(shift > 0){
            direction = true;
            number = shift;
        }
        else number = shift * (-1);

        System.out.print("\n\rЗадание №7");
        System.out.print("\n\rНачальный массив :       ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }

        if(direction){
            for (int i = 0; i < number; i++) {
                buf = array[array.length-1];
                for (int j = array.length - 1; j > 0 ; j--) {
                    array[j] = array[j-1];
                }
                array[0] = buf;
            }
        }else{
            for (int i = 0; i < number; i++) {
                buf = array[0];
                for (int j = 0; j < array.length - 1 ; j++) {
                    array[j] = array[j+1];
                }
                array[array.length - 1] = buf;
            }
        }

        System.out.printf("\n\rМассив сдвинутый на %d :  ", shift);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }
}
