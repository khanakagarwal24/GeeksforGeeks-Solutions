class Solution {
    public void segregateElements(int[] arr) {
        // code here
          ArrayList<Integer> p = new ArrayList<>();
            ArrayList<Integer> n = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                if(arr[i]<0){
                   n.add(arr[i]); 
                }
                else{
                    p.add(arr[i]);
                }
            }
            int index = 0;
           for (int i = 0; i < p.size(); i++) {
            arr[index++] = p.get(i);
           }
           for (int i = 0; i < n.size(); i++) {
        arr[index++] = n.get(i);
    }}
}
      
    