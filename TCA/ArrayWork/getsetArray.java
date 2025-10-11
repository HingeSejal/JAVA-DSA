package TCA.ArrayWork;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Student_pgm {
    
    private int rno;
    private String name;
    private double per;
    
    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }

    void display() {
        System.out.println("------------display content----------");
        System.out.println("Roll No: " + rno);
        System.out.println("Name: " + name);
        System.out.println("Percent: " + per);
    }
}

public class getsetArray {
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("How many students:");
        int n = Integer.parseInt(br.readLine());
        
        Student_pgm[] S = new Student_pgm[n];
        
        // Input loop
        for (int i = 0; i < S.length; i++) {
            System.out.println("\nEnter details for student " + (i + 1));
            
            System.out.print("Enter the Roll No: ");
            int r = Integer.parseInt(br.readLine());
            
            System.out.print("Enter the Name: ");
            String nm = br.readLine();
            
            System.out.print("Enter Percent: ");
            double p = Double.parseDouble(br.readLine());
            
            // create object & set values
            S[i] = new Student_pgm();
            S[i].setRno(r);
            S[i].setName(nm);
            S[i].setPer(p);
        }
        
        // Display loop
        System.out.println("\n===== Student Details =====");
        for (int i = 0; i < S.length; i++) {
            S[i].display();
        }
    }
}
