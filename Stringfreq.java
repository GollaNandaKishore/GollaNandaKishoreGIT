import java.io.*;
import java.util.*;
class A
{
public static void main(String...aa)
{
Scanner s=new Scanner(System.in);
String ss=s.next();
char c[]=ss.toCharArray();
LinkedHashSet <Character> ob=new LinkedHashSet <Character>();
for(int i=0;i<c.length;i++)
ob.add(c[i]);
Object[] obj=ob.toArray();
for(Object ii:obj)
System.out.println(ii);
}
}