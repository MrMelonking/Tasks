package Lb3.Task5;


import java.util.Arrays;

public class ParallelRegister {
    private int[] registers;
    private int size;

    public ParallelRegister(int size) {
        this.size = size;
        this.registers = new int[size];
    }

    public void setInput(int[] input) {
        for (int i = 0; i < size; i++) {
            registers[i] = input[i];
        }
    }

    public int shiftRight() {
        int temp = registers[0];
        for (int i = 0; i < size - 1; i++) {
            registers[i] = registers[i + 1];
        }
        registers[size - 1] = temp;
        return registers[0];
    }

}
