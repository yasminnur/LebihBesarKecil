package lebihbesar;

import java.util.Scanner;

public class LebihBesar {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka pertama : ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int b = input.nextInt();
        
        if (a>b){
            System.out.println("Nilai terbesar = "+a);
        }else{
            System.out.println("Nilai terbesar = "+b);
        }
       
        
    }
    
}
