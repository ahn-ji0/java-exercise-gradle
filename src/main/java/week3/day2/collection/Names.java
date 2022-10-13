package week3.day2.collection;

import java.util.ArrayList;
import java.util.List;

public class Names {
    List<String> students = new ArrayList<>();
    List<Student> studentObjs = new ArrayList<>();

    public List<String> addStudentList(){
        this.students.add("권하준");
        this.students.add("조성윤");
        this.students.add("안예은");
        this.students.add("남우빈");
        this.students.add("최경민");

        return this.students;
    }
    public List<Student> addStudentObjs(){
        this.studentObjs.add(new Student(1,"권하준","https://github.com/dongyeon-0822/java-project-exercise"));
        this.studentObjs.add(new Student(1,"조성윤","https://github.com/kang-subin/Java"));
        this.studentObjs.add(new Student(3,"안예은","https://github.com/KoKwanwun/LikeLion.git"));
        this.studentObjs.add(new Student(1,"남우빈","https://github.com/lcomment/Algorithm_Solution--Java/tree/main/LikeLion"));
        this.studentObjs.add(new Student(2,"최경","https://github.com/cmkxak/likelion-java-course"));

        return this.studentObjs;
    }
}
