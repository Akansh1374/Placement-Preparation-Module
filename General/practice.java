import java.util.Scanner;

public class practice{
	public static void main(String[] args) {
		int[] arr={-1,-2,-3,3,4,-7};
		int sum=0;
		for(int i=0;i<arr.length;i++){
			int count=0;
			if(i==0 || i==1)
				continue;
			for(int j=2;j<i;j++){
				if(i%j==0){
					count++;
					break;
				}
			}
			if(count==0){
				//System.out.println(arr[i]);
				sum+=arr[i];
			}
		}
		System.out.println(sum);
	}
}