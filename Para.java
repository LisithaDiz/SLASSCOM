
import java.util.*;

class Para {
    public boolean isValid(String s) {
        boolean bool;
        int i = 0;
        int q=s.length();

        while (q>0) {
            if (s.contains("()")||s.contains("{}")||s.contains("[]")) {
                s=s.replace("()","");
                s=s.replace("[]","");
                s=s.replace("{}","");
            }else {
                break;
            }
            q=s.length();
        }
        if(q==0){
            bool=true;
        }else {
            bool=false;
        }

        return bool;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Parenthesis");
        String ss = in.nextLine();
        Para x = new Para();
        System.out.println(x.isValid(ss));
    }
}
