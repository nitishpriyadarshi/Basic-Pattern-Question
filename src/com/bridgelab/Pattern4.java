package com.bridgelab;
import java.util.Scanner;
public class Pattern4 {
    private static Scanner sc;
    public static void main(String[] args)
    {
        int rows, columns, i, j;
        sc = new Scanner(System.in);

        System.out.print(" Please Enter Number of Rows : "); //5row//
        rows = sc.nextInt();

        System.out.print(" Please Enter Number of Columns : ");//3row//
        columns = sc.nextInt();

        for(i = 1; i <= rows; i++)
        {
            for(j = 1; j <= columns; j++)
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
