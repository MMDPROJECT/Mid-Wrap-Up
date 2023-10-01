public class Lecture4Exercises {
    /*
     *   implement a function that returns factorial of given n
     *   lecture 4 page 15
     */
    public long factorial(int n) {
        if (n == 0){
            return 1;
        }
        else{
            return factorial(n - 1) * n;
        }
    }

    /*
     *   implement a function that return nth number of fibonacci series
     *   the series -> 1, 1, 2, 3, 5, 8, ...
     *   lecture 4 page 19
     */
    public long fibonacci(int n) {
        if (n == 1 || n == 2){
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /*
     *   implement a function that return reverse of a given word
     *   lecture 4 page 19
     */
    public String reverse(String word) {
        StringBuilder temp = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--){
            temp.append(word.charAt(i));
        }
        return temp.toString();
    }

    /*
     *   implement a function that returns true if the given line is
     *   palindrome and false if it is not palindrome.
     *   palindrome is like 'wow', 'never odd or even', 'Wow'
     *   lecture 4 page 19
     */
    public boolean isPalindrome(String line) {
        line = line.replaceAll("\s", "");
        return line.equalsIgnoreCase(reverse(line));
    }

    /*
     *   implement a function which computes the dot plot of 2 given
     *   string. dot plot of hello and ali is:
     *       h e l l o
     *   h   *
     *   e     *
     *   l       * *
     *   l       * *
     *   o           *
     *   lecture 4 page 26
     */
    public char[][] dotPlot(String str1, String str2) {
        char[][] dotPlot = new char[str1.length()][];
        for (int i = 0; i < dotPlot.length; i++){
            dotPlot[i] = new char[str2.length()];
        }
        for (int i = 0; i < dotPlot.length; i++){
            for (int j = 0; j < dotPlot[i].length; j++){
                dotPlot[i][j] = ' ';
                if (str1.charAt(i) == str2.charAt(j)){
                    dotPlot[i][j] = '*';
                }
            }
        }
        return dotPlot;
    }
}
