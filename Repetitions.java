import java.util.Scanner;

class Repetitions {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char curr=Character.MIN_VALUE;
        int count=0,maxCount=0;
        for(char c: str.toCharArray())
        {
            if(c==curr)
                count+=1;
            else{
                maxCount=Math.max(count,maxCount);
                count=1;
                curr=c;
            }
        }
        maxCount=Math.max(count,maxCount);
        System.out.println(maxCount);


    }    
}
