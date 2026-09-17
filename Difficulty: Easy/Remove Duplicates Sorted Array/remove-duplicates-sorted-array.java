class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(arr[0]);
        for(int i=1;i<arr.length;i++){
          if(arr[i-1]!=arr[i])  {
               numbers.add(arr[i]);
          }
        }
        return numbers;
    }
}
