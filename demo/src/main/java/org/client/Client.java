package org.client;

import org.springframework.boot.SpringApplication;

import com.example.demo.DemoApplication;

import org.application.GSNormalAccount;
import org.application.GSPrimeAccount;
import org.application.GSShopFactory;
import org.framework.NormalAccount;
import org.framework.PrimeAccount;
import org.framework.ShopFactory;
import java.util.*;

public class Client {

	public static void main(String[] args) {
		SpringApplication.run(Client.class, args);
		System.out.println("************WELCOME TO Kajol's NEW SHOPPING APP****************");
				

		ShopFactory s=new GSShopFactory();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many prime account details you want to add?");
		int n = sc.nextInt();
		
		for(int i = 0;i< n;i++) {
			System.out.println("\n-----Enter prime account detail for user:"+(i+1)+"------\n");
			
			System.out.println("Enter  Account Number");
			int accNo = sc.nextInt();
			
			System.out.println("Enter Account Name");
			String accName= sc.next();
			
			System.out.println("Enter  Account Charges");
			float charges = sc.nextFloat();
			
			PrimeAccount p=new GSPrimeAccount(accNo, accName, charges, true);
			System.out.println("\n #########PRIME ACCOUNT DETAILS For User "+(i+1)+" #########");
			p.bookProduct(p.getCharges());
		
		}
		
		System.out.println("\n How many non-prime account details you want to add?");
		int nonPrimeAccs = sc.nextInt();
		
		for(int i = 0;i<nonPrimeAccs;i++) {
		
			System.out.println("\n------Enter non prime account details------\n");
			System.out.println("Enter  Account Number");
			int accNo2 = sc.nextInt();
			
			System.out.println("Enter Account Name");
			String accName2= sc.next();
			
			System.out.println("Enetr the account charges");
			float charges2 = sc.nextFloat();
			
			System.out.println("Enetr the  delivery charges");
			float deliveryCharges = sc.nextFloat();
	
			NormalAccount noramlAcc=new GSNormalAccount(accNo2,accName2,charges2 , deliveryCharges );
	
			System.out.println("\n****NORMAL ACCOUNT DETAILS*****");
			noramlAcc.bookProduct(noramlAcc.getCharges());
		}



	}
	
}
