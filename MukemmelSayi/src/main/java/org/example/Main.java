package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int deger, sum=0, counter=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        deger = input.nextInt();

        while(counter<deger){
            if(deger%counter==0){
                sum+=counter;
                counter++;
            }else{
                counter++;
            }
        }
        if(sum==deger){
            System.out.println(deger + " bir mükemmel sayıdır.");
        }else{
            System.out.println(deger + " bir mükemmel sayı değildir.");
        }

    }
}