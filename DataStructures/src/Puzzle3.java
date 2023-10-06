
import java.util.Scanner;
import java.util.Stack;

public class Puzzle3 {

    public boolean matchString(String str){//() {} []
        boolean match = false;
//        Map<String,String> map = new HashMap<String,String>();
//        for(int i =1; i<str.length(); i=i+2){
//           switch (str.charAt(i)){
//               case ')' : match = ( str.charAt(i-1) == '(')?true:false;
//                            break;
//               case ']' : match = ( str.charAt(i-1) == '[')?true:false;
//                            break;
//               case '}' : match = ( str.charAt(i-1) == '{')?true:false;
//                            break;
//           }
//        }
//        return match;
        Stack <Character> st = new Stack<Character>();
       for(int i =0; i<str.length(); i++){
           char current = str.charAt(i);
           if(current == '(' || current == '[' || current == '{'){
               st.push(current);
               continue;
           }
           if(st.isEmpty()){
                match= false;
                continue;
           }
           char popChar;
           switch (current){
               case ')' : popChar = st.pop();
                            match = (popChar == '[' || popChar == '{')? false : true;//({})
                            break;
               case ']' : popChar = st.pop();
                            match = (popChar == '(' || popChar == '{')? false : true;//({})
                            break;
               case '}' : popChar = st.pop();
                            match = (popChar == '[' || popChar == '(')? false : true;//({})
                           break;
           }

       }
        return  match;
    }

    public static void main(String args[]){
        Puzzle3 p = new Puzzle3();
        String inputStr;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input string to check:");
        inputStr = sc.nextLine();
        if(inputStr.length() >104){
            System.out.println("Please provide a valid String!!");
        }
        boolean res = p.matchString(inputStr);
        System.out.println(res);
    }
}
