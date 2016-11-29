/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.Scanner;

/**
 *
 * @author 1
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /*    //выводим числа от 1000 до 1100 с шагом +3
for (int i = 1000; i <= 1100; i = i + 3) {
  System.out.print(i + " ");
}
}*/
        
 /*    int counter = 0; //выводим 10 первых чисел начиная с 0 (с шагом -5)
        for (int i = 0; i <= 1000000; i = i-5) {
            counter++;
            System.out.println(i + " Кол-во " + counter);
            if (counter >= 10) {
                break;
            }
        }*/
 
 /* for (int i = 90; i >= -50; i = i - 5) {   //выводим числа от 90 до -50 без учета нуля
        if (i == 0) {
                continue; 
        }
        System.out.println(i + " ");
        }*/
 
 /* int n; //находим факториал числа
        do {
            Scanner scan = new Scanner(System.in);
            System.out.print("Введите факториал натурально числа n : ");
            n = scan.nextInt();
            int result = 1;
            for (int i = 2; i <= n; i++) {
                result *= i;
            }
            System.out.println(result);
            if (n == 0 || n == 1) {
                System.out.println(result);
            }
            if (n < 0) {
                System.out.println("Вы ввели отрицательный факториал!");
            }
        } while (n < 0);
        {
            System.out.println("Конец");
        } */
 
 /*for (int i = 1; i <= 99; i++) {
            System.out.println(i + " ");
        }*/
 /* int i = 0;
        while (i < 100); {                        //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                    System.out.print(i + " ");
        }*/
 
 /* Scanner sc = new Scanner(System.in);    //возводим число в степень
        System.out.print("Введите число: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.print("Введите степень: ");
        int n = Integer.parseInt(sc.nextLine());

        int j = 1;
        for (int i = 0; i < n; i++) {
            j *= x;
        }
        System.out.println(j);*/
 
 /* int n=8; //проверяем четное или нечетное число
 if (n%2 == 0){
        System.out.println("Число четное");
 }
        else {
     System.out.println("Число нечетное");}*/
 
 double m=2.5;   //находим ближайшее к 10 число
 double n=9.4;
 int a=10;
 double b=Math.abs(a-m);
 double c=Math.abs(a-n);
 if (b==c){
     System.out.println("Оба числа равноотдаленны от" + a);
      }
 if (b>c){
     System.out.println("Число " + n + " находится ближе к числу " + a);
 }
 else {
     System.out.println("Число " + m + " находится ближе к числу " + a);
 }
    }
}
