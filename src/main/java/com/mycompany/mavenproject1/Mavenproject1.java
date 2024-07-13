/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author WhyMa
 */
import java.util.Scanner;  // Import the Scanner class

public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Hello World!");    
        
        System.out.println("Enter your User Name");
        String userName = myObj.nextLine();
        System.out.println("Username:" + userName);
        
        System.out.println("Enter your Password");
        String pass = myObj.nextLine();
        System.out.println("password:" + pass);
        
    }
}
