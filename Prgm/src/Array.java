/*Assume a class has five students.Store the marks obtained by each student in 5 different subjects.
Find the class average mark in each subject.
(use 2d array to store marks)*/

import java.util.Scanner;
public class Array {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int i,j,n,sum;
        float avg;
        int[][] arr=new int[5][5];
        //row : student
        //column : subject
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                System.out.println("Enter the marks of student" + (i + 1) + " in subj" + (j + 1)+":" );
                arr[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        for(j=0;j<5;j++)
        {
            sum=0;
            for(i=0;i<5;i++)
            {
                sum+=arr[i][j];
            }
            avg=sum/5.0f;
            System.out.print("\nAverage of subj" +(j+1)+ ":" +avg);
        }


    }
}
