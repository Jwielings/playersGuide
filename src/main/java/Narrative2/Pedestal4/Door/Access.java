package Narrative2.Pedestal4.Door;

import java.util.Scanner;
import java.util.ArrayList;

public class Access {

    private Scanner scanner;
    private String tempPw;
    private String verificationPw;
    private String Password;
    private boolean giveAccess = false;

    public Access(Scanner scanner) {
        this.scanner = scanner;
    }

    public void makePassword() {

        System.out.println("Please enter a new password.");
        setTempPw(scanner.nextLine());
        checkPassword();
    }

    public void checkPassword() {
        boolean hasUpperCase = false;
        boolean hasLowercase = false;
        boolean hasNumber = false;
        int minLength = 6;
        int maxLength = 13;

        if (getTempPw().length() >= minLength && getTempPw().length() <= maxLength) {
            for (char ch : getTempPw().toCharArray()) {
                if (Character.isUpperCase(ch)) hasUpperCase = true;
                if (Character.isLowerCase(ch)) hasLowercase = true;
                if (Character.isDigit(ch)) hasNumber = true;
                if (ch == '^' || ch == 'T' || ch == 't') illegalCharacter = true;

            }

            if (!hasLowercase || !hasUpperCase || !hasNumber || illegalCharacter) {
                System.out.println("Please re-enter a password that contains at least 1 lower and uppercase letter," +
                        " and a number. Make sure it is between 6 and 13 characters long!");
                makePassword();
            }

            if (hasLowercase && hasUpperCase && hasNumber) {
                System.out.println("Please re-enter the password to verify.");
                setVerificationPw(scanner.nextLine());

                if (!getVerificationPw().equals(getTempPw())) {
                    System.out.println("Passwords do not match, try again!");
                    checkPassword();
                    return;
                }

                    setPassword(getVerificationPw());
                    System.out.println("Password set! Would you like to change it? Y/N");
                    String input = scanner.nextLine();
                    if (input.contains("y") || input.contains("Y")) {
                        changePassword();
                    } else {
                        System.out.println("Ok, proceeding!");
                    }
                return;
            }
        } else System.out.println("Password too short, make sure it is between 6 and 13 characters long.");
        makePassword();
    }

    public void changePassword() {
        System.out.println("Please fill in the current password:");
        String input = scanner.nextLine();
        if (input.equals(getPassword())) {
            makePassword();
        } else {
            changePassword();
        }
    }

    public void insertPassword() {

        do {
            System.out.println("Please provide your password:");
            setTempPw(scanner.nextLine());

            if (getTempPw().equals(getPassword())) {
                System.out.println("Great, we can proceed!");
                giveAccess = true;
            } else {
                System.out.println("Incorrect password, please retry:");
                setTempPw(scanner.nextLine());
                if (getTempPw().equals(getPassword())) {
                    System.out.println("Great, we can proceed!");
                    giveAccess = true;
                }
            }
        } while (!giveAccess);

    }

    public String getTempPw() {
        return tempPw;
    }

    public void setTempPw(String tempPw) {
        this.tempPw = tempPw;
    }

    public String getVerificationPw() {
        return verificationPw;
    }

    public void setVerificationPw(String verificationPw) {
        this.verificationPw = verificationPw;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
