package Excercise8;

public class Main {
    public static void main(String[] args) {
        PalindromicNumber pn1 = new PalindromicNumber(131);
        PalindromicNumber pn2 = new PalindromicNumber(9102019);
        PalindromicNumber pn3 = new PalindromicNumber(456456165);

        if (pn1.isPalindromic()) {
            System.out.format("%d is palindromic\n", pn1.getNumber());
        } else {
            System.out.format("%d is not palindromic\n", pn1.getNumber());
        }

        if (pn2.isPalindromic()) {
            System.out.format("%d is palindromic\n", pn2.getNumber());
        } else {
            System.out.format("%d is not palindromic\n", pn2.getNumber());
        }

        if (pn3.isPalindromic()) {
            System.out.format("%d is palindromic\n", pn3.getNumber());
        } else {
            System.out.format("%d is not palindromic\n", pn3.getNumber());
        }
    }
}
