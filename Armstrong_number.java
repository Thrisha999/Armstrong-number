//ARMSTRONG NUMBER//
import java.util.*;
class Armstrong_no
{
  int count=0;
  int display(int n)
  {
    int temp, r , sum=0;
    temp = n;
    while (n>0)
    {
      count++;
      n=n/10;
    }
    while(temp>0)
    {
      r=temp%10;
      sum = sum + (int)Math.pow(r,count);
      temp = temp/10;
    }
    return sum;
  }
}
public class Armstrong_number
{
  public static void main(String[] args)
  {
    int n,m,ans;
    System.out.println("Enter the number :");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
    m=n;
    Armstrong_no num = new Armstrong_no();
    ans = num.display(n);
    if(ans==m)
    {
      System.out.println("Entered number "+m+" is an Armstrong number ");
    }
    else
    {
      System.out.println("Entered number "+m+" is not an Armstrong number");
    }
  }
}
