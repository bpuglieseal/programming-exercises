package Excercise8;

public class PalindromicNumber {
    private long number;
    private int digitCount;

    PalindromicNumber(long number) {
        this.number = number;
        this.digitCount = 0;

        long c = number;
        for (int i = 10; c != 0;) {
            this.digitCount++;
            c /= 10;
        }
    }

    PalindromicNumber() {

    }

    public void setNumber(long number) {
        this.number = number;
        this.digitCount = 0;

        long c = number;
        for (int i = 10; c != 0;) {
            this.digitCount++;
            c /= 10;
        }
    }

    public int getDigitCount() {
        return digitCount;
    }

    public long getNumber() {
        return number;
    }

    public long digitAtPositionN (int n) {
        return (long) ((this.number / (Math.pow(10, this.digitCount - n))) % 10);
    }

    public boolean isPalindromic () {
        for (int i = this.digitCount; i > 0; i--) {
            if (this.digitAtPositionN(i) != this.digitAtPositionN(this.digitCount - (i - 1))) return false;
        }

        return true;
    }
}
