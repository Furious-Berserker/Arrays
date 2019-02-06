package arrays;

import javax.management.ObjectName;
import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ArrayUtil {
    public static void fillFromScanner(int[] mass, Scanner scanner) {
        for (int i = 0; i < mass.length; i++) {
            System.out.print("" + i + " элемент массива: ");
            mass[i] = scanner.nextInt();
        }
    }

    public static void print(int[] mas) {
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
    }

    public static void even(int[] mas) {
        for (int i = 2; i < mas.length; i += 2) {
            System.out.println(mas[i]);
        }
    }

    public static int countPositive(int[] mas) {
        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > 0)
                count++;
        }
        return count;
    }

    public static void greatPref(int[] mas) {
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] > mas[i - 1]) {
                System.out.println(mas[i]);
            }
        }
    }

    public static void m1(int[] mas) {
        int i = 0;
        while (!(i == mas.length - 1 || mas[i] > 0 && mas[i + 1] > 0 || mas[i] < 0 && mas[i + 1] < 0)) {
            i++;
        }
        if (i != mas.length - 1)
            System.out.println(mas[i] + " " + mas[i + 1]);
    }

    public static void m2(int[] mas) {
        int n = 0;
        for (int i = 1; i < mas.length - 1; i++) {
            if (mas[i - 1] < mas[i] && mas[i] > mas[i + 1])
                n += 1;
        }
        System.out.println(n);
    }

    public static int indefOfPetya(int[] mas, int petyaHeight) {
        int i = 0;
        if (petyaHeight != 200) {
            while (i < mas.length && petyaHeight < mas[i]) {
                i++;
            }
            return i + 1;
        }
        return 0;
    }

    public static int m3(int[] mas){
        int n = 0;
        for (int i = 0; i < mas.length-1; i++){
            if (mas[i] != mas[i+1])
                n++;
        }
        return n;
    }

    public static void m4(int[] mas){
        int[] newMas = new int[mas.length];
        int n = 0;
        for (int i = mas.length-1; i >= 0; i--){
            newMas[n] = mas[i];
            n++;
        }
        print(newMas);
    }

    public static void m5(int[] mas){
        int c = 0;
        for (int i = 1; i < mas.length-1; i+=2){
            c = mas[i];
            mas[i] = mas[i-1];
            mas[i-1] = c;
        }
        print(mas);
    }

    public static void m6(int[] mas){
        for (int i = 1; i < mas.length-1; i++){

        }
        print(mas);
    }

    public static void dragon(int years){

        int heads = 0;
        int eyes = 0;
        int yearsCount = 0;

        yearsCount++;
        heads += 3;
        eyes += 6;

        if (yearsCount > 100) {
            heads += 2;
            eyes += 4;
        }

        System.out.println("У дракона " + heads + " голов и " + eyes + " глаз.");
    }

    public static int[] fill(int[] mas, Scanner scanner){
        for (int i = 0; i < mas.length; i++){
            System.out.print("" + i + " элемент массива: ");
            int n = scanner.nextInt();
            mas[i] = n;
        }
        return mas;
    }

    public static int[] fillRandom(int[] mas){
        for (int i = 0; i < mas.length; i++) {
            mas[i] = generateRandom();
        }
        return mas;
    }

    public static String toString(int[] mas){
        String str = "[";
        for (int i = 0; i < mas.length; i++){
            str += mas[i];
            if (i != mas.length - 1) {
                str += ", ";
            }
        }
        str += "]";
        return str;
    }

    public static ArrayList<Integer> evenIndexes(int[] mas){
        ArrayList<Integer> mass = new ArrayList<>();
        for (int i = 0; i < mas.length; i+=2){
            mass.add(mas[i]);
        }
        return mass;
    }

    public static ArrayList<Integer> greatPrev(int[] mas){
        ArrayList<Integer> mass = new ArrayList<>();
        for (int i = 0; i < mas.length-1; i++) {
            if (mas[i] < mas[i+1]){
                mass.add(mas[i+1]);
            }
        }
        return mass;
    }

    public static ArrayList<Integer> evenData(int[] mas){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < mas.length; i++) {
            if (isEven(mas[i]) == true) {
                arrayList.add(mas[i]);
            }
        }
        return arrayList;
    }

    public static int[] sameNeighbours(int[] mas){
        for (int i = 1; i < mas.length; i++){
            while (mas[i] == mas[i-1]){
                int[] massive = new int[2];
                massive[0] = mas[i-1];
                massive[1] = mas[i];
                return massive;
            }
        }
        int[] i = new int[0];
        return i;
    }

    public static void shift(int[] mas, boolean k){
        if (k == true){
            int j = mas[mas.length-1];
            for (int i = mas.length-1; i > 0; i--){
                mas[i] = mas[i-1];
            }
            mas[0] = j;
            print(mas);
        } else {
            int j = mas[0];
            for (int i = 0; i < mas.length-1; i++){
                mas[i] = mas[i+1];
            }
            mas[mas.length-1] = j;
            print(mas);
        }
    }

    public static int[] fillPrimeRandom(int[] mas){
        for (int i = 0; i < mas.length; i++){
            int n = generateRandom();
            if (isPrime(n)){
                mas[i] = n;
            }
        }
        return mas;
    }

    public static int greaterNeighbours(int[] mas){
        int count = 0;
        for (int i = 1; i < mas.length-1; i++){
            if (mas[i] > mas[i+1] && mas[i] > mas[i-1] )
                count++;
        }
        return count;
    }

    public static ArrayList<Integer> maxValues(int[] mas){

        ArrayList<Integer> arrayList = new ArrayList<>();
        int n = maxElement(mas);

        for (int i = 0; i < mas.length; i++){
            if (mas[i] == n){
                arrayList.add(i);
            }
        }
        return arrayList;
    }

    public static int[] maxValues2(int[] mas){

        int count = 0;
        int a = maxElement(mas);

         for (int i = 0; i < mas.length; i++){
             if (mas[i] == a){
                 count++;
             }
         }
         int[] massive = new int[count];
            for (int i = 0, j = 0; i < mas.length; i++){
                if (mas[i] == a){
                    massive[j] = i;
                    j++;
                }
            }
        return massive;
    }

    public static Integer minOdd(int[] mas){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < mas.length; i++){
            if (!isEven(mas[i])){
                if (mas[i] < min){
                     min = mas[i];
                }
            }
        }
        if (min != Integer.MAX_VALUE) {
            return min;
        } else
            return null;
    }

    public static int[] reverseNeighbours(int[] mas){
        int c = 0;

        for (int i = 1; i < mas.length; i+=2){
            c = mas[i-1];
            mas[i-1] = mas[i];
            mas[i] = c;
        }
        return mas;
    }

    public static void shiftK(int[] mas, int k){
        if (k < 0){
            for (int i = 0; i < Math.abs(k); i++){
                int c = mas[0];
                for (int j = 0; j <= mas.length; j++) {
                    if (j == mas.length-1) {
                        mas[mas.length-1] = c;
                        break;
                    }
                    mas[j] = mas[j+1];
                }
           }
           System.out.println(ArrayUtil.toString(mas));
        } else {
            for (int i = 0; i < k; i++){
                int c = mas[mas.length-1];
                for (int j = mas.length-1; j >= 0; j--) {
                    if (j == 0){
                        mas[0] = c;
                        break;
                    }
                    mas[j] = mas[j-1];
                }
            }
            System.out.println(ArrayUtil.toString(mas));
        }
    }

    public static int averagePoint(int[] mas){

        float sum = 0;
        float count = 0;
        float result;

        for (int i = 0; i < mas.length; i++){
            count++;
            if (mas[i] != 2)
                sum += mas[i];
        }
        result = sum / count;
        return Math.round(result);
    }


    public static int indexInsertion(int[] mas, int x){
            int i = 0;
            while (i != mas.length && x <= mas[i]) {
                i++;
            }
        return i;
    }

    public static int[] copyOf(int[] mas, int masLength){

        int[] newMas = new int[masLength];

        for (int i = 0; i < masLength; i++){

            if (i >= mas.length) {
                newMas[i] = 0;
            } else {
                newMas[i] = mas[i];
            }
        }
        return newMas;
    }

    public static int generateRandom(){
        Random random = new Random();
        int n = random.nextInt(1000) + 1;
        return n;
    }

    public static boolean isEven(int i){
        if (i % 2 == 0){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isPrime(int num){
        if (num % 2 != 0 && num % 3 != 0 && num % 11 != 0 && num % 5 != 0){
            return true;
        }
        return false;
    }

    public static int maxElement(int[] mas){
        int tmp = 0;
        for (int i = 0; i < mas.length; i++){
            if (mas[i] > tmp){
                tmp = mas[i];
            }
        }
        return tmp;
    }

    public static int nearest(int[] mas, int x){

        int tmp = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < mas.length; i++){
            tmp = Math.abs(mas[i] - x);
            if (tmp < min) {
                min = tmp;
            }
        }
        for (int i = 0; i < mas.length; i++){
            tmp = Math.abs(mas[i] - x);
            if (tmp == min){
                return mas[i];
            }
        }
        return 0;
    }

    public static ArrayList<Integer> nearest2(int[] mas, int x){
        int tmp = 0;
        int min = Integer.MAX_VALUE;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mas.length; i++){
            tmp = Math.abs(mas[i] - x);
            if (tmp < min){
                min = tmp;
            }
        }
        for (int i = 0; i < mas.length; i++){
            tmp = Math.abs(mas[i] - x);
            if (tmp == min){
                arrayList.add(mas[i]);
            }
        }
        return arrayList;
    }

    public static ArrayList<Integer> delete(int[] mas, int k){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < mas.length; i++){
            arrayList.add(mas[i]);
        }
        arrayList.remove(k);
        return arrayList;
    }

    public static ArrayList<Integer> insert(int[] mas, int k, int c){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < mas.length; i++){
            arrayList.add(mas[i]);
        }
        arrayList.add(k,c);
        return arrayList;
    }

    public static int[] delete2(int[] mas, int k){

        int[] massive = new int[mas.length-1];

        for (int i = 0; i < mas.length; i++){
            if (i != k){
                if (i < k) {
                    massive[i] = mas[i];
                }
                else {
                    massive[i-1] = mas[i];
                }
            }
        }
        return massive;
    }

    public static int[] insert2(int[] mas, int k, int c){

        int[] massive = new int[mas.length+1];

        for (int i = 0; i < mas.length; i++){
            if (i < k)
                massive[i] = mas[i];
            if (i == k){
                massive[i] = c;
                massive[i+1] = mas[i];
            }
            if (i > k) {
                massive[i+1] = mas[i];
            }
        }
        return massive;
    }

    public static int countEqualPairs(int[] mas){
        int count = 0;
        for (int i = 1; i < mas.length; i++){
            if (mas[i-1] == mas[i])
                count++;
        }
        return count;
    }

    public static int search(int[] mas, int key){
        for (int i = 0; i < mas.length; i++){
            if (mas[i] == key)
                return i;
        }
        return -1;
    }

    public static int[] search2(int[] mas, int key){

        int c = 0;
        int massiveLength = 0;

        for (int i = 0; i < mas.length; i++){
            if (mas[i] == key){
                massiveLength++;
            }
        }

        int[] newMas = new int[massiveLength];

        for (int i = 0, j = 0; i < mas.length; i++){
            if (mas[i] == key) {
                newMas[j] = i;
                j++;
            }
        }

        return newMas;
    }

    public static ArrayList<Integer> search3(int[] mas, int key){

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < mas.length; i++){
            if (mas[i] == key)
                arrayList.add(i);
        }
        return arrayList;
    }

    public static boolean equals(int[] mas1, int[] mas2){

        boolean isEquals = false, isEqualLength = false, isEqualElements = false, isEqualOrder = false;

        if (mas1.length == mas2.length) {
            isEqualLength = true;
            for (int i = 0; i < mas1.length; i++){
                if (mas1[i] == mas2[i])
                    isEqualElements = true;
                else {
                    isEqualElements = false;
                    break;
                }
            }
            if (isEqualElements == true){
                isEqualOrder = true;
            }
        }

        if (isEqualLength == true && isEqualElements == true && isEqualOrder == true)
            isEquals = true;

        return isEquals;

    }

    public static int rushHour(int[] mas, int k){
        int maxSum = 0;

        for (int i = 0; i <= mas.length-k; i++){
            int sum = 0;
            for (int j = i; j < i+k; j++) {
                sum += mas[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }



    public static int countDifferent(int[] mas){
        int c = 0;
        int count = 0;
        for (int i = 0; i < mas.length; i++){
            c = mas[i];
            boolean isUnique = true;
            for (int j = 0; j < mas.length; j++) {
                if (c == mas[j] && i != j)
                    isUnique = false;
            }
            if (isUnique == true)
                count++;
        }
        return count;
    }

    public static int countPassengersTime(int[][] array, int T){
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (T >= array[i][0] && T <= array[i][1]){
                count++;
            }
        }
        return count;
    }

    public static ArrayList<Integer> unique(int[] mas){

        ArrayList<Integer> arrayList = new ArrayList<>();

        int c;
        int count;

        for (int i = 0; i < mas.length; i++){
            count = 0;
            c = mas[i];
            for (int j = 0; j < mas.length; j++) {
                if (c == mas[j])
                    count++;
            }
            if (count == 1)
                arrayList.add(c);
        }
        return arrayList;
    }

    public static int[] unique2(int[] mas){

        int c;
        int count;
        int masLength = 0;

        for (int i = 0; i < mas.length; i++){
            count = 0;
            c = mas[i];
            for (int j = 0; j < mas.length; j++) {
                if (c == mas[j]) {
                    count++;
                }
            }
            if (count == 1){
                masLength++;
            }
        }

        int[] newMas = new int[masLength];
        int k = 0;

        for (int i = 0; i < mas.length; i++){
            count = 0;
            c = mas[i];

            for (int j = 0; j < mas.length; j++) {
                if (c == mas[j]){
                    count++;
                }
            }
            if (count == 1) {
                newMas[k] = c;
                k++;
            }
        }
        return newMas;
    }

    public static int frequent(int[] massive){

        int c = 0;
        int max = 0;
        int d = 0;

        for (int i = 0; i < massive.length; i++){
            int count = 0;
            c = massive[i];
            for (int j = 0; j < massive.length; j++) {
                if (c == massive[j])
                    count++;
            }
            if (count > max) {
                max = c;
                d++;
            }
        }
        if (d > 1)
            return max;
        else
            return 0;
    }

    public static ArrayList<Integer> frequent2(int[] massive){

        ArrayList<Integer> arrayList = new ArrayList<>();

        int c = 0;
        int max = 0;

        for (int i = 0; i < massive.length; i++){
            int d = 0;
            c = massive[i];
            for (int j = 0; j < massive.length; j++) {
                if (c == massive[j]){
                    d++;
                }
            }
            if (c != max && d > 1 && !arrayList.contains(c)){
                max = c;
                arrayList.add(max);
            }
        }
        return arrayList;
    }

    public static int[] frequent3(int[] massive){

        int c = 0;
        int max = 0;
        int gCount = 0;

        for (int i = 0; i < massive.length; i++){

            int d = 0;
            c = massive[i];

            for (int j = 0; j < massive.length; j++) {
                if (c == massive[j]){
                    d++;
                }
            }
            if (c != max && d > 1){
                max = c;
                gCount++;
            }
        }

        int[] newMassive = new int[gCount];

        int f = 0;
        max = 0;

        for (int i = 0; i < massive.length; i++){

            int d = 0;
            c = massive[i];

            for (int j = 0; j < massive.length; j++) {
                if (c == massive[j]){
                    d++;
                }
            }

            if (c != max && d > 1){
                max = c;
                newMassive[f] = max;
                f++;
            }
        }

        return newMassive;
    }

    public static ArrayList<Integer> equalItems(int[] mas){

        ArrayList<Integer> arrayList = new ArrayList<>();

        int c = 0;

        for (int i = 0; i < mas.length; i++){
            int count = 0;
            c = mas[i];
            for (int j = 0; j < mas.length; j++) {
                if (mas[j] == c)
                    count++;
            }
            if (count > 1)
                arrayList.add(c);
        }
        return arrayList;
    }

    public static int[] equalItems2(int[] mas){

        int c = countEqualPairs(mas);
        int f = 0;
        int d = 0;

        int[] newMas = new int[c];

        for (int i = 0; i < mas.length; i++) {
            int count = 0;
            f = mas[i];
            for (int j = 0; j < mas.length; j++) {
                if (mas[j] == f)
                    count++;
            }
            if (count > 1) {
                newMas[d] = c;
                d++;
            }
        }
        return newMas;
    }

    public static int[] sort(int[] mas){
        Arrays.sort(mas);
        return mas;
    }

    public static void sortComparator(Integer[] mas){
        //Comparator<Integer> reverseOrderComparator = Collections.reverseOrder(new MyComparator());
        Arrays.sort(mas, new MyComparator());
        System.out.println(Arrays.toString(mas));
    }

    public static boolean isOrder(int[] mas){
        boolean isOrder = false;
        for (int i = 0; i < mas.length; i++) {
            if (i < mas.length-1) {
                if (mas[i] < mas[i + 1])
                    isOrder = true;
                else
                    isOrder = false;
            }
        }
        return isOrder;
    }

    public static void nearest(){}
}