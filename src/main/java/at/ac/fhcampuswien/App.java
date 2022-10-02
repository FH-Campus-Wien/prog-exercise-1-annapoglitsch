package at.ac.fhcampuswien;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        // Deklaration
        char firstZ = 'Z';
        int hexadezimahl = 0xface;
        int dezi = 012;
        long neuerlong = 80L;
        float neuefloat = 44e-1f;
        float neuefloat2 = 5.5f;
        double neuedouble = 8.88e1;
        double neuedouble2 = 99.9;
        int sum;

        // umwandeln zu int
        int intZnew = firstZ;
        int derneuelong = (int) neuerlong;
        int derneuefloat = (int) neuefloat;
        int derneuefloat2 = (int) neuefloat2;
        int derneuedouble = (int) neuedouble;
        int derneuedouble2 = (int) neuedouble2;

        //Methode - Addition
        sum = intZnew + hexadezimahl + dezi + derneuelong + derneuefloat + derneuefloat2 + derneuedouble + derneuedouble2;
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        //Scanner
        Scanner firstscan = new Scanner(System.in);

        int firstnumber = firstscan.nextInt();
        int secondnumber = firstscan.nextInt();

        //Ergebnis - Addition
        System.out.println(firstnumber + secondnumber);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        //Scanner
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();


        System.out.print("Before Swap:" + System.lineSeparator() + "x: y: After Swap:" + System.lineSeparator());

        //Ergebnis
        System.out.print("x: " + y1 + System.lineSeparator());
        System.out.print("y: " + x1 + System.lineSeparator());


    }

    //todo Task 6
    public void compareTwoNumbers() {
        // input your solution here
        // Scanner
        Scanner nx = new Scanner(System.in);

        //Deklaration
        int n1 = nx.nextInt();
        int n2 = nx.nextInt();

        //Definition wann eine Zahl größer ist
        if (n1 > n2) {
            System.out.println("n1: n2: n1 > n2");
        }
            else if (n2 > n1) {
                System.out.println("n1: n2: n2 > n1");
            }
         else {
            System.out.println("n1: n2: n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        //Scanner
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int einnahmen = scan1.nextInt();

        //Methode-Ergebnis
        if (einnahmen < 0 || einnahmen >= 100000) {
            System.out.println("Invalid Revenue");
            }
            if (einnahmen >= 0 && einnahmen < 20000) {
                System.out.println("Poor Sales Revenue");
            }
            if (einnahmen >= 20000 && einnahmen < 50000) {
                System.out.println("Average Sales Revenue");
            }
            if (einnahmen >= 50000 && einnahmen < 80000) {
                System.out.println("Good Sales Revenue");
            }
            if (einnahmen >= 80000 && einnahmen < 100000) {
                System.out.println("Excellent Sales Revenue");
            }
        }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        //Scanner
        Scanner scan1 = new Scanner(System.in);

        System.out.print("Enter CommissionClass: ");

        //Switch-Methode, einzelne Situationen/Fälle
        int zahl = scan1.nextInt();
         double zahl2;

        switch (zahl) {
            case 1:
                zahl2 = 0.01;
                break;
            case 2:
                zahl2 = 0.02;
                break;
            case 3:
                zahl2 = 0.03;
                break;
            case 4:
                zahl2 = 0.04;
               break;
            default: zahl2 = 0;
        }
        //Ergebnis
        System.out.println("Your Commission Rate was set to " + zahl2);
    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        //Scanner und Deklaration
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Year: ");
        int zahl = scan1.nextInt();

        //Definition Schaltjahr
        if (zahl%100 == 0 && zahl%4 == 0 && zahl%400 == 0) {
              System.out.println("Leapyear");
          } else {
              System.out.println("Not a Leapyear");
          }

    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        //Scanner
        Scanner scanner= new Scanner(System.in);
        System.out.print("Number: ");
        int zahl = scanner.nextInt();

        //Einzelne Stellen erhalten und addieren
        int einerstelle = zahl%10;
        int zehnerstelle = (zahl/10)%10;
        int hunderterstelle = (zahl/100)%10;

        int umgekehrtezahl = (einerstelle * 100) + (zehnerstelle * 10) + hunderterstelle;

        //Ergebnis
        System.out.println(umgekehrtezahl);
    }



    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}