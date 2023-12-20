package app;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        getOutput(getResult(getData()));

    }

    private static Lights getData() {
        Scanner light = new Scanner(System.in);
        System.out.println("Please input colour you're seeing " +
                "at the moment? ");
        getValues();
        return Lights.valueOf(light.nextLine().trim().toUpperCase());
    }

    private static void getValues() {
        for (Lights light : Lights.values()) {
            System.out.println(light.name() + " ");
        }
    }


    private static String getResult(Lights light) {
        switch (light) {
            case RED:
                return "Stay!";
            case YELLOW:
                return "Be ready to go!";
            case GREEN:
                return "GO!";
            default:
                return "Wrong Input!";
        }
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}