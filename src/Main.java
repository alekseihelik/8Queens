import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner answer = new Scanner(System.in);
        System.out.println("How large is the board?");
        int size = answer.nextInt();
        String[][] grid = new String[size][size];
        for(int rows=0;rows<size;rows++){
            for(int cols=0;cols<size;cols++){
                grid[rows][cols] = "-";
                System.out.print(grid[rows][cols] + " ");
            }
            System.out.println();
        }
    }

    public static String[][] nQueens(String[][] arr){
        
    }
}
