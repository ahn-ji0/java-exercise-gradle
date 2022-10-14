package week4.day3.csvToSql;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Write<T> {
    private Parse<T> parse;
    private File file;

    public Write(Parse<T> parse, String fileName) throws IOException {
        this.parse = parse;
        file = new File(fileName);
        file.createNewFile();
    }


    public void writeToFile(List<T> newList) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        int idx = 0;
        //intro 부분이 있으면 입력되도록 parse 내의 intro 함수 정의됨.
        bw.write(parse.intro());
        for(int i=0;i< newList.size();i++) {
            //마지막 value는 write시 포맷을 다르게 하고 싶어서 삼항연산자 추가. 필요없으면 안쓰면 되긴 하지만 좀 더 일반화 필요.
            bw.write(parse.revparse(newList.get(i),(i == newList.size()-1 ? true : false)));
        }
        bw.close();
    }
}

