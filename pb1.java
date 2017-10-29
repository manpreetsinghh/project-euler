package euler;
import java.util.*;
public class pb1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=0;
		for(int i =1;i<100;i++)
		{
			if((i%3==0)||(i%5==0))
				s=s+i;
		}
System.out.println("sum="+s);
	}

}
