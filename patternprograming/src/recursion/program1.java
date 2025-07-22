package recursion;

public class program1 {
public static void main(String[] args) {
     int a=30;
     int b=40;
     int c=50;
     int d=55;
     int e=89;
     int f=59;
     int sum=getSum(getSum(a,b),getSum(getSum(getSum(e,f),d),c));
     System.out.println(sum);
}
public static int getSum(int a,int b)
{
	return a+b;
}








}
