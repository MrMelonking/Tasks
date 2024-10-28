package Lb3.Task5;

public class JohnsonCounter {
    private int[] registers;
    private int size;

    public JohnsonCounter(int size) {
        this.size = size;
        this.registers = new int[size];
        for (int i = 0; i < size; i++) {
            registers[i] = 0;
        }
    }

    public void increment() {
        int temp = registers[0];
        for (int i = 0; i < size - 1; i++) {
            registers[i] = registers[i + 1];
        }
        registers[size - 1] = temp;
        registers[0] = 1 - registers[0];
    }

    public String getCount() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < size; i++) {
            output.append(registers[i]);
        }
        return output.toString();
    }
}
