import java.util.Scanner;
public class ColumnSum {
    static void findColumnSum(int[][] A,int row,int column)
    {
        for (int i=0;i<column;i++)
        {
            int sum=0;
            for (int j=0;j<row;j++)
            {
                sum+=A[j][i];
            }
            System.out.print(sum+" ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int row=scanner.nextInt();
        int column=scanner.nextInt();
        int A[][]=new int[row][column];
        for (int i=0;i<row;i++)
        {
            for (int j=0;j<column;j++)
            {
                A[i][j]=scanner.nextInt();
            }
        }
        scanner.close();
        findColumnSum(A,row,column);
    }
}
