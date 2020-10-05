package com.Quizes;

import java.util.Arrays;

public class ZeroOutAssessmentClassSolved {

    public static void main(String[] args) {
        int[] a1= {2,3,4,6,5,7,8,3,4,2,3,4,4,4,5,3,3};
        int[] a2= {3,4};
        zeroOut(a1,a2);

    }


    public static void zeroOut(int[] a1, int[] a2){
        int i=0;int k=0;
        while(i<a1.length) {

            if((i==a1.length-2)&&(a2[1]!=a1[a1.length-1]))
            {System.out.print(Arrays.toString(a1));}



            if((a1.length>a2.length)&&(a2[k]==a1[i]))
            {
                int m=k; int n=i;  int count=0;
                while(m<a2.length)
                {

                    if(a2[m]==a1[n])
                    {
                        a1[n]=0;

                        m++; n++; count++;
                    }



                }

                //to compare and printout the final array contents
    	       /* if(count==a2.length)
    	        {System.out.print(Arrays.toString(a1));}*/

            }



            i++;}

        //if(count==a2.length)
        //{System.out.print(Arrays.toString(a1));}


    }
}
