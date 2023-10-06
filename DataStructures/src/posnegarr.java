import java.util.ArrayList;

public class posnegarr {

    public static void posnegarrange(int arr[]){// this is approach is for elements with equal pos and neg
        int pos = 0, neg =1;
        int arr1[] = new int[arr.length];
        for(int i =0; i< arr.length; i++){
            if(arr[i] > 0){
                arr1[pos] = arr[i];
                pos += 2;
            }else if(arr[i] < 0){
                arr1[neg] = arr[i];
                neg += 2;
            }
        }
        for(int i= 0; i < arr1.length ; i++){
            System.out.println(arr1[i]);
        }
    }

    public static void rearrange(int arr[]){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0; i< arr.length; i++){
            if(arr[i] > 0){
                pos.add(arr[i]);
            }else{
                neg.add(arr[i]);
            }
        }
        if(pos.size() > neg.size()){
            for(int i=0; i < neg.size(); i++){
                arr[2*i] = pos.get(i);
                arr[(2*i) + 1] = neg.get(i);
            }
            int index = neg.size() *2;
            for(int i = index ; i < pos.size() ; i++){
                arr[i] = pos.get(i);
            }
        }else{
            for(int i=0; i < pos.size(); i++){
                arr[2*i] = pos.get(i);
                arr[(2*i) + 1] = neg.get(i);
            }
            int index = pos.size() *2;
            for(int i = index ; i < neg.size() ; i++){
                arr[i] = neg.get(i);
            }
        }
        for(int i= 0; i < arr.length ; i++){
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,1,-2,-3};
//        posnegarrange(arr);
        rearrange(arr);
    }
}
