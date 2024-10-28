package Lb3.Task5;

public class BinaryCounter {
    private int[] registers;
    private int size;

    public BinaryCounter(int size) {
        this.size = size;
        this.registers = new int[size];
    }

    public void increment() {
        int carry = 1;
        for (int i = size - 1; i >= 0; i--) {
            int sum = registers[i] + carry;
            registers[i] = sum % 2;
            carry = sum / 2;
        }
    }

    public String getCount() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < size; i++) {
            output.append(registers[i]);
        }
        return output.toString();
    }
}

