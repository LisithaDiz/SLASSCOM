import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the roman number : ");
        String rNum = input.nextLine();

        Main ob = new Main();
        System.out.println(ob.romanToInt(rNum));
    }
    public int romanToInt(String s) {
        HashMap<Character, Integer> pp= new HashMap<Character, Integer>();
        pp.put('I',1);
        pp.put('V',5);
        pp.put('X',10);
        pp.put('L',50);
        pp.put('C',100);
        pp.put('D',500);
        pp.put('M',1000);

        int j=s.length();
        int sum =pp.get(s.charAt(j-1));
        j--;
                while (j > 0) {
                            if (pp.get(s.charAt(j)) <= pp.get(s.charAt(j - 1))) {
                                sum = pp.get(s.charAt(j - 1)) + sum;

                            } else {
                                sum = sum - pp.get(s.charAt(j - 1));
                            }
                            j--;
                }
        return sum;
    }
}