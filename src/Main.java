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
            }
        }
        nQueens(grid);
    }

    public static void nQueens(String[][] arr){
        for(int rows=0;rows< arr.length;rows++){
            for(int cols=0;cols<arr.length;cols++){
                if(arr[rows][cols].equals("-")){
                    arr[rows][cols] = "Q";
                    if(cols>0 && cols<arr.length-1){
                        for(int i=0;i<cols/*removed -1*/;i++){
                            arr[rows][i] = "x";
                        }
                        for(int i=cols+1;i<arr.length;i++){
                            arr[rows][i] = "x";
                        }
                    }
                    if(cols==0){
                        for(int i=1;i<arr.length;i++){
                            arr[rows][i] = "x";
                        }
                    }
                    if(cols==arr.length-1){
                        for(int i=0;i<arr.length;i++){
                            arr[rows][i] = "x";
                        }
                    }
                    if(rows>0 && rows<arr.length-1){
                        for(int i=0;i<rows/*removed -1*/;i++){
                            arr[i][cols] = "x";
                        }
                        for(int i=rows+1;i<arr.length;i++){
                            arr[i][cols] = "x";
                        }
                    }
                    if(rows==0){
                        for(int i=1;i<arr.length;i++){
                            arr[i][cols] = "x";
                        }
                    }
                    if(rows==arr.length-1){
                        for(int i=0;i<arr.length;i++){
                            arr[i][cols] = "x";
                        }
                    }
                }
            }
        }
        for(int rows=0;rows< arr.length;rows++){
            for(int cols=0;cols<arr.length;cols++){
                if(arr[rows][cols].equals("x")){
                    arr[rows][cols] = "-";
                }
                System.out.print(arr[rows][cols] + " ");
            }
            System.out.println();
        }
    }
}
