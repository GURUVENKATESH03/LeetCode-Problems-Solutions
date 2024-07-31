class Solution {
    public String countAndSay(int n) {
        return Count_Say(n);
    }
    static String Count_Say(int n){

        ArrayList<String> arr  = new ArrayList<>();

        arr.add(String.valueOf(1));
        arr.add(String.valueOf(11));
        for(int i =2;i < n ;i++){
            int count = 1;
            String temp  = arr.get(i-1);
            StringBuilder sb= new StringBuilder();
            for(int j = 1 ; j < temp.length() ; j++){
                if(temp.charAt(j) == temp.charAt(j-1)){
                    count+=1;
                }else{
                    sb.append(String.valueOf(count)).append(temp.charAt(j-1));
                    count = 1;
                }
            }
            sb.append(String.valueOf(count)).append(temp.charAt(temp.length()-1));
            arr.add(sb.toString());
        }
        System.out.println(arr);
        return arr.get(n-1);
    }
}