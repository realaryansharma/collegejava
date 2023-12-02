import java.util.Scanner;

public class Combinations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int []a = new int[3];
        
        for(int i=0;i<3;i++)
        {
            System.out.print("\n Enter number "+(i+1)+" :");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    if(i!=j && i!=k && j!=k)
                    {
                        System.out.println(a[i]+" "+a[j]+" "+a[k]);
                    }
                }
            }
        }


    }

}

//25