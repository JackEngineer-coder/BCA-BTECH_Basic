import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    for(int i=1; i<=n;i++)
      {
        int t = scn.nextInt();
        int count =0;
        for( int div = 1;div<=t;div++)
          {
            if(t%div ==0)
            {
              count++;
            }
          }
        if(count==2)
        {
          System.out.println("prime");
        }
        else
        {
          System.out.println("not prime");
        }
      }
  }
}
