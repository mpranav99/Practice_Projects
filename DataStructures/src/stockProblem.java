public class stockProblem {

    public static int sellStock(int arr[]){
        int min = Integer.MAX_VALUE, profit =0, start= -1, end = -1;
        for(int i =0; i<arr.length;i++) {
            if (arr[i] < min) {
                min = arr[i];
                start = i;
            }
            if(arr[i] - min > profit){
                profit = arr[i] - min;
                end = i;
            }
            profit = Math.max(profit, arr[i] - min);
        }
        System.out.println("The start day must be " + start + " and end can be"+ end);
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = {7,6,4,3,1};
        int res = sellStock(arr);
        System.out.println(res);
    }
}
