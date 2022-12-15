class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
      int[] temporary = new int[m+n];
      for(int index=0;index<m;index++){
          temporary[index] = nums1[index];
      }  
      int firstindex = 0;
      int secindex = 0;
      int resultindex = 0;
      while(firstindex<m && secindex<n){
           if(temporary[firstindex] <= nums2[secindex]){
               nums1[resultindex] = temporary[firstindex];
               resultindex++;
               firstindex++;
           }else{
               nums1[resultindex] = nums2[secindex];
               resultindex++;
               secindex++;
           }
      }
      for(int index=secindex;index<n;index++){
          nums1[resultindex] = nums2[index];
          resultindex++;
      }
      for(int index=firstindex;index<m;index++){
          nums1[resultindex] = temporary[index];
          resultindex++;
      }

    }
}