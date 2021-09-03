package StudentDatabase;
import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int studentYear;
    private String studentID;
    private String courses = "";
    private int tuitionBalance;
    private static int priceTuition = 500;
    private static int id = 1000;

    public Student(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student first name: ");
        this.firstName = sc.nextLine();
        System.out.print("Enter student lasy name: ");
        this.lastName = sc.nextLine();
        System.out.print("1. Freshmen\n2. Sophomore\n3. Junior\n4. Senior\nEnter student grade level: ");
        this.studentYear = sc.nextInt();

        setStudentID();
    }

    private void setStudentID(){
        this.studentID = studentYear+""+id;
        id++;
    }

    public void enrollment(){
        System.out.println();
        System.out.println("Available Courses: \nHistory\nMathematics\nEnglish\nChemistry\nProgramming");
        Scanner sc = new Scanner(System.in);

        do{
        System.out.print("Enter course/s to enroll (Press Q to quit): ");
        String course = sc.nextLine();
            if (!course.equals("Q")) {
                courses = courses + ", " + course;
                tuitionBalance += priceTuition;
            } else {
                break;
            }
        }while(1!=0);
    }

    public void viewBalance(){
        System.out.println("Student Balance: "+tuitionBalance);
    }

    public void payTuition(){
        viewBalance();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount of payment: ");
        int payment = sc.nextInt();

        if(payment>0){
            tuitionBalance -= payment;
            System.out.println("Success!");
            viewBalance();
        }else{
            System.out.print("Invalid input");
        }
    }

    public void showInfo(){
        System.out.println();
        System.out.println("Name: "+firstName+" "+lastName);
        System.out.println("Grade Level: "+studentYear);
        System.out.println("Student ID: "+studentID);
        System.out.println("Courses Enrolled: "+courses);
        viewBalance();
        System.out.println();
    }

}
