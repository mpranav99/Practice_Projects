import java.util.Scanner;

public class Puzzle2 {

    //ABCDE : 123

    public int getDecimalValue(String str){
        int result = 0;
        for(int i =0 ; i< str.length(); i++){
            char c = str.charAt(i);
            result = result*26 + (c-64);
        }
        return result;
    }

    public static void main(String args[]){
        Puzzle2 p = new Puzzle2();
        Scanner sc= new Scanner(System.in);  //System.in is a standard input stream
        System.out.print("Enter a string: ");
        String str= sc.next();   //reads string before the space
        if(str.length()>7){
            System.out.println("Please enter valid String");
        }else {
//        System.out.print("You have entered: "+str);
            int res = p.getDecimalValue(str);

            System.out.println(res);
        }
    }

}


