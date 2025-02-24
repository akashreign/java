import java.util.*;
public class frequncy{

    //main method
    public static void main(String[] args) {

        //Declare and initialize the array elements
        int array[]={1,6,3,6,9,3,3};

        //sorting an array
        Arrays.sort(array);

        //declaring the variables
        int i,j,frequency;
        System.out.println("These elements are repeated along with its frequency-");


        for(i=0; i<array.length; i++)
        {
            frequency = 1;
            for(j=i+1; j<array.length; j++)
            {
                if(array[j] == array[i])
                {
                    frequency++;
                }
                else
                {
                    break;
                }
            }
             i=j-1;
            System.out.println(array[i] + " --> " + frequency);

        }
    }

}