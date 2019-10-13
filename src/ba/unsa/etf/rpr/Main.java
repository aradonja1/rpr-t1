package ba.unsa.etf.rpr;
import  java.util.Date;
import  java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
    System.out.println("Unesite broj n: ");
    Scanner ulaz = new Scanner(System.in);
    int n = ulaz.nextInt();
    for(int i = 1; i <= n; i++)
        if(i % SumaCifara(i) == 0) System.out.println(" " +i);
    }

public static int SumaCifara(int broj) {
        int suma = 0;
        while(broj != 0) {
            suma = suma + broj % 10;
            broj = broj / 10;
        }
        return suma;
}

}
