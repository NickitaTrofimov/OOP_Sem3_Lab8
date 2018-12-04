package ru.mirea;

import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(FileReader reader_1 = new FileReader("C:\\Users\\Никита\\test.txt")) {
            int c;
            while ((c = reader_1.read()) != -1){
                System.out.print((char)c);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(FileWriter writer = new FileWriter("C:\\Users\\Никита\\test.txt", false)){
            String text;
            Scanner in = new Scanner(System.in);
            System.out.println(" ");
            System.out.print("Введите предложение для записи в файл: ");
            text = in.nextLine();
            writer.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(FileReader reader = new FileReader("C:\\Users\\Никита\\test.txt")){
            //читаем по символьно
            int c;
            while ((c = reader.read()) != -1){
                System.out.print((char)c);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(FileWriter writer_2 = new FileWriter("C:\\Users\\Никита\\test.txt", true)){
            String text;
            System.out.println(" ");
            Scanner inn = new Scanner(System.in);
            System.out.println("Введите предложение, которое надо дописать: ");
            text = inn.nextLine();
            writer_2.write(text);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(FileReader reader_3 = new FileReader("C:\\Users\\Никита\\test.txt")){
            int c;
            while ((c = reader_3.read()) != -1){
                System.out.print((char)c);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
