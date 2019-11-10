/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kbc;
import Questions.*;
import LifeLine.*;
import java.util.*;
/**
 *
 * @author Admin
 */
public class Kbc {

    static int scanAndCompareAnswer(String q[])
    {
        Scanner sc=new Scanner(System.in);
        int flag=1,ctr=-1;
        char ans;
        while(flag==1)
        {
            System.out.println("Enter Your answer choice a/b/c/d or to quit enter 'q'");
            ans=sc.next().charAt(0);
            if(ans>='A' && ans<='Z')
            {
                ans+=32;
            }
            if((ans>='a' && ans<='d') || ans=='q')
            {
                if(ans=='q')
                {
                    return -1;
                }
                int i=((int)(ans-'a'))+1;
                ctr=q[i].compareTo(q[5]);
                flag=0;
            }
            else
            {
                System.out.println("Invalid Input");
                continue;
            }
        }
        if(ctr==0)
        {
            System.out.println("Right Answer!!");
            return 1;
        }
        else
        {
            System.out.println("Wrong Answer!!");
            System.out.println("Right Answer is "+q[5]+"!!");
            return 0;
        }
    }
    static void Print_Question(String q[])
    {
        for(int j=0;j<5;j++)
	{
		System.out.println(q[j]);
	}
    }
    static int get_won_amount(int i)
    {
        int x=0;
        switch(i)
        {
            case 0:
            {
                x=0;
                break;
            }
            case 1:
            {
                x=1000;
                break;
            }
            case 2:
            {
                x=2000;
                break;
            }
            case 3:
            {
                x=4000;
                break;
            }
            case 4:
            {
                x=5000;
                break;
            }
            case 5:
            {
                x=10000;
                break;
            }
            case 6:
            {
                x=20000;
                break;
            }
            case 7:
            {
                x=40000;
                break;
            }
            case 8:
            {
                x=80000;
                break;
            }
            case 9:
            {
                x=160000;
                break;
            }
            case 10:
            {
                x=320000;
                break;
            }
            case 11:
            {
                x=640000;
                break;
            }
            case 12:
            {
                x=1250000;
                break;
            }
            case 13:
            {
                x=2500000;
                break;
            }
            case 14:
            {
                x=5000000;
                break;
            }
            case 15:
            {
                x=10000000;
                break;
            }
        }
        return x;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        String a[]=new String[6];
		int amount_won=0,c=0;
		for(int i=1;i<=15;i++)
		{
			double r=Math.random()*10+1;
			int ran=(int) r;
			switch(i)
			{
				case 1:
				{
					OneThousand obj=new OneThousand();
					a=obj.ques(ran);
                                        Print_Question(a);
                                        c=scanAndCompareAnswer(a);
					break;
				}
				case 2:
				{
					TwoThousand obj=new TwoThousand();
					a=obj.ques(ran);
                                        Print_Question(a);
                                        c=scanAndCompareAnswer(a);
					break;
				}
				case 3:
				{
					FourThousand obj=new FourThousand();
					a=obj.ques(ran);
                                        Print_Question(a);
                                        c=scanAndCompareAnswer(a);
					break;
				}
				case 4:
				{
					FiveThousand obj=new FiveThousand();
					a=obj.ques(ran);
                                        Print_Question(a);
                                        c=scanAndCompareAnswer(a);
					break;
				}
				case 5:
				{
					TenThousand obj=new TenThousand();
					a=obj.ques(ran);
                                        Print_Question(a);
                                        c=scanAndCompareAnswer(a);
					break;
				}
				case 6:
				{
					TwentyThousand obj=new TwentyThousand();
					a=obj.ques(ran);
                                        Print_Question(a);
                                        c=scanAndCompareAnswer(a);
					break;
				}
				case 7:
				{
					FortyThousand obj=new FortyThousand();
					a=obj.ques(ran);
                                        Print_Question(a);
                                        c=scanAndCompareAnswer(a);
					break;
				}
				case 8:
				{
					EightyThousand obj=new EightyThousand();
					a=obj.ques(ran);
                                        Print_Question(a);
                                        c=scanAndCompareAnswer(a);
					break;
				}
				case 9:
				{
					OneLakhSixtyThousand obj=new OneLakhSixtyThousand();
					a=obj.ques(ran);
                                        Print_Question(a);
                                        c=scanAndCompareAnswer(a);
					break;
				}
				case 10:
				{
					ThreeLakhTwentyThousand obj=new ThreeLakhTwentyThousand();
					a=obj.ques(ran);
                                        Print_Question(a);
                                        c=scanAndCompareAnswer(a);
					break;
				}
				case 11:
				{
					SixLakhFortyThousand obj=new SixLakhFortyThousand();
					a=obj.ques(ran);
                                        Print_Question(a);
                                        c=scanAndCompareAnswer(a);
					break;
				}
				case 12:
				{
					TwelveLakhFiftyThousand obj=new TwelveLakhFiftyThousand();
					a=obj.ques(ran);
                                        Print_Question(a);
                                        c=scanAndCompareAnswer(a);
					break;
				}
				case 13:
				{
					TwentyFiveLakh obj=new TwentyFiveLakh();
					a=obj.ques(ran);
                                        Print_Question(a);
                                        c=scanAndCompareAnswer(a);
					break;
				}
				case 14:
				{
					FiftyLakh obj=new FiftyLakh();
					a=obj.ques(ran);
                                        Print_Question(a);
                                        c=scanAndCompareAnswer(a);
					break;
				}
				case 15:
				{
					OneCrore obj=new OneCrore();
					a=obj.ques(ran);
                                        Print_Question(a);
                                        c=scanAndCompareAnswer(a);
					break;
				}
			}
                        if(c==1)
                        {
                            amount_won=get_won_amount(i);
                            System.out.println("Amount Won till now is "+amount_won);
                        }
                        else if(c==0)
                        {
                            if(i<=5)
                            {
                                amount_won=0;
                            }
                            else if(i>5 && i<=10)
                            {
                                amount_won=10000;
                            }
                            else if(i>10 && i<=15)
                            {
                                amount_won=320000;
                            }
                            break;
                        }
                        else if(c==-1)
                        {
                            System.out.println("Your Decision is to Quit!!");
                            amount_won=get_won_amount(i-1);
                            break;
                        }
		}
        System.out.println("Final Amount Won is "+amount_won);
    }
}