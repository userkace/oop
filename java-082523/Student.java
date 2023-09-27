public class Student{
    static int studentNumber;
    static String studentName;
    static double[] grades = {0,0,0,0,0};
    Student(){
        studentNumber = 0;
        studentName = "";
    }
    public void setStudentNumber(int x) {
        studentNumber = x;
    }
    public void setStudentName(String x) {
        studentName = x;
    }
    public void setGrade (double[] x){
        grades = x;
    }
    public void display(){
        System.out.println("Student Number < "+studentNumber);
        System.out.println("Student Name < "+studentName);
        double sum = 0;
        for(int i=0; i<=5; i++){
            sum+=grades[i];
        }
        System.out.println("Student Name < "+(sum/5));
    }
}