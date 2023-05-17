
package studentlistwed;

/**
 * A class to model student Objects. A student has a name.
 * @author dancye, test 2023
 */
public class Student 
{
    private String name;
    private int studentNumber;
    private boolean fullTime =true;

    /**
     * A constructor to create a student with a specific name
     * @param givenName 
     */
    public Student(String givenName)
    {
        name = givenName;
    }
    /**
     * @return the name
     */
    public String getName() 
    {
        return name;
    }

    /**
     * @param givenName the name to set
     */
    public void setName(String givenName) 
    {
        name = givenName;
    }

    /**
     * @return the studentNumber
     */
    public int getStudentNumber() {
        return studentNumber;
    }

    /**
     * @param studentNumber the studentNumber to set
     */
    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    /**
     * @return the fullTime
     */
    public boolean isFullTime() {
        return fullTime;
    }

    /**
     * @param fullTime the fullTime to set
     */
    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }
}
