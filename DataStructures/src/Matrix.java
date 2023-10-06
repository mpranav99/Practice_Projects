import java.util.*;

public class Matrix {

    public void reverseMatrix(int [][] arr,int n){
        int[] arr1 = new int[n*n];
        int k=0;
        for(int i=n-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void uniqueElement(int[][] arr,int n,int m){
        int count = 0,k =0,val=n*m;
        int[] b = new int[val];
        Map<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[k++]=arr[i][j];
//                set.add(arr[i][j]);
            }
        }
        for(int c=0;c<val;c++){
            System.out.print(b[c]);
            if(map.containsValue(b[c])) {
                System.out.println("same element");
                count=count+1;
                map.replace(count,b[c]);
            }
            else {
                System.out.println("unique");
                map.put(count,b[c]);
            }

        }
//        Iterator itr  =  map.iterator();
//        while(itr.hasNext()){
//
//            if(map.get(count)>1)
//                map.remove(count);
//            System.out.println(itr.next());
//        }
        for(Integer i : map.values()){
            if(map.get(count)>1)
                map.remove(count);
            System.out.println(i);
        }

    }

    public static void main(String[] args)
    {
        int[][] mat
                = { { 1, 2, 3 }, { 2, 1, 6 }, { 6, 2, 9 } };
        int n = 3;
        int k = 3;
        System.out.println("Original Matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
//
//        System.out.println("\nMatrix After Sorting:");
        Matrix m = new Matrix();
                System.out.println("\nMatrix After :");

//        m.reverseMatrix(mat,3);
        m.uniqueElement(mat,n,k);
    }


}
