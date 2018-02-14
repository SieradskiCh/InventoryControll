
import java.util.*;

public class EmployeeMenu
	{
		public static void initialMenu()
		{
			int decision = 0;
			try
			{
				Scanner employeeIn = new Scanner(System.in);
				System.out.println("What would you like to look at? \n(1)Orders \n(2)Expences \n(3)Go Back");
				decision = employeeIn.nextInt();
			}
			catch(InputMismatchException exc)
			{
				System.out.println("You need to enter a number, either 1 or 2");
				initialMenu();
			}
			if(decision == 1)
					orders();
			else if(decision == 2)
					expences();
			else if(decision == 3)
					InitialMenu.firstQuestion();
			else
				{
					System.out.println("Please enter either 1 or 2");
					initialMenu();
				}
		}

		private static void expences()
			{
				for(int i = 0 ; i < InventoryAdd.inventory.size() ; i++)
					{ 
						int totalCost = InventoryAdd.inventory.get(i).getSold() + InventoryAdd.inventory.get(i).getStoreCost();
						System.out.println( "For: " + InventoryAdd.inventory.get(i) + " We have sold: " + InventoryAdd.inventory.get(i).getSold() + " And it cost :" + totalCost); 
					}
				System.out.println();
				initialMenu();
				
			}

		private static void orders()
			{
				System.out.println();
				for(int i = 0 ; i < InventoryAdd.inventory.size() ; i++)
					{
						System.out.println(InventoryAdd.inventory.get(i).getName() + " # sold: " + InventoryAdd.inventory.get(i).getSold());
					}
				System.out.println();
				initialMenu();
				
			}
	}
