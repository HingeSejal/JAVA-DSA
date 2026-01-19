package com.tca;


import java.io.BufferedReader;
import java.io.InputStreamReader;

import com.tca.abstractStaff.FullTImeStaff;
import com.tca.abstractStaff.PartTimeStaff;
import com.tca.abstractStaff.Staff;

public class Demo {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("How many Object you want to create?");
		int n = Integer.parseInt(br.readLine());
		
		Staff ob[] = new Staff[n];
		
		System.out.println("Menu->");
		System.out.println("1 for FullTimeStaff");
		System.out.println("2 for PartTimestaff");
		
		System.out.print("Whats is your choice? :");
		int choice = Integer.parseInt(br.readLine());
		
		switch(choice) {
		case 1: 
		
				for( int i=0; i<n;i++) {
					System.out.println("Name? ");
					String name = br.readLine();
					
					System.out.println("Address? ");
					String address = br.readLine();
					
					System.out.println("Dept? ");
					String dept = br.readLine();
					
					System.out.println("Salary?");
					double salary = Double.parseDouble(br.readLine());
					
					ob[i]= new FullTImeStaff(name,address,dept,salary);
				}

				System.out.println("INFO of Full Time STAFF:");
				for( int i=0; i<n;i++) {		
					ob[i].display();
					System.out.println("----------------------------");
				}
				break;
				
		case 2: 
			
			for( int i=0; i<n;i++) {
				System.out.println("Name? ");
				String name = br.readLine();
				
				System.out.println("Address? ");
				String address = br.readLine();
				
				System.out.println("No_hrs?");
				int no_hrs = Integer.parseInt(br.readLine());

				
				System.out.println("Rate_hrs?");
				int rate_hrs = Integer.parseInt(br.readLine());
				
				ob[i]= new PartTimeStaff(name,address,no_hrs ,rate_hrs);
			}

			System.out.println("INFO of Full Time STAFF:");
			for( int i=0; i<n;i++) {		
				ob[i].display();
				System.out.println("----------------------------");
			}
			break;
		
	default:
		System.out.println("Invalid Choice !!!!!!!!");
		}

	}

}
