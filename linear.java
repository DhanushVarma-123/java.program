import java.util.Scanner;
class linear{
     public static void main(String args[])
     {
         Scanner in=new Scanner(System.in);
         System.out.println("enter the size of the array");
         int i=0;
         int n=in.nextInt();
         int[]arr=new int[n];
              for(i=0;i<n;i++)
               {
                 arr[i]=in.nextInt();
               }
                 System.out.println("enter the key");
                 int key=in.nextInt();
                 int index=bsearch(arr,key);
                   if(index<0)
                    {
                        System.out.println("element is found");
                    }
                    else{
                        System.out.println("enter is found at index"+index);
                    }
                }
            static int bsearch(int[] array,int num)
                  {
                    for(int i=0;i<array.length;i++)
                   {
                      if(num==array[i])
                   {
                      return i;
                   }
                }
                return -1;
             }
    }            
  
