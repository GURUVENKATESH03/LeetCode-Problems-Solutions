class Solution {
    public int climbStairs(int n) {
        InnerClimbing_Stairs_1 ics1=new InnerClimbing_Stairs_1();


        return ics1.b(n);
    }
}
class InnerClimbing_Stairs_1 {

    public int b(int c){

        //Decalare a array named as array with size one greater than value of the c
        int []array=new int[c+1];

        //initialize the first two indexes of the array as 0 and 1 can be correspondingly climbed up by only one step. 
        array[0]=1;
        array[1]=1;

        //to find out the steps if greater than  the value of 1 the for loop used here it is used to calculate the value of the next step by adding it from a two step previous and a step previous. 
        for(int i=2;i<=c;i++){
            array[i]=array[i-1]+array[i-2];
        }
        //to display the array.
        //System.out.println(Arrays.toString(array));
        return array[c];
    }    
}