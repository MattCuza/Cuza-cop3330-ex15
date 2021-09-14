/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Matthew Cuza
 */
package org.example;
import java.util.*;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        String pass = "Abc123";
        String user = "Abc123";

        System.out.println( "What is the username: " );
        String username = sc.nextLine();

        System.out.println( "What is the password: " );
        String password = sc.nextLine();

        if(Objects.equals(pass,password) && Objects.equals(user,username) ){
            System.out.println( "Welcome!" );
        }
        else
        {
            System.out.println( "Incorrect username or password." );
        }
    }
}
