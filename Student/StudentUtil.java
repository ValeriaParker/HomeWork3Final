package Student;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class StudentUtil implements StudentData{
    @NotNull
    public static Student generateStudent(String firstName, String lastName, int groupNumber, String faculty) {
        Student result = new Student(firstName, lastName, groupNumber, faculty);
        return result;
    }
    public static TreeSet<Student> createTreeSet(int quantity){
        TreeSet<Student> temp = new TreeSet<Student>(new SortByLastName());
        for(int i = 0; i< quantity; i++){
            int num = (int) (Math.random()* arr_firstName.length);
            temp.add(generateStudent(arr_firstName[num],arr_lastName[num], arr_groupNumber[num], arr_faculty[num]));

        }
        return temp;
    }
    public static TreeSet<Student> deleteOdd (TreeSet<Student> ts){

        ArrayList<Student> tempList = new ArrayList<Student>(ts);
        for(int i= tempList.size()-1; i>=0; i--){
            if(i%2!=0) {
                tempList.remove(i);
            }
        }
        TreeSet<Student> temporaryTS = new TreeSet<Student>(tempList);
        return temporaryTS;

    }
    public static void printStudents(TreeSet<Student> ts){
        for(Student st:ts){
            System.out.println(st);
        }
    }
}
class SortByLastName implements Comparator<Student> {
    // Used for sorting in ascending order of
    // roll number
    public int compare(Student a, Student b) {
        return a.getLastName().compareToIgnoreCase(b.getLastName());
    }
}
