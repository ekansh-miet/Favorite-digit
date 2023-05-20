import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static boolean isDiv(long n,int d){
        String x=Long.toString(n);
        for(int i=0;i<x.length();i++){
            if((x.charAt(i)-'0')==d)
            return true;
        }
        return false;
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        int d=sc.nextInt();
        long num;
        for(int i=0;i<q;i++){
            num=sc.nextLong();
            if(isDiv(num,d)){
                System.out.println("YES");
            }
            else{
                while(!isDiv(num,d)&& num>0)
                num-=d;
                if(isDiv(num,d) && num>0)
                System.out.println("YES");
                else
                System.out.println("NO");
            }
        }
        
    }
}