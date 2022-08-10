package com.wavemaker.assignment;
import com.wavemaker.assignment.MainDB;
import com.wavemaker.assignment.MainMemory;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        System.out.println("Main Program");
        System.out.println("Please Enter the mode of execution:\n1 for JDBC\n2 for InMemory");
        Scanner user_input = new Scanner(System.in);
        int mode_of_exec = Integer.parseInt(user_input.next());
        if(mode_of_exec == 1){
            new MainDB().execute();
        }
        else{
            new MainMemory().execute();
        }
    }
}
