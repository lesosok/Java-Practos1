package org.example;
import java.io.FileWriter;  //импорт инструмента для работы с файлами
import java.io.IOException; //импорт для обработки исключения
import java.util.Scanner;   //импорт класса Scanner

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);       //создание объекта Scanner

        System.out.println("Введите имя студента:"); //выводим текст
        String name = read.nextLine();               //вводим текст
        System.out.println("Введите возраст студента:");
        int age = read.nextInt();
        System.out.println("Введите средний балл студента:");
        int grade = read.nextInt();

        FileWriter writer = new FileWriter("C:/Новая папка/students.txt", true); //объявляем FileWriter
        writer.write("Имя студента: " + name + ", возраст студента: " + age + ", средний балл студента: " + grade + "\n");
        // ^ используем FileWriter для записи текста в файл
        writer.close(); //закрываем поток
    }
}