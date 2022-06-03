package com.company;
import java.util.Scanner;

class Roslina {
    public int dlugosc = 1;
    public Roslina (int dlugosc) {
        this.dlugosc=dlugosc;
    }
//    public rosnij(int dlugosc > 0){
//        int nowyWzrost2;
//        nowyWzrost2=dlugosc+
//    }
    public int rosnijDuzo(Roslina y, int a){
        if (a>0) {
            Scanner zadanyParametr2 = new Scanner(System.in);
            int c = zadanyParametr2.nextInt();
            int nowyWzrost2;
            nowyWzrost2=y.dlugosc+a;
            return nowyWzrost2;
        }
        return a;
    }
//    public pokaz(){
//        System.out.println();
//        return ;
//    }
}

class Zwierzak {
    Scanner zadanyParametr = new Scanner(System.in);

    public int zjedz(Roslina x, int b){
        int nowyWzrost;
        nowyWzrost=x.dlugosc+b;
        return nowyWzrost;
    }
}
public class RoślinaZadDom {
    public static void main(String [] args) {
        Zwierzak zwie = new Zwierzak();
    }
}

