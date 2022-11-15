package example.binarygaptest;

import java.util.ArrayList;

public class BinaryGapTest {
	public static void main(String[] args) {
		int count=Solution.SolveThis(1048);
		System.out.println("max 0 count is:- "+count);
		
	}
}
	class Solution{
		public static int SolveThis(int N) {
			
			String binaryRepresentation=Integer.toBinaryString(N);
			System.out.println(+N+  " Binary: " +binaryRepresentation);
			
			int longestGap=0;
			ArrayList<Integer> onelist=new ArrayList<Integer>();
			for(int i=0;i<binaryRepresentation.length();i++) {
				if(binaryRepresentation.charAt(i)=='0')
				{
					continue;
				}
				onelist.add(i);
				
				for(i=0;i<onelist.size()-1;i++)
				{
					int indiceDiff=onelist.get(i+1)-onelist.get(i)-1;
					 longestGap=Math.max(longestGap, indiceDiff);
				}
			}
			return longestGap;
			
			
		}
	}


