package algorithm;

//별찍기 직각삼각형
public class WriteTriangleRecursive {
    public void printTriangle(int n){
        if(n==1){
            System.out.println("*");
            return;
        }
        printTriangle(n-1);
        System.out.println("*".repeat(n));
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        WriteTriangleRecursive writeTriangle = new WriteTriangleRecursive();
        writeTriangle.printTriangle(4);
    }
}
