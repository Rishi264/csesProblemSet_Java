import java.util.Scanner;

class MissingNumber {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int number[]=new int[n-1];
        int sumOfN=0;
        int sumOfNumber=0;
        for(int i=0;i<number.length;i++)
        {
            number[i]=sc.nextInt();
            sumOfNumber+=number[i];
        }
       for(int i=1;i<=n;i++)
        {
            sumOfN+=i;
        }
        System.out.println(sumOfN-sumOfNumber);
    }    
}
