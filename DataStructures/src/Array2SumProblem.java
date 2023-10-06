import java.util.HashMap;

public class Array2SumProblem {
//    public int[] indices(int arr[], int tar){
//        int newArr[] = new int[2];
//        newArr[0] = newArr[1] = -1;
//        for(int i=0; i< arr.length-1; i++){
//            for(int j =i+1; j <arr.length; j++){
//                if(arr[i] + arr[j]== tar){
//                    newArr[0] = i;
//                    newArr[1]=j;
//                    return newArr;
//                }
//            }
//        }
//        return newArr;
//    }
//
//
//
//    public String twoSum(int arr[], int tar){
//        for(int i=0; i< arr.length-1; i++){
//            for(int j =i+1; j <arr.length; j++){
//                if(arr[i] + arr[j]== tar){
//                    return "Yes";
//                }
//            }
//        }
//        return "No";
//    }

//    public String twoSum(int arr[], int tar){
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for(int i=0; i<arr.length; i++){
//            if(map.containsValue(tar-arr[i])){
//                return "Yes";
//            }
//            map.put(arr[i],i);
//        }
//        return "No";
//    }
    public String twoSum(int arr[] , int tar){
        int left = 0, sum=0;
        int right = arr.length-1;
        while(left< right){
            sum = arr[left] + arr[right];
            if(sum == tar){
                return "Yes";
            }else if(sum < tar){
                left ++;
            }else if(sum > tar){
                right--;
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        int n =5;
        int arr[] = {2,6,5,8,11};
        int tar = 120;
        Array2SumProblem a2s = new Array2SumProblem();
//        String res = a2s.twoSum(arr,tar);
//        int arr1[] = a2s.indices(arr,tar);
        String res = a2s.twoSum(arr,tar);

        System.out.println(res);
//        System.out.println(arr1[0]+ "," +arr1[1]);

    }
}
