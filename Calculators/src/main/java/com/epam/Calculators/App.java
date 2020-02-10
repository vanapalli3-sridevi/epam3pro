package com.epam.Calculators;

/**
 * Hello world!
 *
 */
import java.io.*;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	    Scanner sc = new Scanner(System.in);
    	    int op=sc.nextInt();
    	    switch(op){
    	      case 1:
    	       System.out.println("Enter first number:");
    	       int a=sc.nextInt();
    	        System.out.println("Enter second number:");
    	       int b=sc.nextInt();
    	        Add a0=new Add(a,b);
    	        System.out.print("result :"+a0.addSum());
    	        break;
    	      case 2:
    	       System.out.println("Enter first number:");
    	        int a1=sc.nextInt();
    	         System.out.println("Enter second number:");
    	        int b1=sc.nextInt();
    	        Sub s=new Sub(a1,b1);
    	        System.out.print("result :"+s.sub());
    	        break;
    	      case 3:
    	        System.out.println("Enter first number:");
    	        int a2=sc.nextInt();
    	         System.out.println("Enter second number:");
    	        int b2=sc.nextInt();
    	         Mul m=new Mul(a2,b2);
    	        System.out.print("result :"+m.mul());
    	        break;
    	      case 4:
    	        System.out.println("Enter first number:");
    	        double a3=sc.nextDouble();
    	        System.out.println("Enter second number:");
    	        double b3=sc.nextDouble();
    	        if(b3==0){
    	            System.out.print("cannot be divided");
    	        }else{
    	            Div d=new Div(a3,b3);
    	            System.out.print("result :"+d.div());
    	        }
    	        break;
    	      default:
    	        System.out.print("Wrong input");
    	        return;
    	    }
    }
}
