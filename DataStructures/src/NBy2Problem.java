import java.util.HashMap;
import java.util.Map;

public class NBy2Problem {

    public static int find(int[] arr,int n){
        int count =0;
        Map<Integer, Integer > map = new HashMap<>();
        for(int i=0; i<n ;i++){
            int val = map.getOrDefault(arr[i], 0);
            map.put(arr[i], val + 1);
        }
        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            if(it.getValue() > (n/2)){
                return it.getValue();
            }
        }
        return -1;
    }

    public static int mooreAlgo(int arr[]){ //we use moores algo for finding majority element
        int count=0, count1 =0, elem =0;
        for(int i=0; i < arr.length; i++){
            if(count ==0)
            {
                count =1;
                elem = arr[i];
            }
            else if(elem  == arr[i]){
                count ++;
            }else{
                count--;
            }
        }
        for(int i =0; i<arr.length;i++){
            if(arr[i] == elem) count1++;
        }
        if(count1 > (arr.length/2)) return elem;
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {4,4,2,4,3,4,4,3,2,4};
        int n = arr.length;
        int res = mooreAlgo(arr);
        System.out.println(res);
    }

}
