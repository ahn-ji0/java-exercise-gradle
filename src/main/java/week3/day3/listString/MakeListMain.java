package week3.day3.listString;

import java.util.List;

public class MakeListMain {
    public static void main(String[] args) {
        MakeList makeList = new MakeList();

        List<String> students = makeList.getList();

        for(String student : students){
            System.out.println(student);
        }

        System.out.println(students.size());
    }
}
