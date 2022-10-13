package week3.day2.collection;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    // 멋사자 2기 학생의 이름이 들어있는 list를 return하는 메소드를 만들 것.
    private List<String> students = new ArrayList<>();
    private List<Student> studentObjs = new ArrayList<>();

    public LikeLion2th(){
        Names names = new Names();
        this.students = names.addStudentList();
        this.studentObjs = names.addStudentObjs();

    }
    public List<String> getStudentList(){
        return this.students;
    }
    public List<Student> getStudentObjs(){
        return this.studentObjs;
    }
}
