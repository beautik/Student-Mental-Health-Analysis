//Student Mental health analysis

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public void info() {
        System.out.println("**CHECK YOUR MENTAL HEALTH SPECTRUM**");
        System.out.println(" ");

        String studentName;
        while (true) {
            try {
                System.out.print("Please enter your name: ");
                Scanner scannnerObj = new Scanner(System.in);
                studentName = scannnerObj.nextLine();
                if (!studentName.matches("[a-zA-Z ]+")) {
                    throw new Exception();
                }
                break;
            } catch (Exception e) {
                System.out.println("Input is invalid. Please enter a valid string.");
            }
        }

        System.out.println("Welcome, Dear " + studentName);
        System.out.println(
                "I know you are doing excellent. \nTo know your physical health status you use to have regular checkup, but what about your mental health status? ");
        System.out.println("Have your ever thought about it? Dear " + studentName
                + " it is advice to you to have a mental health analysis to know about your mental health");

        System.out.println("Press enter to start test");
        Scanner ln = new Scanner(System.in);
        ln.nextLine();
        System.out.println(" ");
        System.out.println("The following question will help you to understand your mental health spectrum");

    }

    int questionOne = 0;
    int questionTwo = 0;
    int questionThree = 0;
    int questionFour = 0;
    int questionFive = 0;

    public void q1() {
        System.out.println("1. How is your quality of sleep?  ");
        System.out.println("1 for - very bad");
        System.out.println("2 for - bad");
        System.out.println("3 for - Normal");
        System.out.println("4 for - Good");
        System.out.println("5 for - Very Good");

        while (true) {
            try {
                System.out.print("Enter your rating value : ");
                Scanner sc = new Scanner(System.in);
                questionOne = sc.nextInt();
                if (questionOne < 1 || questionOne > 5) {
                    throw new Exception();
                }
                System.out.println("Next Question...");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer value between 1 to 5.");
            } catch (Exception e) {
                System.out.println("Input is invalid. Please enter a number rating between 1 to 5.");
            }
        }
    }

    public void q2() {
        System.out.println("2. When was the last time you were really happy?  ");
        System.out.println("1 for - I don't remember");
        System.out.println("2 for - Few Years ago");
        System.out.println("3 for - Few Months ago");
        System.out.println("4 for - Few weeks ago");
        System.out.println("5 for - Few days ago");

        while (true) {
            try {
                System.out.print("Enter your rating value : ");
                Scanner sc = new Scanner(System.in);
                questionTwo = sc.nextInt();
                if (questionTwo < 1 || questionTwo > 5) {
                    throw new Exception();
                }
                System.out.println("Next Question...");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer value between 1 to 5.");
            } catch (Exception e) {
                System.out.println("Input is invalid. Please enter a number rating between 1 to 5.");
            }
        }
    }

    public void q3() {
        System.out.println("3. How often do you feel positive about yourself? ");
        System.out.println("1 for - Never");
        System.out.println("2 for - Once in a while");
        System.out.println("3 for - About half of the time");
        System.out.println("4 for - Most of the time");
        System.out.println("5 for - Always");

        while (true) {
            try {
                System.out.print("Enter your rating value : ");
                Scanner sc = new Scanner(System.in);
                questionThree = sc.nextInt();
                if (questionThree < 1 || questionThree > 5) {
                    throw new Exception();
                }
                System.out.println("Next Question...");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer value between 1 to 5.");
            } catch (Exception e) {
                System.out.println("Input is invalid. Please enter a number rating between 1 to 5.");
            }
        }
    }

    public void q4() {
        System.out.println("4. Overall how would you rate your physical health?  ");
        System.out.println("1 for - Not sure");
        System.out.println("2 for - Poor");
        System.out.println("3 for - Somewhat poor");
        System.out.println("4 for - Average");
        System.out.println("5 for - Excellent");

        while (true) {
            try {
                System.out.print("Enter your rating value : ");
                Scanner sc = new Scanner(System.in);
                questionFour = sc.nextInt();
                if (questionFour < 1 || questionFour > 5) {
                    throw new Exception();
                }
                System.out.println("Next Question...");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer value between 1 to 5.");
            } catch (Exception e) {
                System.out.println("Input is invalid. Please enter a number rating between 1 to 5.");
            }
        }
    }

    public void q5() {
        System.out.println("5. Overall how would you rate your mental health?");
        System.out.println("1 for - Not sure");
        System.out.println("2 for - Poor");
        System.out.println("3 for - Somewhat poor");
        System.out.println("4 for - Average");
        System.out.println("5 for - Excellent");

        while (true) {
            try {
                System.out.print("Enter your rating value : ");
                Scanner sc = new Scanner(System.in);
                questionFive = sc.nextInt();
                if (questionFive < 1 || questionFive > 5) {
                    throw new Exception();
                }
                System.out.println(" ");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer value between 1 to 5.");
            } catch (Exception e) {
                System.out.println("Input is invalid. Please enter a number rating between 1 to 5.");
            }
        }
    }

    public void score() {

        // jo v data user select kiye hai usse print kr wana hai
        /*
         * int questionOne = 0; 1. How is your quality of sleep?
         * int questionTwo = 0; 2. When was the last time you were really happy?
         * int questionThree = 0; 3. How often do you feel positive about yourself?
         * int questionFour = 0; 4. Overall how would you rate your physical health?
         * int questionFive = 0; 5. Overall how would you rate your mental health?
         */
        System.out.println("Asked question" + "                     " + "      Rating   " + "    " + " Range");
        System.out.println("1. Quality of sleep"                    + "                         "+ questionOne +  "         >=3    ");
        System.out.println("2. Last time when you was really happy" + "      " + questionTwo + "         >=3    ");
        System.out.println("3. Level of your positive feeling"      + "           " + questionThree + "         >=3    ");
        System.out.println("4. Your physical health"                + "                     " + questionFour + "         >=4    ");
        System.out.println("5. Your mental health according to you" + "      " + questionThree + "         >=4    ");




        int totalScore = questionOne + questionTwo + questionThree + questionFour + questionFive;
        float CurrentScore = totalScore / 5;
        System.out.println("Your Score is " + CurrentScore);

        if (CurrentScore < 3 && CurrentScore >= 1) {
            System.out.println(
                    "You need to counsult to counsller your mental  health is not in good condition. You need urgent mediction or counselling");
        } else if (CurrentScore < 4 && CurrentScore > 3) {
            System.out.println(
                    "Your mental health is in Okay  condition but need to take care of it. You should talk to someone, you should shre your problem with your family or friends.");
        } else {
            System.out.println("Your mental health is in good condition, don't take to much stress. ");
        }

    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.info();
        obj.q1();
        obj.q2();
        obj.q3();
        obj.q4();
        obj.q5();
        obj.score();
    }
}
