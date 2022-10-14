package week4.day3.csvToSql;

public interface Parse<T> {
    T parsing(String str);
    String revparse(T object, boolean b);

    String intro();
}
