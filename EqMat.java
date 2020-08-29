import java.util.*;
class EqMat
{
    int a[][],m,n;
    EqMat(int mm,int nn)
    {
        m = mm;
        n = nn;
        a = new int[m][n];
    }
    void readArray()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<m;i++)
        for(int j=0;j<n;j++)
        a[i][j] = sc.nextInt();
    }
    int check(EqMat P,EqMat Q)
    {
        if(P.m==Q.m&&P.n==Q.n)
        {
            for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
            if(P.a[i][j] == Q.a[i][j])
            continue;
            else
            return -1;
        }
        else 
        return -1;
        return 1;
    }
    void print()
    {
        System.out.println("The matrix is");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            System.out.print(String.format("%-5d",a[i][j]));
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m and n");
        int a = sc.nextInt();
        int b = sc.nextInt();
        EqMat ab = new EqMat(a,b);
        ab.readArray();
        ab.print();
        System.out.println("Enter m and n");
        int c = sc.nextInt();
        int d = sc.nextInt();
        EqMat cd = new EqMat(c,d);
        cd.readArray();
        cd.print();
        int ans = cd.check(cd,ab);
        if(ans==1)
        System.out.println("Equivalence Matrix");
        else
        System.out.println("Not Equivalence Matrix");
    }
}