import java.util.*;

public class _914 {
    public static boolean hasGroupsSizeX(int[] deck) {
        if(deck.length < 2){
            return false;
        }
        int N = deck.length;
        int[] count = new int[10000];
        for (int c: deck) {
            count[c]++;
            System.out.println(count[c]);
        }

        List<Integer> values = new ArrayList();
        for (int i = 0; i < 10000; ++i)
            if (count[i] > 0)
                values.add(count[i]);

        search: for (int X = 2; X <= N; ++X)
            if (N % X == 0) {
                for (int v: values)
                    if (v % X != 0)
                        continue search;
                return true;
            }

        return false;
    }

    public static void main(String [] args){
        //
        //int [] arr = {1,2,3,4,4,3,2,1};
//       int [] arr = {1,1,2,2,2,2};
        int [] arr = {1,1,1,2,2,2,3,3};
        System.out.println(hasGroupsSizeX(arr));
    }

}



