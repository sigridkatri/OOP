package Harjutused;

public class harjutus12 {
	
	public static void main(String[] args) {
		System.out.println("a)"); //teksti v�ljastus
		for(int t=0; t<=2; t++)
		{
	for(int u=0; u<=2*t; u++)
	{
	System.out.print("*"); //t�rnide v�ljastus muutujate abil
	}
	System.out.println("");
	}
	for(int t=1; t>=0;t--)
	{
	for(int u=1; u<=2*t+1;u++)
	{
	System.out.print("*"); //t�rnide v�ljastus muutujate abil	
	}
	System.out.println();
	}
	
			System.out.println("b)"); //teksti v�ljastus
			int rows=5;
			for(int i= rows-1; i>=0 ;i--)
			{
			for(int j=0; j<=i; j++)
			{
			System.out.print("*"); //t�rnide v�ljastus muutujate abil
			}
			System.out.println(); 	
			}
			System.out.println("c)"); //teksti v�ljastus
			int i, j, k=1;
			for(i=0; i<5; i++)
			{
			for(j=0; j<k; j++)
			{
			System.out.print("*"); //t�rnide v�ljastus muutujate abil
			}
			k = k + 1;
			System.out.println();
			}
			System.out.println("d)"); //teksti v�ljastus
			int a=4;
			int q,r,s=1;
			for(int b=0; b<=a; b++)
			{
			for(int c=0; c<=a+b; c++)
			{
			System.out.print("*"); //t�rnide v�ljastus muutujate abil
			}
			System.out.println();
			}
			for(q=0; q<4; q++)
			{
			for(r=0; r<s; r++)
			{
			System.out.print("*"); //t�rnide v�ljastus muutujate abil
			}
			s = s + 1;
			}
			System.out.println();
			}
}
		


			
