package Lb3.Task5;




public class Task5 {
    public static void main(String[] args) {

        SerialRegister serial = new SerialRegister(4);
        serial.setInput("1011");
        System.out.println("Серійний регістр: " + serial.shiftRight());

        ParallelRegister parallel = new ParallelRegister(4);
        parallel.setInput(new int[] {1, 1, 1, 1});
        System.out.println("Паралельний регістр: " + parallel.shiftRight());

        BinaryCounter counter = new BinaryCounter(4);
        for (int i = 0; i < 16; i++) {
            System.out.println("Двійковий лічильник: " + counter.getCount());
            counter.increment();
        }

        JohnsonCounter johnsonCounter = new JohnsonCounter(4);
        for (int i = 0; i < 16; i++) {
            System.out.println("Лічильник Джонсона: " + johnsonCounter.getCount());
            johnsonCounter.increment();
        }
    }
}

