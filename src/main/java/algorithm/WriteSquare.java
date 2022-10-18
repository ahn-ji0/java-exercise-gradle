package algorithm;

//별찍기 정사각형
public class WriteSquare {
    public void printSquare(int n){
        for(int i = 0; i < n; i++){
            for(int j =0 ;j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        WriteSquare writeSquare = new WriteSquare();
        writeSquare.printSquare(4);
    }
}
