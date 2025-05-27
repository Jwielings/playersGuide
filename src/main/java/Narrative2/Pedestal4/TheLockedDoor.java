    package Narrative2.Pedestal4;

    import java.util.Scanner;

    import Narrative2.Pedestal4.Exceptions.CanNotChangePassword;
    import Narrative2.Pedestal4.Exceptions.PasswordDoesNotMatch;
    import Narrative2.Pedestal4.Exceptions.TooManyAttempts;

    public class TheLockedDoor {
        Scanner scanner = new Scanner(System.in);

        private String currentPassword;
        private String verifyPassword;
        private String tempPassword;


        public TheLockedDoor() {

        }

        public void createDoor() {

            do {
                System.out.println("What password do you want to assign the door?");
                setTempPassword(scanner.nextLine());
                System.out.println("Please type it another time to prevent grammatical errors");
                setVerifyPassword(scanner.nextLine());
                try {
                    if (getTempPassword().equals(getVerifyPassword())) {
                        setPassword(getTempPassword());
                    } else {
                        throw new PasswordDoesNotMatch();
                    }
                } catch (PasswordDoesNotMatch e) {
                }

            } while (getPassword() == null || getPassword().isEmpty());

            System.out.println("Password set! Would you like to change it? Y/N");
            String input = scanner.nextLine();

            try {
                if (input.contains("Y") || input.contains("y")) {
                    changePassword();
                } else if (input.contains("N") || input.contains("n")) {
                    System.out.println("Ok, the password will remain the same.");
                }
            } catch (CanNotChangePassword e) {
            }
        }

        public void changePassword() {
            int attempts = 0;
            int maxAttempts = 3;

            do {

                System.out.println("Please provide the current password");
                String passwordInput = scanner.nextLine();
                attempts++;
                try {
                    attempts++;
                    if (passwordInput.equals(getPassword())) {
                        System.out.println("What should the new password be?");
                        setTempPassword(scanner.nextLine());
                        System.out.println("Please verify, retype the password.");
                        setVerifyPassword(scanner.nextLine());
                        if (getTempPassword().equals(getVerifyPassword())) {
                            setPassword(getTempPassword());
                            break;
                        } else {
                            throw new PasswordDoesNotMatch();
                        }
                    }
                } catch (PasswordDoesNotMatch e) {}
            } while (attempts < maxAttempts);
        }



        public String getPassword() {
            return currentPassword;
        }

        public void setPassword(String password) {
            this.currentPassword = password;
        }

        public String getVerifyPassword() {
            return verifyPassword;
        }

        public void setVerifyPassword(String verifyPassword) {
            this.verifyPassword = verifyPassword;
        }

        public String getTempPassword() {
            return tempPassword;
        }

        public void setTempPassword(String tempPassword) {
            this.tempPassword = tempPassword;
        }

        enum stateOfDoor {
            OPEN,
            CLOSED,
            UNLOCKED,
            LOCKED
        }
    }
