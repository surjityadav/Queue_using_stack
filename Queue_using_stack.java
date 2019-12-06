
import java.util.Scanner;
import java.util.Stack;


public class Queue_using_stack 
{
    static Stack<Integer> s1=new Stack<Integer>();
    static Stack<Integer> s2=new Stack<Integer>();
    
    static void enqueue(int x)
    {
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
    }
    static int dequeue()
    {
        if(s1.isEmpty())
        {
            System.out.println("Queue is Empty");
            System.exit(0);
        }
        int x=s1.peek();
        s1.pop();
        return x;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Queue_using_stack q=new Queue_using_stack();
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            q.enqueue(sc.nextInt());
        }
        System.out.println(q.dequeue());
        
    }
}
