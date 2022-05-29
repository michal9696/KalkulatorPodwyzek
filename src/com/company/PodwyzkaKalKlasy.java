package com.company;
class Pracownik{
    double pensja;
    String imiepracownika;
    String nazwiskopracownika;
    public Pracownik(double pensja, String imiepracownika, String nazwiskopracownika){
        this.imiepracownika=imiepracownika;
        this.nazwiskopracownika=nazwiskopracownika;
        this.pensja=pensja;
    }
}
class Kalkulator {
    public double podwyzka(Pracownik praca) {
        double pod;
        pod = praca.pensja + 1000.00;
        return pod;
    }
}
public class PodwyzkaKalKlasy {
    public static void main(String[] args) {
        Pracownik praca1 = new Pracownik(345.44, "Janek", "Zimowski");
        Kalkulator kalku = new Kalkulator();
        System.out.println(kalku.podwyzka(praca1));
    }
}



