/*
 * UCF COP3330 Fall 2021 Assignment 2 Solution
 * Copyright 2021 Maggie Perry
 */
/*
Password Validation

Set string array of usernames and passwords
2d array [3][2]
prompt for user name
prompt for password
 if input.Equals(storedPassword)
    welcome
   else
    go away
    

 */
package exercise15;

import java.util.Scanner;

public class Solution15 {
    private static final Scanner sc = new Scanner(System.in);
    static String[][] userPasswords;

    public static void main(String[] args) {
        userPasswords = new String[][]{
                {"Admin", "1234$Qwerty"},
                {"Brian", "Password"},
                {"Ashley", "TYU%^&567"},
                {"Dr. Struggle", "YummStudentTears"}
        };

        System.out.print("Username: ");
        String userName = sc.nextLine();
        checkPassword(getUserRow(userName));
    }
    private static void checkPassword(int row) {
        if(row<=userPasswords.length){
            System.out.print("Password: ");
            String password = sc.nextLine();
            if(password.equals(userPasswords[row][1])){
                System.out.printf("Welcome %s!",userPasswords[row][0]);
            }else{
                System.out.println("IMPOSTER!");
            }
        }
    }
    private static int getUserRow(String userName) {
        int row = userPasswords.length + 1;
        for(int i=0;i<userPasswords.length;i++){
            if(userPasswords[i][0].equals(userName)){
                return i;
                }
            }
        System.out.println("Invalid username.");
        return row;
        }



}