package StudentDatabase;
import java.util.Arrays;
import java.util.Scanner;

public class StudentDatabase {
    public static void main(String args[]){

        System.out.print("Enter number of students to enroll: ");
        Scanner sc = new Scanner(System.in);
        int numStudents = sc.nextInt();
        Student[] students = new Student[numStudents];

        for(int i = 0; i<students.length; i++){
            students[i] = new Student();
            students[i].enrollment();
            students[i].payTuition();
            students[i].showInfo();
        }

        System.out.println(Arrays.toString(students));
    }
}
