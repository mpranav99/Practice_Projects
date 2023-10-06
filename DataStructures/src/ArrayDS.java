import java.lang.reflect.Array;

public class ArrayDS {
   public int array[];
//
   public int[] reverseArray(int arr[],int start,int end){
       System.out.println(start);
       System.out.println(end);
        while(start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
   }

   public int[] rotateArray(int arr[],int start,int end){
       int i =0;
       while(end>0){
           int temp = arr[end];

//           System.out.println(temp);
//           System.out.println(end-1);
           arr[end]=arr[end-1];
//           System.out.println(arr[end]+"end");
           arr[end-1]=temp;
//           System.out.println(arr[end-1]+"end-1");
           end--;
       }
       return arr;
   }
   public int[] reArragngeArray(int arr[]){
       int temp =-1;
       int arr2[] = new int[arr.length];
       for(int i =0; i<arr.length;i++){
           if(arr[i]==i){
               arr[i]=i;
           }else{
               arr[i]=-1;
           }

//           for(int j=0;j<arr.length;j++){
//
//               if(arr[j]==i){
//                  temp= arr[j];
//               }
//
//           }


       }
       return arr;
   }

   public int kandaneAlgo(int [] arr){ // this algo is to find the max value from a sub-array.
       int max_so_far= Integer.MIN_VALUE;
       int max_ending_here = 0;

       for(int i=0;i<arr.length;i++){
           max_ending_here = max_ending_here + arr[i];
           if(max_so_far < max_ending_here){
               max_so_far = max_ending_here;
           }
           if(max_ending_here < 0){
               max_ending_here = 0;
           }
       }
       return max_so_far;
   }

   public int[] dutchNationalFlagProblem(int[] arr){
       int low=0,mid=0,temp=0;
       int high = arr.length-1;
       while(mid<=high){
           switch (arr[mid]){
                case 0: {
                    temp = arr[low];
                    arr[low]=arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
               case 1: {
                   mid ++;
                   break;
               }
               case 2: {
                   temp = arr[mid];
                   arr[mid] = arr[high];
                   arr[high] = temp;
                   high--;
                   break;
               }

           }
       }
       return arr;
   }

   public int[] dutchNFP(int[] arr){
       int cnt0=0,cnt1=0,cnt2=0;
       for(int i=0;i<arr.length;i++){
           if(arr[i] == 0){
               cnt0 ++;
           }else if(arr[i] == 1){
               cnt1++;
           }else{
               cnt2++;
           }
       }
       int i =0;

       while(cnt0>0){
           arr[i++] = 0;
           cnt0--;
       }
       while(cnt1>0){
           arr[i++] = 1;
           cnt1--;
       }
       while(cnt2>0){
           arr[i++] = 2;
           cnt2--;
       }
        return arr;
   }

    public static void main(String args[]){
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        System.out.println(arr);
        ArrayDS a = new ArrayDS();
        int arr1[]=a.rotateArray(arr,0,arr.length-1);
//        int arr2[] = a.reArragngeArray(arr);
        int arr2[] = a.dutchNFP(arr);
//        int kandaneMaxValue = a.kandaneAlgo(arr);
//        System.out.println(kandaneMaxValue);
//        System.out.println(arr1);
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
//            arr[j]=arr[i];


        }
    }
}
