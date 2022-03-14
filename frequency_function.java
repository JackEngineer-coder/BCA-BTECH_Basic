import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int digit = scn.nextInt();
    int frequency = getDigitFrequency(n, digit);
    System.out.println(frequency);
    
  }
  public static int getDigitFrequency(int n, int digit)
  {
    int counter =0;
    while(n>0)
      {
        int temp =n%10;
        n = n/10;
        if(temp==digit)
        {
          counter++;
          
        }
      }
      return counter;
    
  }
}
