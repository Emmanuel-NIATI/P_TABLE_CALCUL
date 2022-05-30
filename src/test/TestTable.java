package test;

public class TestTable
{

	// Proc�dure case +
	public static void casePlus()
	{
		System.out.print(" + |");
	}
	
	// Proc�dure case soulign�e
	public static void caseSoulignee()
	{
		System.out.print("---+");
	}
	
	// Proc�dure case x
	public static void caseFois()
	{
		System.out.print(" x |");
	}
	
	// Proc�dure case d'un entier (de 0 � 100)
	public static void caseInt(int i)
	{
		
		if(i<10)
		{
			System.out.print("  "+i+"|");	
		}
		else if(i>=10 && i<100)
		{ 
			System.out.print(" "+i+"|");
		}
		else if(i==100)
		{ 
			System.out.print("100|");
		}

	}
		
	// Proc�dure retour � la ligne
	public static void retourLigne()
	{
		System.out.print("\n");
	}
	
	// Proc�dure principale
	// main
	public static void main(String[] args)
	{
		
		// 1ere ligne
		
		casePlus();
	
		for(int x=0;x<=10;x++)
		{
			
			caseInt(x);
					
		}
				
		retourLigne();
		
		for(int s=0;s<=11;s++)
		{
			
			caseSoulignee();
					
		}

		retourLigne();
		
		
		// 11 autres lignes
		
		for(int y=0;y<=10;y++)
		{
			
			caseInt(y);

			for(int x=0;x<=10;x++)
			{
				
				int r=y+x;
				
				caseInt(r);
						
			}

			retourLigne();
		
			for(int s=0;s<=11;s++)
			{
				
				caseSoulignee();
						
			}

			retourLigne();
					
		}
				
	}

}
