import java.util.Scanner;

public class linearSearch {
   public  static int linearSearchAlgo(int a[],int key){
      for (int i=0;i<a.length;i++){
         if (a[i]==key){
            return i;
         }
      }
      return -1;
   }

   public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
      int arr[]={12,43,21,56,34,78,98,56};
      System.out.println("Enter the key : ");
      int key=sc.nextInt();
      int index=linearSearchAlgo(arr,key);
      if (index != -1){
         System.out.println("The element found at index : " + index);
      }else{
         System.out.println("The element  is not found ");

      }
   }
}
