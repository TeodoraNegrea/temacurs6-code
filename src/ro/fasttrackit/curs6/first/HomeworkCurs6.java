package ro.fasttrackit.curs6.first;

import java.util.Random;
import java.util.Scanner;

public class HomeworkCurs6 {
    public static void main(String[] args) {
        int suma = sumNumbers();
        System.out.println(suma);
        int nr_impare = oddNumbers();
        System.out.println(nr_impare);
        System.out.println(bigNumbers());
        donationsFunction();
       donationFunction2();
        String propozitii = " Ana are mere . Gabi este nervos . Teodora nu plateste ";
        phrasesFunction(propozitii);
    }

    static int sumNumbers() {
        int[] numbers = {10, 5, 24, 16, 35, 13};
        int s = 0;
        for (int i = 0; i < numbers.length; i++) {
            s = s + numbers[i];
        }
        return s;
    }

    static int oddNumbers() {
        int[] numbers = {21, 32, 15, 22, 6, 8, 53};
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 1) {
                counter++;
            }
        }
        return counter;
    }

    static int bigNumbers() {
        int[] numbers = {34, 21, 5, 9, 10, 67};
        int b=0;
        int a = 30;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] > a) {
                b =numbers[i];}
            }
       return b;
    }
   static void donationsFunction() {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        int target=0;
        int suma=0;
        boolean exit = false;

       System.out.println("Introduceti suma dorita : ");
       target = console.nextInt();
        do {
            int donatie = random.nextInt(100);
            if (suma <= target) {

                System.out.print("Mai aveti putin. Trageti mai tare");
                suma=suma+donatie;
                System.out.println(suma);

            } else {
                System.out.println("Felicitari! Ati ajuns la suma dorita!");
                exit=true;
            };
        }while (!exit) ;
    }
     static void donationFunction2(){
         Scanner console = new Scanner(System.in);
         Random random = new Random();
         int numarDonatii =0;
         int target=0;
         int suma=0;
         int donatii=0;
         boolean exit = false;

         System.out.println("Introduceti suma dorita : ");
         target = console.nextInt();
         System.out.println("Introduceti numar maxim de donatii : ");
         numarDonatii = console.nextInt();
         do {
             int donatie = random.nextInt(100);
             donatii++;
             if ((suma <= target) &&(donatii<=numarDonatii)){

                 System.out.print("Mai aveti putin. Trageti mai tare");
                 suma=suma+donatie;
                 System.out.println(suma);


             } else {
                 System.out.println("Campanie de donatii inchisa!");
                 exit=true;
             };
         }while (!exit) ;

     }
     static void phrasesFunction(String propozitii){
         String[] prop = propozitii.trim().split(" . ");
         for (int i=0;i<prop.length;i++){
             System.out.println(prop[i]);
         }
     }
    }
