package org.obs.javaprograms;

public class EvenNumbers {

    public void evenNumbersPrint(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        EvenNumbers evennumbers = new EvenNumbers();
        evennumbers.evenNumbersPrint(20);
    }
}
