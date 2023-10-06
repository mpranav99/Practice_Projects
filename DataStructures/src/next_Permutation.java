import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class next_Permutation {

    public static List<Integer> nextPerm(List<Integer> A){
        int index = -1;
        int n = A.size();
        for(int i=n-2; i >=0; i--){
            if(A.get(i) > A.get(i+1)){
                index = i;
                break;
            }
        }
        if(index == -1){
            Collections.reverse(A);
            return A;
        }
        for(int i=n-1; i>index; i--){
            if(A.get(i) > A.get(index)){
                int temp  = A.get(index);
                A.set(index , A.get(i));
                A.set(i , temp);
                break;
            }
        }
        List<Integer> sublist = A.subList(index + 1, n);
        Collections.reverse(sublist);
        return A;
    }

    public static void main(String[] args) {
//        int[] arr = {2, 1, 5, 4, 3, 0, 0};
        List<Integer> array = Arrays.asList(new Integer[] {2, 1, 5, 4, 3, 0, 0});
        List<Integer> ans = nextPerm(array);
        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");

    }
}
