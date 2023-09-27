//Padilla, Kervin Clyde S.
import java.util.*;
public class MainStudent {
    static Scanner sc = new Scanner(System.in);
    static String[] subjects = {"6OOP", "6COMETHICS", "4ETHICS", "6DSAL", "2CALC-IT"};
    static double[] grades = {0,0,0,0,0};
    public static void main(String[] args) {
        System.out.print("\n\nEnter number of students > ");
        int studentQ = sc.nextInt();
        Student[] students = new Student[studentQ];
        for (int i=0; i <= (studentQ-1); i++){
            students[i] = new Student();
            System.out.println("[Enter details for student "+(i+1)+"]");
            System.out.print("Enter student number > ");
            int studentNumber = sc.nextInt();
            sc.nextLine();
            students[i].setStudentNumber(studentNumber);
            System.out.print("Enter student name > ");
            String studentName = sc.nextLine();
            students[i].setStudentName(studentName);
            System.out.println("[Enter grades for 5 subjects]");
            for (int j = 0; j <= 4; j++) {
                System.out.print("Enter "+ subjects[j] +" grade > ");
                double grade = sc.nextDouble();
                while(grade<1||grade>9){
                    System.out.print("!!! Must be between 1-9 > ");
                    grade = sc.nextDouble();
                } 
                grades[j] = grade;
            }
            students[i].setGrade(grades);
        }
        System.out.println("[Students Information]");
        for(int i=0; i <= (studentQ-1); i++){
            students[i].display();
        }
    }
}
//WHAT IS java.lang.NullPointerException