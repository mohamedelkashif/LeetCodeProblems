import java.util.ArrayList;
import java.util.List;

public class _941 {
    public static boolean validMountainArray(int[] A) {
        if(A.length < 3){
            return false;
        }
        int i=0;
        for(;i<A.length-1;i++){
            if (A[i] < A[i+1]) {
                continue;
            }
            else if(A[i] == A[i+1]){
                return false;
            }
            else
                break;
        }
        if(i ==0 || i>=A.length-1 ){
            return false;
        }

        for(;i<A.length-1;i++){
            if (A[i] > A[i + 1]) {
                continue;
            } else {
                return false;
            }
        }
        return i == A.length-1;
    }
}
