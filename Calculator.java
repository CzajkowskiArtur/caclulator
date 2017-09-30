package pl.sdacademy.Math;

import java.util.Scanner;


public class Calculator implements Actions {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbę: ");
        double a = scanner.nextDouble();
        System.out.println("Witaj w kalkulatorze, co chcesz wykonac? Wpisz: + lub - lub * lub / lub sqrt lub ^");
        String test;
      Scanner odczyt = new Scanner(System.in);
        test = odczyt.nextLine();

        if (test.equals("+"))
            c.add(a);
        else if (test.equals("-"))
            c.subtract(a);
        else if (test.equals("*"))
            c.multiplication(a);
        else if (test.equals("/"))
            c.division(a);
        else if (test.equals("sqrt"))
            c.sqrt(a);
        else if (test.equals("^"))
            c.pot(a);
        else
            System.out.println("Sorry nie znam takiej opearcji");
    }

    @Override
    public void add(double x) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj drugą liczbę: ");
        double y = scanner.nextDouble();
        System.out.println(x + y);
    }

    @Override
    public void subtract(double x) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj drugą liczbę: ");
        double y = scanner.nextDouble();
        System.out.println(x - y);
    }

    @Override
    public void multiplication(double x) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj drugą liczbę: ");
        double y = scanner.nextDouble();
        System.out.println(x * y);
    }

    @Override
    public void division(double x) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj drugą liczbę: ");
        double y = scanner.nextDouble();
        if (y == 0) {
            System.out.println("pamiętaj cholero nigdy nie dziel przez 0");
        }
        System.out.println(x / y);

    }

    @Override
    public void sqrt(double x) {
        if (x < 0) {
            System.out.println("Nie mozna wykoanc operacji");
        } else
            System.out.println(Math.sqrt(x));

    }

    @Override
    public void pot(double x) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj drugą liczbę: ");
        double y = scanner.nextDouble();
        if (y < 0) {
            System.out.println("Nie mozna wykonac operacji");
        } else
            System.out.println(Math.pow(x, y));
    }
}



