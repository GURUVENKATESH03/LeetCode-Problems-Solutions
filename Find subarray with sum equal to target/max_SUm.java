

import java.util.*;

public class max_SUm {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9,10};

        int length=arr.length;

        //Enter the target value

        int target=sc.nextInt();

        ArrayList<Integer> ar=new ArrayList<>();

        for(int i=0;i<length;i++){
            int position=i;
            int endposition=0;
            int sum=arr[i];
            if(sum==target){
                ar.add(position+1);
                ar.add(position+1);
                System.out.println(ar);
                return;
            }
            for(int j=i+1;j<length;j++){
                sum+=arr[j];
                if(sum==target){
                    endposition=j;
                    ar.add(position+1);
                    ar.add(endposition+1);

                    System.out.println(ar);
                    return;
                }
            }
        }
        
        //The below line gets executed only if the inner if statement fails
        ar.add(-1);
        System.out.println(ar);
        
    }
}
