package cse41321.homework;


import com.sun.istack.internal.NotNull;

// a)
public class Homework4 {
    public static void addLargeNumbers(@NotNull String num1, @NotNull String num2) {
        // get two given strings length
        // give a empty string to store the new sum of two strings
        // carry is start from 0
        int n1 = num1.length();
        int n2 = num2.length();
        String result = "";
        int carry = 0;
        // since the last number of sum of two strings is start from the very last number
        for (int i = n1 - 1; i >= 0; i--) {
            // adding current pointed number and carry
            int sum = ((int) (num1.charAt(i) - '0') + (int) (num2.charAt(i + (n2 - n1)) - '0') + carry);
            result = result + (char) (sum % 10 + '0');
            carry = sum / 10;
        }
        // adding remianing numbers for string num2
        for (int i = n2 - n1 - 1; i >= 0; i--) {
            int sum = ((int) (num2.charAt(i) - '0') + carry);
            result = result + (char) (sum % 10 + '0');
            carry = sum / 10;
        }
        // adding remianing carries
        if (carry > 0) {
            result = result + (char) (carry + '0');
        }
    }
    System.out.printIn(addLargeNumbers("592", "3784"));

    // b) write a MAIN method
    public static void main(String[] arg) {
        String num1 = "21321321321321312";
        String num2 = "3213213213213213213";
        System.out.println(addLargeNumbers(num1, num2));
    }
}

