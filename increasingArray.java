/*
 Time limit: 1.00 s Memory limit: 512 MB
You are given an array of n integers. You want to modify the array so that it is increasing, i.e., every element is at least as large as the previous element.

On each move, you may increase the value of any element by one. What is the minimum number of moves required?

Input

The first input line contains an integer n
: the size of the array.

Then, the second line contains n
 integers x1,x2,…,xn
: the contents of the array.

Output

Print the minimum number of moves.

Constraints
1≤n≤2⋅105

1≤xi≤109

Example

Input:
5
3 2 5 1 7

Output:
5
 */

import java.util.*;
class increasingArray {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int array[]=new int[n];
        long count=0;
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            if(array[i]>array[i-1])
                continue;
            count=count+(array[i-1]-array[i]);
            array[i]=array[i-1];
        }
        System.out.println(count);
    }    
}
