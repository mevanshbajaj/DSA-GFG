
class Solution {
    public static ArrayList<String> fizzBuzz(int n) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i % 5 == 0 && i % 3 == 0) result.add("FizzBuzz");
            else if(i % 3 == 0) result.add("Fizz");
            else if(i % 5 == 0) result.add("Buzz");
            else result.add(String.valueOf(i));
        }
        return result;
    }
}
