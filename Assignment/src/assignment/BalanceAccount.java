/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @Sabiha Sultan
 */
public class BalanceAccount {
    int no_of_months=0;
    float intrest;
    float balance;
    float Yearly_intrest_rate;
    float Monthly_intrest_rate;
    
        //Constructor
    BalanceAccount(float balance,float intrest)
    {
        this.Yearly_intrest_rate = intrest;
        this.balance = balance;
        Monthly_intrest_rate = Yearly_intrest_rate/12;
    }
        void setbalance(float balance)
        {
            this.balance=balance;
        }
        void setYearly_intrest_rate(float intrest)
        {
            this.Yearly_intrest_rate = intrest;
            this.Monthly_intrest_rate = intrest/12;
        }
    
    float getBalance()
    {
        return balance;
    }

        float getYearlyIntrestrate()
    {
        return Yearly_intrest_rate;
    }
    
        float getMonthlyIntrestrate()
    {
        return Monthly_intrest_rate;
    }
        
      void withdraw(float withdraw_amount)
      {
          balance-=withdraw_amount;
      }
      void deposit(float deposit_amount)
      {
          balance += deposit_amount; 
      }
      void display_Info()
      {
          System.out.println("No of months passed:"+no_of_months);
          System.out.println("No of years passed:"+no_of_months/12);
          System.out.println("Year intrest rate = "+Yearly_intrest_rate);
          System.out.println("Monthly intrest rate"+Monthly_intrest_rate);
          System.out.println("Intrest:"+intrest);
      }
       void calculate_Intrest_amount()
       {  
           intrest = balance*this.Monthly_intrest_rate*this.no_of_months/100;
       }
       void incrementMonth()
       {
           this.no_of_months+=1;
       }
    
}
