import java.util.Scanner;
public class Find_Minimum_And_Maximum_Element_Array{
    public static void FindMinMax(int[] arr){
        if(arr.length==0){
            System.out.println("Array Not Found ");
            return;
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
             min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Minimum Element:"+min);
        System.out.println("Maximum Element:"+max);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Elements stored in the Array:");
                int n=sc.nextInt();
                int[] arr=new int[n];

System.out.println("Enter the "+n+"Elements");
for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
}
        FindMinMax(arr);
    
            sc.close();

    }
}
