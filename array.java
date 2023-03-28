import java.util.Scanner;
class ary{
    int[] a;
   

void read_array()
{
    a=new int [5];
    Scanner se=new Scanner(System.in);
    System.out.println("Enter Array Elements:");
    for(int i=0;i<5;i++)
    {
        a[i]=se.nextInt();
    }
}
void print_array()
{
    System.out.println("Array elements are:");
    for(int i=0;i<5;i++)
    {
    System.out.println(a[i]);
    }
}
public static void main(String[] args){
    ary obj=new ary();
    obj.read_array();
    obj.print_array();
}}