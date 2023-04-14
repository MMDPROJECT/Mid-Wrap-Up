import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Lecture6Exercises {

    public static void main(String[] args) {
        System.out.println(extractWord("hi! how ,are you?"));
    }
    /*
     *   implement a function that takes an array of int and return sum of
     *   elements at even positions
     *   lecture 6 page  16
     */
    public long calculateEvenSum(int[] arr) {
        long total = 0;
        for (int i = 0; i < arr.length; i = i + 2){
            total += arr[i];
        }
        return total;
    }

    /*
     *   implement a function that takes an array of int and return that
     *   array in reverse order
     *   lecture 6 page 16
     */
    public int[] reverseArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < newArr.length; i++){
            newArr[i] = arr[arr.length - 1 - i];
        }
        return newArr;
    }

    /*
     *   implement a function that calculate product of two 2-dim matrices
     *   lecture 6 page 21
     */
    public double[][] matrixProduct(double[][] m1, double[][] m2) throws RuntimeException {
        double[][] productMatrix = new double[m1.length][m2[1].length];
        for (int i = 0; i < productMatrix.length; i++){
            for (int j = 0; j < productMatrix[i].length; j++){
                for (int k = 0; k < m1[0].length; k++){
                    productMatrix[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return productMatrix;
    }

    /*
     *   implement a function that return array list of array list of string
     *   from a 2-dim string array
     *   lecture 6 page 30
     */
    public List<List<String>> arrayToList(String[][] names) {
        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < names.length; i++){
            List<String> stringList = new ArrayList<String>(Arrays.asList(names[i]));
            list.add(stringList);
        }
        return list;
    }

    /*
     *   implement a function that return a list of prime factor of integer n
     *   in ascending order
     *   lecture 6 page 30
     */
    public List<Integer> primeFactors(int n) {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        int i = 2;
        while (i <= n){
            if (isPrime(i)){
                if (n % i == 0){
                    System.out.println(i);
                    primeFactors.add(i);
                }
            }
            i++;
        }
        return primeFactors;
    }

    public static boolean isPrime(int i){
        int count = 1;
        int j = 2;
        while (j < i){
            if (i % j == 0){
                count++;
            }
            j++;
        }
        return count <= 1;
    }

    /*
     *   implement a function that return a list of words in a given string
     *   lecture 6 page 30
     */
    public static List<String> extractWord(String line) {
        ArrayList<String> words = new ArrayList<>();
        Pattern pattern = Pattern.compile("[a-zA-Z]*");
        Matcher matcher = pattern.matcher(line);
        while (matcher.find()){
            String word = matcher.group();
            if (!word.equals("") && !word.equals(" ")){
                words.add(word);
            }
        }
        return words;
    }
}
