package week2.task1;

public class Task1 {

    public static int gcd(int a, int b) {
        // TODO: Tính ước chung lớn nhất của 2 số a, b
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==0||b==0) return a+b;
        while (a!=b)
        {
            if(a>b) a-=b;
            else b-=a;
        }       
        return a;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n      
        if(n==1) return 0;
        if(n==2) return 1;
        int a=0,b=1;
        int sum = 0;
        for(int i=3;i<=n;i++)
        {
            a=b;
            sum=a+b;
            b=sum;
        }
        return sum;
    }
}