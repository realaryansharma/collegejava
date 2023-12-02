import java.util.Scanner;
interface stackinterface  {
    void push(int x);
    int pop();
    void display();
}
class stackclass implements stackinterface
{
    int top=-1;
    int ar[]=new int[5];
    public void push(int x)
    {
        if(top==4)
            System.out.println("stack is full");
        else
        {
            ar[++top]=x;
        }
    }
    public int pop()
    {
        if(top==-1)
            return -1;
        else
            return ar[top--];
    }
    public void display()
    {
        if(top==-1)
            System.out.println("Stack is empty");
        System.out.println("Stack: ");
        for(int i=0;i<=top;i++)
            System.out.println(ar[i]);
    }
}
class Exp5Q5
{
    public static void main(String[] args) {
        stackclass ob=new stackclass();
        Scanner in=new Scanner(System.in);
        int ans;
        do
        {
            System.out.println("Press 1 to push, 2 to pop, 3 to display");
            int choice=in.nextInt();
            switch(choice)
            {
                case 1:System.out.println("Enter a value");
                    int x=in.nextInt();
                    ob.push(x);
                    break;
                case 2:
                    x=ob.pop();
                    if(x==-1)
                        System.out.println("stack is empty");
                    else
                        System.out.println(x+" is deleted from stack");
                    break;
                case 3:
                    ob.display();
                    break;

            }
            System.out.println("to continue press 1");
            ans=in.nextInt();
        }while(ans==1);
        in.close();
    }
}
