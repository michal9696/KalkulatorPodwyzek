package com.company;
import java.util.*;

public class Silnia { //kod nie fajnie napisany, powinna byc metoda oblicz silnie oprócz main
    public static void main(String[] args) {
        Scanner silny = new Scanner(System.in);
        System.out.println("Podaj liczbe silni");
        int n = silny.nextInt();
        silny.close();//nie potrzebny bo nie ma wielu wątków
        long silnia=1;
        for (int i=1;i<=n;i++) { //silnia obliczana iteracyjnie
            silnia=silnia*i;
            System.out.println(i+".. "+silnia);
        }
        System.out.println("Silnia z "+n+" wynosi "+silnia);
    }
}
