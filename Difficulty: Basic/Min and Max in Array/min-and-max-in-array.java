class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
         ArrayList<Integer> numbers = new ArrayList<>();
         int s=arr[0];
         int l=arr[0];
                for(int i=1;i<arr.length;i++){
                  if(arr[i]>l)  {
                      l=arr[i];
                  }
                  if(arr[i]<s){
                      s=arr[i];
                  }
                }
                numbers.add(s);
                  numbers.add(l);
                return numbers;
            }
        }

    