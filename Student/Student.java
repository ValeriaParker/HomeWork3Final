package Student;

import java.util.Objects;

public class Student implements Comparable<Student> {
    String firstName;
    String lastName;
    int groupNumber;
    String faculty;

    public Student(String firstName, String lastName, int groupNumber, String faculty) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.groupNumber = groupNumber;
        this.faculty = faculty;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", groupNumber=" + groupNumber +
                ", faculty='" + faculty + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getGroupNumber() == student.getGroupNumber() && Objects.equals(getFirstName(), student.getFirstName()) && Objects.equals(getLastName(), student.getLastName()) && Objects.equals(getFaculty(), student.getFaculty());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getGroupNumber(), getFaculty());
    }

    @Override
    public int compareTo(Student b){
        if(getLastName().compareTo(b.getLastName()) > 0) {
            return 1;
        }
        else if(getLastName().compareTo(b.getLastName()) < 0){
            return -1;
        }
        else{
            return 0;
        }
    }


}
