import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {
    
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter 1 for the weekly package, 2 for the monthly package, or 3 for the yearly package. If you do not wish to purchase a package, enter 0");
    int choice = scan.nextInt();

    if(choice == 1)
    {
      System.out.println("How many Weeks would you like to purchase?");
      int time = scan.nextInt();
      double intCost = 3.21;
      double finalCost = costCalculator(time, intCost, intCost);
      System.out.println("That will cost you " + finalCost);
    }
    if(choice == 2)
    {
      System.out.println("How many Months would you like to purchase?");
      int time = scan.nextInt();
      double intCost = 30.96;
      double finalCost = costCalculator(time, intCost, intCost);
      System.out.println("That will cost you " + finalCost);
    }
    if(choice == 3)
    {
      System.out.println("How many Years would you like to purchase?");
      int time = scan.nextInt();
      double intCost = 105.43;
      double finalCost = costCalculator(time, intCost, intCost);
      System.out.println("That will cost you " + finalCost);
    }
    else
    {
      System.out.println("Have a nice day.");
    }
  }
  public static double costCalculator(int time, double cost, double originalCost)
  {
    if(time == 0)
    {
      return cost;
    }
    else
    {
      return costCalculator(time - 1, cost + originalCost, originalCost);
    }
  }
}