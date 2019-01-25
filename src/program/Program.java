package program;

import arrays.ArrayUtil;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Укажите длину массива: ");
        int n = scanner.nextInt();
        int[] massive = new int[n];
        ArrayUtil.fillFromScanner(massive, scanner);
        System.out.println(ArrayUtil.unique(massive));


        /*int n = scanner.nextInt();
        int[][] array = new int[n][2];
        for (int i = 0; i < array.length; i++){
            array[i][0] = scanner.nextInt();
            array[i][1] = scanner.nextInt();
        }

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(ArrayUtil.countPassengersTime(array, 13));*/


        /*if (ArrayUtil.minOdd(massive) != null){
            System.out.println(ArrayUtil.minOdd(massive));
        } else {
            System.out.println("Нечетных элементов нет");
        }*/
        //System.out.println(ArrayUtil.toString(ArrayUtil.copyOf(massive,4)));

        /*ArrayList<Integer> arrayList = ArrayUtil.maxValues(massive);
        if (arrayList != null){
            for (int i = 0; i < arrayList.size(); i++){
                System.out.print(arrayList.get(i) + " ");
            }
        } else {
            System.out.println("Ошибка!");
        }*/


        /*int[] mas = ArrayUtil.delete(massive, 4);
        if (mas != null){
            ArrayUtil.print(mas);
        } else {
            System.out.println("Индекс превышает длину массива!");
        }*/

        /*int[] mas = ArrayUtil.insert(massive,5,1835);
        if (mas != null){
            ArrayUtil.print(mas);
        } else {
            System.out.println("Индекс превышает длину массива!");
        }*/

        /*ArrayList<Integer> tmp = ArrayUtil.insert(massive, 4, 175);
        if (tmp != null) {
            for (int i = 0; i < tmp.size(); i++) {
                System.out.print(tmp.get(i) + " ");
            }
        }*/

        /*System.out.println();
        ArrayUtil.print(ArrayUtil.sameNeighbours(massive));*/

        /*ArrayList<Integer> tmp = ArrayUtil.evenData(massive);
        System.out.println();
        System.out.print("Четные элементы массива: ");
        for (int i = 0; i < tmp.size(); i++){
            System.out.print(tmp.get(i) + " ");
        }*/


    }
}
