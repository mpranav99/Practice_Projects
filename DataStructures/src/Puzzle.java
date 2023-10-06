import java.util.Scanner;

public class Puzzle {

    public int findMaxProfit(int arr[]){
        int smallest=0;
        int greatest= 0;
            for(int j = 0; j<arr.length-1;j++){
                if(arr[j]< arr[j+1]){
                    smallest = (smallest == 0)?arr[j]:(arr[j]<smallest?arr[j]:smallest);
                    greatest = (greatest== 0)?arr[j+1]:(arr[j+1]>greatest?arr[j+1]:greatest);

                }


            }
        return greatest - smallest;
        }

        public static  void main (String args[]){
            Puzzle puzzle = new Puzzle();
            int arr_size = 106;
            int n;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number of elements ");
            n=sc.nextInt();
            System.out.print("Enter the elements: ");
            int[] array = new int[arr_size];
            for(int i=0; i<n; i++)
            {
                array[i]=sc.nextInt();
            }
            int profit  = puzzle.findMaxProfit(array);
            System.out.println("Profit :"+profit);
        }

    }




