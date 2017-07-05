# thamizh1
import java.io.*;
import java.util.*;
public class Main1
{
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the year:");
  int year=Integer.parseInt(br.readLine());
    if(year%4==0 || year%100!=0)
  {
    System.out.println("Leap year");
  }
  else if(year%100==0)
  {
    System.out.println("Leap year");
  }
  else
  {
    System.out.println("No leap year");
  }
}
}
