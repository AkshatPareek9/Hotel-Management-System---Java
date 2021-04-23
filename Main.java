import java.util.Scanner;

class Room_Book extends Meal_Book
{
	void choice()
	{
		Scanner sc = new Scanner(System.in);
		int options;
		System.out.println("******************CHOOSE YOUR OPTIONS*************************************************");
		System.out.println("PRESS 1 FOR GETTING ROOM FOR A SINGLE SEATER.");
		System.out.println("PRESS 2 FOR GETTING ROOM FOR A TWO SEATER.");
		System.out.println("PRESS 3 FOR GETTING ROOM FOR MORE THAN TWO SEATER.");
		System.out.println("PRESS 4 FOR EXIT.");
		System.out.print("SELECT OPTIONS: ");
		options=sc.nextInt();
		switch(options)
		{
			case 1:
				if(options==1)
				{
					System.out.println(" YOUR CHOICE IS SINGLE SEATER  ");
					System.out.println(" PRICE FOR SINGLE SEATER PER DAY IS 1500 RS");
					System.out.println(" ");
					break;
				}
			
			case 2:
				if(options==2)
				{
					System.out.println(" YOUR CHOICE IS  TWO SEATER ");
					System.out.println(" PRICE FOR TWO SEATER PER DAY IS 2000 RS");
					System.out.println(" ");
					break;
				}

			case 3:
				if(options==3)
				{
					System.out.println(" YOUR CHOICE IS MORE THAN TWO SEATER  ");
					System.out.println(" PRICE FOR MORE THAN TWO SEATER PER DAY IS 5000 RS");
					System.out.println(" ");
					break;
				}
	
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("  YOU ENTERED WRONG PLEASE TRY AGAIN ");
				break;
		}
	}
}		

class Meal_Book extends Total_Bill
{	void option()
	{
		Scanner sc=new Scanner(System.in);
		int choices;
		System.out.println("******************CHOOSE YOUR CHOICES*************************************************");
		System.out.println("PRESS 1 FOR GETTING VEGETARIAN FOOD");
		System.out.println("PRESS 2 FOR GETTING NON VEGETARIAN FOOD");
		System.out.println("PRESS 3 FOR GETTING NO FOOD ITEM");
		System.out.println("PRESS 4 FOR EXIT");
		System.out.print("SELECT choices: ");
		choices=sc.nextInt();
		switch(choices)
		{
			case 1:
				if(choices==1)
				{	
					System.out.println(" YOUR CHOICE IS VEGETARIAN FOOD ");
					System.out.println(" PRICE FOR VEGETARIAN FOOD PER DAY WHICH INCLUDE BREAKFAST ,LUNCH,SNACKS AND DINNER  IS RS 200");
					System.out.println(" ");
					break;
				}
			case 2:
				if(choices==2)
				{
					System.out.println(" YOUR CHOICE IS  NON VEGETARIAN FOOD  ");
					System.out.println(" PRICE FOR NON VEGETARIAN FOOD PER DAY WHICH INCLUDE BREAKFAST, LUNCH,SNACKS AND DINNER IS 400 RS");
					System.out.println(" ");
					break;
				}
			case 3:
				if(choices==3)
				{
					System.out.println(" YOUR CHOICE IS GETTING NO FOOD ITEM ");
					System.out.println(" PRICE FOR GETTING NO FOOD ITEM PER DAY IS 0 RS");
					System.out.println(" ");
					break;
				}
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("  YOU ENTERED WRONG PLEASE TRY AGAIN ");
				break;
		}
	}
}

class Total_Bill
{
	int get()
	{
		int n, seater, food;
		int bill=0;

		Scanner sc=new Scanner(System.in);

		System.out.print(" ENTER THE NO OF DAYS THAT U WANT TO SPENT IN A ROOM:	");
		n=sc.nextInt();

		System.out.print("  ENTER THE TYPE OF SEATER THAT UH CHOOSEN(1 -> 1 seater/2 -> 2 seater/ 3 -> more than 2 seater:	");
		seater=sc.nextInt();
		
		System.out.print("  ENTER THE TYPE OF FOOD THAT UH CHOOSEN(1 -> veg food/2 -> non veg/ 3 -> no food:		");
		food=sc.nextInt();

		switch(seater)
		{
			case 1:
				if(food==1)
				{
					bill=n*(1500+200);
				}
				else if(food==2)
				{
					bill=n*(1500+400);
				}
				else if(food==3)
				{
					bill=n*1500;
				}
			case 2:
				if(food==1)
				{
					bill=n*(2000+200);
				}
				else if(food==2)
				{
					bill=n*(2000+400);
				}
				else if(food==3)
				{
					bill=n*2000;
				}
			case 3:
				if(food==1)
				{
					bill=n*(5000+200);
				}
				else if(food==2)
				{
					bill=n*(5000+400);
					return bill;
				}
				else if(food==3)
				{
					bill=n*5000;
					return bill;
				}

		}
		return bill;
	}

	void dp()
	{
		System.out.println("************************THANK YOU FOR VISITING PLEASE VISIT AGAIN ************************************");
	}
}




class Main
{
	public static int get()
	{
		int n;
		Scanner s1 = new Scanner(System.in);
		System.out.println("******************WELCOME TO OUR HOTEL MANAGEMENT******************");
		System.out.println("*******************PLEASE ENTER YOUR INFORMATION*******************");
		System.out.print("Enter total no of persons: ");
		n = Integer.parseInt(s1.nextLine());
		
		String name[] = new String[n];
		String email_id[] = new String[n];
		long phn_no[] = new long[n];
		long adhar_id[] = new long[n];
		String adr[] = new String[n];

		for(int i=0; i<n; i++)
		{
			System.out.println("");
			System.out.print("Enter your name: ");
			name[i] = s1.next();
			System.out.print("enter your email_id: ");
			email_id[i] = s1.next();
			System.out.print("enter your address: ");
			adr[i] = s1.next();
			System.out.print("enter your phn_no: ");			              
			phn_no[i] = s1.nextLong();
			System.out.print("enter your adhar_id: ");
			adhar_id[i] = s1.nextLong();
		}		
	
		System.out.println(" "); 
		System.out.println("****************************YOUR INFORMATION ARE*********************************");
		System.out.println("____________________________________________________________________________________________________________");
		System.out.println("	NAME	|	EMAIL ID	|	PHONE NO	|	ADHAAR NO	|	ADDRESS		");
		System.out.println("____________________________________________________________________________________________________________");
		for(int i=0; i<n; i++)
		{
		System.out.println(name[i]+"	        "+email_id[i]+"	            "+phn_no[i]+"		   "+adhar_id[i]+" 		  "+adr[i]);
		}
		return n;
	}
	
	
	public static void main(String args[])
	{
		int y=get();
		Room_Book r=new Room_Book();
		r.choice();

		Meal_Book m=new Meal_Book();
		m.option();

		Total_Bill t=new Total_Bill();
		int k=t.get();
		System.out.println("YOUR TOTAL COST FOR ENTIRE THE PROCESS IS :"+k);
		System.out.println("PROCEED TO PAY BY CASH....loading...");
		t.dp();
	}
}