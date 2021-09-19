import java.util.Scanner;

public class testSolution15 {
    private static final Scanner sc = new Scanner(System.in);
    static String[][] userPasswords;

    public static void main(String[] args) {
        userPasswords = new String[][]{
                {"Admin", "1234$Qwerty"},
                {"Brian", "Password"},
                {"Ashley", "TYU%^&567"},
                {"Dr. Struggle", "YummStudentTears'"}
        };

        /*System.out.print("Username: ");
        String userName = sc.nextLine();
        checkPassword(getUserRow(userName));*/
        printArray();
    }

    private static void printArray() {
        for(int i=0;i<userPasswords.length;i++){
            System.out.printf("User %d: %s",i,userPasswords[i][0]);
            System.out.printf("Password: %s",userPasswords[i][1]);
        }
    }
}
