import java.util.Scanner;
public class AllthreeSortingTechniques {
    public static void BubbleSort(int a[]){
        System.out.println("Bubble Sorting :--");
        int tem=0;
        for(int i=0;i<a.length-1;i++){
            for(int j=1;j<a.length-i;j++){
                if(a[j]>a[j+1]){
                tem=a[j];
                a[j]=a[j+1];
                a[j+1]=a[j];    
                }
            }
        }
    }
        public static void SelectionSort(int a[]){
            System.out.println("Selection Sorting :--");
            int temp=0;
            for(int i=0;i<a.length;i++){
                int min=i;
                  for(int j=i+1;j<a.length;j++){
                    if(min>j){
                        min=j;
                    }
                    temp=a[min];
                    a[min]=a[i];
                    a[i]=temp;
                }
            }
        }
        public static void InsertionSort(int a[]){
            System.out.println("Inserting Sorting :--");
            int temp=0;
            for(int i=0;i<a.length;i++){
                for(int j=i+1;j<a.length;j++){
                    if(a[j]<a[i]){
                        temp=a[j];
                        a[j]=a[i];
                        a[i]=temp;
                    }
                }
            }
        }
        public static void CountingSort(int a[]){
            System.out.println("Counting Sorting :--");
            int largest=Integer.MIN_VALUE;
            for(int i=0;i<a.length;i++){
                largest=Math.max(largest,a[i]);
            }
            int count[]=new int[largest+1];
            for(int i=0;i<a.length;i++){
                count[a[i]]++;
            }
            int j=0;
            for(int i=0;i<count.length;i++){
                while(count[i]<0){
                    a[j]=count[i];
                    j++;
                    count[i]--;
                }
            }
        }
        public static void printArray(int a[]){
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
            System.out.println(" ");
        }
 

    public static void main(String[] args){
      
         int a[]={1,3,7,2,8,4};
          BubbleSort(a);
            printArray(a);
          /*  SelectionSort(a);
            printArray(a);
            InsertionSort(a);
            printArray(a);
            CountingSort(a);
            printArray(a);*/
    }
}
