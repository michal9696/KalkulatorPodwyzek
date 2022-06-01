package com.company;

public class SilniaBezSkanera {
    public static void main(String[] args){
        Silniabezskanera(3);
    }
    public static void Silniabezskanera(int n){
        long silnia = 1;
        for (int i=1;i<=n;i++){
            silnia=silnia*i;
            System.out.println(i+" ..."+silnia);
        }
        System.out.println("Silnia z "+n+" wynosi "+silnia);
    }
}
