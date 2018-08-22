import java.util.*;
public class wifi{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[0]+" "+a[a.length-1]);
}}
