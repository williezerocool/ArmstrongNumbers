/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrongnumbers;

/**
 *
 * @author kendrabooker
 */
public class ArmstrongNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
     {
        int n, b, sum;
        sum = 0;
        
        for(int i = 100; i <= 1000; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
           if(sum == i)
            {
                System.out.println(i);
            }
            sum = 0;
        }
      
     
        
       
        }
    }
