public class Math {
    public static void main(String[] args) {
        double[] x ={47,15,2,1,14,14,79};
        int i=0;
        int count=0;
        double median=0;

        while(x.length>i){
            median=(median+x[i])/2;
            i++;
        }
        System.out.println("Median"+median);

        i=0;
        int j=1;

        while (x.length>i){
            if(x[i]>x[j]){
                System.out.println("Highest value is " + (int)x[i]);
                break;
            }else {
                i++;
                j++;
            }
        }

        while (x.length>i){
            if(x[i]==x[j]){
                System.out.println("Mode is " + (int)x[i]);
                break;
            }else{
                i++;
                j++;
            }
        }
//bbb:
//      for(int r=0; r>=x.length-1; r++){
//
//          bb:
//            for (int a = 2; a <= x[i]/2; a++){
//                if(x[i] % a == 0)
//                {
//                    count++;
//                    break bb;
//                }
//            }
//            if(count == 0 && x[i] != 1 )
//            {
//                System.out.println( x[i] + " is a Prime");
//            }
//            else
//            {
//                System.out.println(x[i] + " is Not");
//            }
//            i++;
//       }
    }
}
