package euler;
import java.util.*;
public class pb2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int f1=0,f2=1,f3=0,s=0;
		for(int i=1;i<100;i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;
			if(f3%2==0)
				s=s+f3;
		}
System.out.println("sum="+s);
	}

}
