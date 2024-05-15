import java.util.*;
public class hh {
public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);

    //System.out.println("Enter the size of the array");
   //int sizeof_the_array=sc.nextInt();
    System.out.println("Enter the Number i.e the array will be rotated that many times");
    int k=sc.nextInt();

    int[] array={1,2,3,4,5,11,23,45,45,67,7,78};
    int sizeof_the_array= array.length;
    /*System.out.println("Enter the array elements");
    for(int i=0;i<sizeof_the_array;i++){
        System.out.println("Enter the array"+i+"th element");
        array[i]=sc.nextInt();
    }*/
    System.out.println("Displaying the array..");
    for (int i=0;i<sizeof_the_array;i++){
        System.out.print(array[i]+" ");
    }

    //Rotation algorithm starts
    ArrayList<Integer> arr=new ArrayList<>();
    /*for(int i=0;i<sizeof_the_array;i++){

        if(i>k-1){
            int ptr1=sizeof_the_array-k;
            for(int j=k;j<sizeof_the_array;j++){
                array[j-1]=array[j];
            }
            for(int n=0;n<k;n++){
                array[ptr1++]=arr.get(n);
            }
        }else{
            arr.add(array[i]);
        }

    }*/

    for(int i=0;i<sizeof_the_array;i++){
        if(i>=k){
            int temp=array[i];
            array[i]=array[i-k];
            array[i-k]=temp;
        }
    }
    //After the rotation of the array.
    System.out.println("Displaying the array..");
    System.out.println(Arrays.toString(array));
}
}
    
