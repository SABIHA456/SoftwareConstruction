/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author Sabiha Sultan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter Balance for your account:");
        Scanner input = new Scanner(System.in);
        
        float Capital = input.nextFloat();
        
        //12 means 12 %
        BalanceAccount ABC = new BalanceAccount(Capital,12);
        ABC.incrementMonth();
        ABC.display_Info();
        ABC.calculate_Intrest_amount();
        ABC.display_Info();
        System.out.println(ABC.getBalance());
        System.out.println(ABC.getMonthlyIntrestrate());
        System.out.println(ABC.getYearlyIntrestrate());
        ABC.deposit(200);
        ABC.withdraw(500);
      
    }
    
}
