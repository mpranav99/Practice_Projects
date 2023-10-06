public class KandaneAlgo {

    public static int kandaneAlgo(int arr[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                max = Math.max(max, sum);
            }
        }
        return max;
    }

    public static int kandanealgoOptimal(int arr[]){
        int max = Integer.MIN_VALUE, sum=0, start=0, arrStart = -1 , arrEnd = -1;
       for(int i =0; i<arr.length ; i++){
           if(sum == 0) {
               start = i;
           }
           sum += arr[i];
           if(sum > max){
               max = sum;
               arrStart = start; arrEnd=i;
           }
           if(sum < 0){
               sum =0;
           }
           if(max < 0) max =0;
       }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        int res = kandaneAlgo(arr);
        System.out.println(res);
    }
}
