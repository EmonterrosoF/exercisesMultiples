package com.alreves;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class App {
    public static void main(String[] args) {
        // System.out.println(reverse("hola mundo"));

        // arrays();

        // arrayBidimensional();

        // vectores();

        // arrayList();

        // secondArrayList();

        // try {
        // dividePorCero();
        // } catch (ArithmeticException e) {
        // System.out.println(e.getMessage());
        // System.out.println("esto no puede hacerse");
        // } finally {
        // System.out.println("demo de codigo");
        // }
        
        try {
            InputStream fichero = new FileInputStream("C:\\Users\\edras\\Desktop\\example.txt");
            PrintStream fileOut = new PrintStream("C:\\Users\\edras\\Desktop\\nuevo.txt");
            file(fichero,fileOut);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static String reverse(String texto) {
        String result = "";
        for (int i = texto.length() - 1; i >= 0; i--) {
            result += texto.charAt(i);
        }
        return result;
    }

    static void arrays() {
        String[] letters = { "first", "second", "third", "fourth", "fifth", "six", "seven" };

        for (String letter : letters) {
            System.out.println(letter);
        }
    }

    static void arrayBidimensional() {
        Integer[][] number = new Integer[5][3];
        int llenador = 1;
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[1].length; j++) {
                number[i][j] = llenador;
                llenador++;
            }
        }

        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number[1].length; j++) {
                System.out.println("posicion i: " + i + " " + "posicion j: " + j + " " + number[i][j]);
            }
        }

    }

    static void vectores() {
        Vector<String> vector = new Vector<>();

        vector.add("first");
        vector.add("second");
        vector.add("third");
        vector.add("fourth");
        vector.add("fifth");

        for (int i = 0; i < vector.size(); i++) {
            if (i == 1) {
                vector.remove(i);
                continue;
            }
            System.out.println(vector.get(i));
        }

    }

    static void arrayList() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");

        List<String> list2 = new LinkedList<>();

        list2.addAll(list);

        for (String word : list) {
            System.out.println("desde ArrayList " + word);

        }

        for (String word : list2) {
            System.out.println("desde LinkedList " + word);

        }

    }

    static void secondArrayList() {
        List<Integer> listNumber = new ArrayList<>();

        for (int i = 1; i < 11; i++) {
            listNumber.add(i);
        }

        for (int i = 0; i < listNumber.size(); i++) {
            if (i % 2 == 0) {
                listNumber.remove(i);
                continue;
            }

            System.out.println(listNumber.get(i));

        }

    }

    static int dividePorCero() {

        return 5 / 0;

    }

    static void file(InputStream fileIn, PrintStream fileOut) throws IOException {
        try {

            byte[] data = fileIn.readAllBytes();
            for (byte dato : data) {
                System.out.println((char) dato);
            }
            fileOut.write(data);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
