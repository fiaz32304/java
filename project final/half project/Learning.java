package learning;

import java.util.Scanner;
import java.util.regex.*;

public class Learning {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pattern pattern = Pattern.compile("\\w+\\d+");

    
        int savedId =0;
        String enrolledCourses = "";
        String savedName = "";
        String savedPassword = "";
        

        System.out.println("LEARNING MANAGEMENT SYSTEM");
        int choose;

        do {
            System.out.println("1. Login");
            System.out.println("2. Create an account?");
            System.out.println("3. Exit");
            System.out.println("Choose an option:");
            choose = input.nextInt();

            if (choose == 2) {
                System.out.println("Enter student id (just 3 digit)");
                int id = input.nextInt();
                input.nextLine();
                System.out.println("Enter name");
                String name = input.nextLine();
                System.out.println("Password set");
                System.out.println("Enter password");
                String pass = input.nextLine();
                Matcher match = pattern.matcher(pass);

                if (match.matches()) {
                    if (id == savedId) {
                        System.out.println("ID already exists!");
                    } else {
                        savedId = id;
                        savedName = name;
                        savedPassword = pass;
                        System.out.println("Account created successfully!");
                    }
                } else {
                    System.out.println("Enter password with alphabets and end with digits.");
                }

            } else if (choose == 1) {
                System.out.println("Enter id (3 digit)");
                int id = input.nextInt();
                input.nextLine();
                System.out.println("Enter password");
                String pass = input.nextLine();

                if (id == savedId && pass.equalsIgnoreCase(savedPassword)) {
                    int choice;
                    do {
                        System.out.println("1. Courses");
                        System.out.println("2. Quiz");
                        System.out.println("3. Status");
                        System.out.println("4. Exit");
                        choice = input.nextInt();
                        String enrollledCourses="";
                        if (choice == 1) {
                            System.out.println("Available Courses:");
                            System.out.println("1. Java\n2. Python\n3. C++\n4. Machine Learning\n5. Artificial Intelligence");
                            System.out.println("Choose course to enroll:");
                            int course = input.nextInt();

                            switch (course) {
                                case 1:
                                    enrollledCourses+="java,";
                                    System.out.println("Enrolled in Java successfully!");
                                    break;
                                case 2:
                                    enrollledCourses+="python,";
                                    System.out.println("Enrolled in Python successfully!");
                                    break;
                                case 3:
                                    enrollledCourses+="c++,";
                                    System.out.println("Enrolled in C++ successfully!");
                                    break;
                                case 4:
                                    enrollledCourses+="Machine learning,";
                                    System.out.println("Enrolled in Machine Learning successfully!");
                                    break;
                                case 5:
                                    enrollledCourses+="Artificial intelligence,";
                                    System.out.println("Enrolled in Artificial Intelligence successfully!");
                                    break;
                                default:
                                    System.out.println("Invalid course selected.");
                            }

                        } else if (choice == 2) {
                            System.out.println("Available Courses:");
                            System.out.println("1. Java\n2. Python\n3. C++\n4. Machine Learning\n5. Artificial Intelligence");
                            System.out.println("Which course quiz?");
                            int course = input.nextInt();
                            System.out.println("Feature coming soon...");

                        } else if (choice == 3) {
                            System.out.println("ID: " + savedId);
                            System.out.println("Name: " + savedName);
                            System.out.println("Courses enrolled: " + enrollledCourses);

                        }

                    } while (choice != 4);

                } else {
                    System.out.println("Invalid ID or Password.");
                }
            }

        } while (choose != 3);

        System.out.println("Exiting... Thank you!");
    }
}
