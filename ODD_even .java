import java.util.*;
class odd_even{
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    if(n%2==0)
    {
      System.out.print(n+ " is even");
    }
    else
    {
      System.out.print(n+ " is odd");
    }
  }
}
