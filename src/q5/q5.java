package q5;

import java.util.Scanner;
import java.util.Random;

public class q5 {
    public static void main(String[] args) {
        System.out.print("Current Time in milliseconds = ");
        System.out.println(System.currentTimeMillis());
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the size of your rows: ");
        int usernumberrows = sc.nextInt();
        if (usernumberrows == 0) {
            System.out.println("Sorry, I cannot accept less than 1 rows.");
            System.out.println();
            System.out.print("Current Time in milliseconds = ");
            System.out.println(System.currentTimeMillis());
        }else
        System.out.print("Input the size of your columns: ");
        int usernumbercolumns = sc.nextInt();
        Random randint = new Random();
        System.out.println("matrix 1");
        int[][] matrix1=new int[usernumberrows][usernumbercolumns];
        for (int i=0;i < usernumberrows;i++){
            for(int j=0;j<usernumbercolumns;j++)
            {
                matrix1[i][j]=randint.nextInt(20);
                System.out.print(matrix1[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println();
        System.out.println("matrix 2");
        int[][] matrix2=new int[usernumberrows][usernumbercolumns];
        for (int i=0;i < usernumberrows;i++){
            for(int j=0;j<usernumbercolumns;j++)
            {
                matrix2[i][j]=randint.nextInt(99);
                System.out.print(matrix2[i][j]+"\t");
            }
            System.out.print("\n");
        }
        //Matrix Addition
        int matrixSum[][] = new int[usernumberrows][usernumbercolumns];
        System.out.println();
        System.out.println("Matrix Addition: ");
        for(int i=0;i<usernumberrows;i++){
            for(int j=0;j<usernumbercolumns;j++){
                matrixSum[i][j]=matrix1[i][j]+matrix2[i][j];
                System.out.print(matrixSum[i][j]+" ");
            }
            System.out.println();
        }
        //Matrix Multiplication
        int matrixMult[][] = new int[usernumberrows][usernumbercolumns];
        System.out.println();
        System.out.println("Matrix Multiplication: ");
        for(int i=0;i<usernumberrows;i++){
            for(int j=0;j<usernumbercolumns;j++){
                matrixMult[i][j]=0;
                for(int k=0;k<usernumberrows;k++)
                {
                    matrixMult[i][j]+=matrix1[i][k]*matrix2[k][j];
                }
                System.out.print(matrixMult[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("Current Time in milliseconds = ");
        System.out.println(System.currentTimeMillis());
    }
}
