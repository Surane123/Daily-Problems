import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++)
	    {
	       int start=(i-1)*i/2+1;
	       int end=i*(i+1)/2;
	       if(i%2!=0)
	       {
	           for(int num=start;num<=end;num++){
	           System.out.print(num + " ");}
	       }
	       else{
	           for(int num=end;num>=start;num--){
	           System.out.print(num + " ");}
	       }
	       System.out.println();
	    }
	}
	    
		
}
