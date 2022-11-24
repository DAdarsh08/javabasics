package company.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Day3 {
    public static void main(String[] args) {


        int arr[] = {9, 9, 9};
        int n = arr.length - 1;
        ArrayList<Integer>list=new ArrayList<>();
        int c = 1;
        int i = n;
        int t;
        while (i >= 0) {
            t=arr[i]+c;

            list.add(t%10);
            c=t/10;
            i--;


        }
        if(c==1)
        {
            list.add(c);
        }

        Collections.reverse(list);
        System.out.println(list);
    }

}
