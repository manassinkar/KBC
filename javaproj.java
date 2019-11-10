package LifeLine;
import java.util.*; 
public class javaproj{
	
		static int Choice =1;

		static int ctr[]=new int[]{0,0,0};
		public static String[] Lifeline(String[] p,int lf)
		{
			switch(lf)
			{
				case 1:
						if(ctr[0]==0)
						{
							L50(object,p);
							
							for(int i=0;i<5;i++)
							 {
								 System.out.println(p[i]);
								 ctr[0]++;
								 
							 }
						}
						break;
				case 2:
						if(ctr[1]==0)
						{
							Choice++;
							System.out.println("Now you get 2 chances");
							ctr[1]++;
						}
						break;
				case 3:
						if(ctr[2]==0)
						{
							System.out.println(object[p].get(6));
							ctr[2]++;
								 
							 }
						break;
				default:
						System.out.println("Invalid input");
			}
			return Choice;
		}
		public static String[] L50(String[] p)
		{
			String element=p[5];
			char c=element.charAt(0);
			int op1=(int)((c-'A')+1);
			System.out.println(op1);
			Random rand = new Random(); 
			int op2= rand.nextInt(5);
			
			while(op2==op1 || op2==0)
			{
				 op2= rand.nextInt(5);
			}
			System.out.println(op2);
			
			for(int i=1;i<5;i++)
			{
				if(i!=op1 && i!=op2)
				{
					p[i]="-----------------------";
				}
			}
			
			return p;
		}
}	
			