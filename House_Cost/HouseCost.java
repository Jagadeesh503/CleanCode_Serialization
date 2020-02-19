package epam_task_4;
import java.util.Scanner;
public class HouseCost extends CostOfHouse {
      Scanner s=new Scanner(System.in);
      void HouseCost()
  	{
  		Scanner s=new Scanner(System.in);
  		System.out.println("Enter the area of site in square feet");
  		float area=s.nextFloat();
  		System.out.println("Enter the choice if you need fully automated home\n1.YES\n2.NO");
  		int choice=s.nextInt();
  		if (choice==2)
  		{
  			System.out.println("select the type of house you need\n1.Standard material\n2.Above Standard material\n3.High Standard material");
  			int choice1=s.nextInt();
  			if (choice1<1 && choice1>3)
  			{
  				System.out.println("Enter valid choice");
  			}
  			else
  			{
  				System.out.println("cost of house construction : "+find_cost_house(choice1,area));
  			}
  		}
  		else if(choice==1)
  		{
  			System.out.println("cost of house construction : "+find_cost_house(4,area));
  		}
  		else
  		{
  			System.out.println("Enter valid choice");
  		}
  	}
  	public static void main(String args[])
  	{
  		HouseCost obj1=new HouseCost();
  		obj1.HouseCost();
  	}

}
