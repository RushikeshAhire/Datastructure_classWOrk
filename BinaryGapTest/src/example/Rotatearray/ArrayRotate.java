package example.Rotatearray;
import java.util.*;

import java.util.Arrays;

public class ArrayRotate {

	public static void main(String[] args) {
		//int[] sourceArray= {3,8,9,7,6};
		//int k=3;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Size of Arrray:- ");
		int sourceArray=sc.nextInt();
		int [] index =new int[sourceArray];
	    System.out.println("Enter the Array Element");
	    for(int i=0;i<sourceArray;i++) {
		index[i]=sc.nextInt();
	    }
	    System.out.println("Enter ow many times you want to Rotated te Array:-");
	    int k=sc.nextInt();
	    
		
		System.out.println(Arrays.toString(index));
		int RotationArray[] =Rotatetest.Solution(index, k);
		System.out.println(Arrays.toString(RotationArray));
		
	

	}
	

}
class Rotatetest{
	public static 	int[] Solution(int sourceArray[] , int k) {
		int TargetArray []=new int[sourceArray.length];
		for(int i=0; i<sourceArray.length;i++) 
		{
			int rotatedArray=(i+k)%sourceArray.length;
			TargetArray[rotatedArray]=sourceArray[i];
		}
		
		return TargetArray;
		
	}
}

	