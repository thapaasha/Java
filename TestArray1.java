import java.util.Scanner;

public class TestArray1 {
    public static void main(String[] args) {
        int[][] a = new int [2][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements of array");

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("the entered elements are: ");
        
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.println(a[i][j]);
        
            }
        }


    }
}
