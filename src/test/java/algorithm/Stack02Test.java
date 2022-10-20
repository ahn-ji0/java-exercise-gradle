package algorithm;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {

    @BeforeEach
    void setUp() {
        // 각 테스트가 실행되기 전에 실행되는 구간
        //db에서 데이터 지우는 코드, db에서 데이터를 놓는 코드 등을 넣는다.
        System.out.println("before each");
    }

    @Test
    @DisplayName("push")
    void push(){
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        Integer[] arr = st.getArr();
        assertEquals(20,arr[1]);
        assertEquals(10,arr[0]);
    }

    @Test
    @DisplayName("pop")
    void pop(){
        Stack02 st = new Stack02(10);
        st.push(10);
        st.push(20);

        assertEquals(20, st.pop());
        assertEquals(10,st.pop());
    }

}