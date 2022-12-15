package example.queue;

import java.util.Scanner;
public class queueArray
{
			int f=-1,r=-1;
		 int n=10;
		 int q[]=new int [n];
		 void enqueue(Scanner sc) 
		 {
			if(r==(n-1)) {
				System.out.println("overflow");
			}
			else
				{
				System.out.println("Enter Data");
				int i=sc.nextInt();
				if(f==-1 && r==-1) 
				{
				  f=0;
				  r=0;
				  q[r]=1;
				}
				else
				{
					r++;
					q[r]=i;
				}
			}
		 }
		void dequeue() {
			if(f==-1 && r==-1) {
				System.out.println("underflow");
			}
			else
			{
				f++;
			}
			
			
			
		}
		void display() {
			System.out.println("iteam areas");
			for(int i=f;i<=r;i++)
			{
				System.out.println(q[i]);
			}
		}
		
	}
		class QueueOperation{

		public static void main(String[] args) {
		int l;
			Scanner sc=new Scanner(System.in);
			queueArray lq=new queueArray();
			do {
				System.out.println("\n1.Enqueue\t2.dequeue\t3.display");
				int d=sc.nextInt();
				switch(d)
				{
				case 1:lq.enqueue(sc);
					break;
				case 2:lq.dequeue();
					break;
				case 3:lq.display();
					break;
				}
				System.out.println("Adding data press 0");
			l=sc.nextInt();	
 			} while(l==0);
			
		}

	}


