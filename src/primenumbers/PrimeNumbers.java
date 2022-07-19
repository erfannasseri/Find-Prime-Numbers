/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumbers;

import java.util.Scanner;

/**
 *
 * @author Erfan
 */
public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner s = new Scanner (System.in); 
      int c,d;
        System.out.println("شما میتوانید اعداد اول بین بازه دلخواه را پیدا کنید\n برای شروع ابتدای بازه را وارد کنید");
        c = s.nextInt();
        System.out.println("انتهای بازه را وارد کنید");
        d = s.nextInt();
        System.out.println("-----------------------------------");
        primeTOprime(c,d);
    }
    public static boolean PrimeNum (int a){
        boolean P = false;
        if (a==2) {
            P = true;
        }
        for (int i = 2; i < a; i++) {
            int b = a/i;
            if (a%i==0){
                P=false;
                break;
            }else {
                P=true;
            }
        }
        return P;
    }
    
    public static void primeTOprime (int a , int b){
        int counter = 0;
        for(int i=a; i<=b;i++) {
            boolean v = PrimeNum(i);            
            if (v == true) {
                System.out.println(i);
                counter++;
            }    
            
    }
}
}  
