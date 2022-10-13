package week3.day3.listString;

import java.util.ArrayList;
import java.util.List;

public class MakeList {
    private List<String> students;

    public MakeList() {
        this.students = new ArrayList<>();
        this.students.add("홍길동");
        this.students.add("홍길자");
        this.students.add("김철수");
    }

    public List<String> getList(){
        return this.students;
    }
}
