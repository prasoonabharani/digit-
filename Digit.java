import java.io.*;
import java.util.*;
 public class Digit
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n;
n=sc.nextInt();
int r;
while(n>0)
{
r=n%10;
System.out.println(r);
n=n/10;
}}}
