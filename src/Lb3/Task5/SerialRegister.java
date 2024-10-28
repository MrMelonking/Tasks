package Lb3.Task5;

public class SerialRegister {
    private int[] registers;
    private int size;

    public SerialRegister(int size) {
        this.size = size;
        this.registers = new int[size];
    }

    public void setInput(String input) {
        for (int i = 0; i < size; i++) {
            registers[i] = input.charAt(i) - '0';
        }
    }

    public String shiftRight() {
        int temp = registers[0];
        for (int i = 0; i < size - 1; i++) {
            registers[i] = registers[i + 1];
        }
        registers[size - 1] = temp;
        return getOutput();
    }

    public String getOutput() {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < size; i++) {
            output.append(registers[i]);
        }
        return output.toString();
    }
}
