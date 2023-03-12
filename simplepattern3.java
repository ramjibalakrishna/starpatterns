import java.lang.*;
import java.util.Scanner;
public class simplepattern3 {
    public static void main(String []ar)
    {
        Scanner sc=new Scanner(System.in);
        int row,col,n,space;
        n=sc.nextInt(); //getting no of rows
        for(row=0;row<n;row++)  //row=rows  col=column
        {

            for(col=0;col<n-row;col++)
            {
                System.out.print("*");//printing star
            }
            System.out.println();  //moving to the next line
        }
    }

}
