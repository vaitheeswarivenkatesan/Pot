import java.util.*;
import java.lang.Math;

public class Pot{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    double sum=0;
    for(int i=0 ; i<n ; i++){
        int x=sc.nextInt();
        int p=x%10;
        x=(x/10);
        sum=sum+Math.pow(x,p);
    }
    System.out.println((int)sum);
  }
}

