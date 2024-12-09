package Excercise3;

public class NumberStatistics {
    int[] array;

    NumberStatistics() {
        this.array = new int[0];
    }

    public void showStatistics () {
        if (this.array.length == 0) {
            System.out.println("Average: 0");
            return;
        };

        int average = 0;
        for (int i = 0; i < this.array.length; i++) average += this.array[i];
        System.out.format("Average: %d", average / this.array.length);
    }

    public void addNumber(int number) {
        int[] newArray = new int[this.array.length + 1];
        for (int i = 0; i < this.array.length; i++) newArray[i] = this.array[i];
        newArray[newArray.length - 1] = number;
        this.array = newArray;
    }
}
