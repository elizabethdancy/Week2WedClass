
package studentlistwed;

/**
 * Class that creates an Array of Students and prints each student's name.
 * @author dancye, 2023
 */
public class StudentList 
{
    public static void main(String[] args)
    {
        //1. create an array of Student Objects of size 5
        Student[] students = new Student[5];
        //2. Add 5 students to the array
        Student s1 = new Student("John");
        students[0] = s1;
        Student s2 = new Student("Rakshit");
        students[1] = s2;
        Student s3 = new Student("Arshvir");
        students[2] = s3;
        Student s4 = new Student("Vasu");
        students[3] = s4;
        Student s5 = new Student("Prince");
        students[4] = s5;
        
        //iterate over the array and print out each student's name
        
        for(Student s: students)// for each loop - for each Student s in students
        {
            System.out.println(s.getName());
            System.out.println(s.getStudentNumber());
            System.out.println(s.isFullTime());
        }
        
       
        
    }
}
