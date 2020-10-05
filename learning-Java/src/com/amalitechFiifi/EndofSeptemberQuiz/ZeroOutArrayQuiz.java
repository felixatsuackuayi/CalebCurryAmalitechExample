package com.amalitechFiifi.EndofSeptemberQuiz;

import java.util.Arrays;

public class ZeroOutArrayQuiz {

    public static void main(String[] args){

        //int[] a1 ={index 0, index 1, index 2,index 3, index 4, index 5, index 6, index 7, index 8}
        int[] a1 = {1, 2, 3, 4, 1, 2, 3, 4, 5};
    
        //int[] = {index 0, index 1, index 2}
        int[] a2 = {2, 3, 4};

      zeroOut(a1,a2);

      


    }



    public static void zeroOut(int[] a1, int[] a2)
    {

        int i2 = 0; //initialising counter/index for array a2


        //Looping through array a1
        for (int i1 = 0; i1 < a1.length; i1++)
        {
            // Checking IF the element in array a2 matches with the a1th element in array a1. When it doesn't match it will move to the else condition to
            //reset the counter of array a2 back to zero.
             if (a1[i1] == a2[i2])
            {
                i2++; // We incrementing the counter for array a2

                if (i2 == a2.length) //This will execute when we realise the counter of array a2 is on the last element.If not, it goes back to the For Loop for i1 & contnous from there.

                { // Here we are looping through the first array a1 and replacing the values that were matched with zero.
                    for (int i = 0; i < a2.length; i++)
                    {
                        a1[i1 - i] = 0;

                    }


                    i2 = 0;

                }


            }
             else
              {
                  i2 = 0;
              }
        }
        System.out.print(Arrays.toString(a1));
    }




    }
