import java.util.Scanner;
import java.util.Arrays;

public class TheLawsOfFreach {
    public static void main(String[] args) {

        int[] array = {4, 51, -7, 13, -99, 15, -8, 45, 90};
        int currentSmallest = Integer.MAX_VALUE;

        for (int i : array) {
            if (i < currentSmallest)
                currentSmallest = i;
        }

        System.out.println(currentSmallest);

        int total = 0;
        int avg = 0;

        for (int i : array) {
           total += i;
        }
        avg = total / array.length;

        System.out.println(avg);

    }
}


/*Objectives:

Start with the code for computing an array’s minimum and average values (see below)
int[] array = { 4, 51, -7, 13, -99, 15, -8, 45, 90 };
int currentSmallest = Integer.MAX_VALUE; // Start higher than anything in the array.
for (int index = 0; index < array.length; index++)
{
    if (array[index] < currentSmallest)
        currentSmallest = array[index];
}
System.out.println(currentSmallest);

int total = 0;
for (int index = 0; index < array.length; index++)
    total += array[index];
double average = (double)total / array.length;
System.out.println(average);
Modify the code to use foreach loops instead of for loops */
