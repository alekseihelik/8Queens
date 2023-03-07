import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        System.out.println("How large is the board?");
        int size = answer.nextInt();
        nQueens(size);
    }

    public static void nQueens(int n) {
        if(n%6!=2 && n%6!=3){

        }
    }
}
