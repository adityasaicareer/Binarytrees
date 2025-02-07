import java.util.*;
public class mergesort {

    public static int[] merge(int left[],int right[])
    {
        int output[]=new int[left.length+right.length];
        int k=0;
        int i=0;
        int j=0;
        while(i<left.length && j<right.length)
        {
            if(left[i]<right[j])
            {
                output[k++]=left[i++];
            }
            else{
                output[k++]=right[j++];
            }
        }

        while(i<left.length)
        {
            output[k++]=left[i++];
        }

        while(j<right.length)
        {
            output[k++]=right[j++];
        }
        return output;
    }

    public static int[] sort(int arr[])
    {
        int mid=arr.length/2;
        if(arr.length<2)
        {
            return arr;
        }
        int left[]=sort(Arrays.copyOfRange(arr,0,mid));
        int right[]=sort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the Number of Numbers:");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=1;i<=n;i++)
        {
            arr[i-1]=sc.nextInt();
        }
        int result[]=sort(arr);

        for(int k=1;k<=result.length;k++)
        {
            System.out.print(result[k-1]+" ");
        }

        sc.close();

    }
    
}
