import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    int low=0;
	    int high=n-1;
	    int result=-1;
	    for(int i=0;i<arr.length;i++)
	    {   
	        arr[i] = sc.nextInt();
	    }
	    int target =sc.nextInt();
	        while(low<=high)
	        {
	            int mid=low+(high-low)/2;
	            if(target==arr[mid])
	            {
	                result= mid;
	                break;
	            }
	            else if(arr[mid]<target)
	            {
	                low=mid+1;
	            }
	            else
	            {
	                high=mid-1;
	            }
	            if(result==-1){
	            result=low;}
	        }
	        System.out.println(result);
	        sc.close();
	}
		
}
