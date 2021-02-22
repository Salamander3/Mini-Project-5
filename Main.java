import java.util.Scanner;
class Main {
  public static void main(String[] args) 
  {

    //Creates the scanner object
    Scanner scan = new Scanner(System.in);

    //Asks the user if they would like the type of package they would like to calculate a purchase for.
    System.out.println("Enter 1 for the weekly package, 2 for the monthly package, or 3 for the yearly package. If you do not wish to purchase a package, enter 0");
    int choice = scan.nextInt();

    //Determine the calculation based on which option they would like to calculate for.
    if(choice == 1)
    {
      //This is the calculation for weekly payment
      System.out.println("How many Weeks would you like to purchase?");
      int time = scan.nextInt();
      double intCost = 3.21;
      double finalCost = costCalculator(time, intCost, intCost);
      System.out.println("That will cost you " + finalCost);
    }
    if(choice == 2)
    {
      //This is the calculation for monthly payment
      System.out.println("How many Months would you like to purchase?");
      int time = scan.nextInt();
      double intCost = 30.96;
      double finalCost = costCalculator(time, intCost, intCost);
      System.out.println("That will cost you " + finalCost);
    }
    if(choice == 3)
    {
      //This is the calculation for yearly payments
      System.out.println("How many Years would you like to purchase?");
      int time = scan.nextInt();
      double intCost = 105.43;
      double finalCost = costCalculator(time, intCost, intCost);
      System.out.println("That will cost you " + finalCost);
    }
    else
    {
      //Will println if any other number is imputed or when the calculation finish
      System.out.println("Have a nice day.");
    }
  }
  //method to calculate the cost
  public static double costCalculator(int time, double cost, double originalCost)
  {
    //will trigger the if statement when time reaches zero
    if(time == 0)
    {
      //will return cost when done
      return cost;
    }
    else
    {
      //I had to prefrom the calculation within the return becasue otherwise it would not work.
      return costCalculator(time - 1, cost + originalCost, originalCost);
    }
  }
}