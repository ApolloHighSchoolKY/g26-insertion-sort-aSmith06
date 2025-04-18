import java.util.Arrays;

public class AInsertionSort
{

    public static void main(String[] args)
    {
    	Integer myNumbers[] = {9, 3, 8, 6, 2, 37};
        System.out.println(Arrays.toString(myNumbers));
        int tempVal = 0;

        for(int i = 1; i<myNumbers.length; i++){
            tempVal = myNumbers[i];
            for(int pos = i-1; pos >= 0; pos--){
                if(tempVal < myNumbers[pos]){
                    myNumbers[pos+1] = myNumbers[pos];
                    myNumbers[pos] = tempVal;
                }
            }
            //System.out.println(Arrays.toString(myNumbers));
        }
        System.out.println(Arrays.toString(myNumbers));
    }
}
