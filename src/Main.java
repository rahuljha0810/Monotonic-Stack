import java.util.*;
// if we want to find in right we have to travel in left 0 --> n
// if we want to find in left we have to travel in n --> 10

/*
               FINDING GREATER ELEMENT IN LEFT
*/

public class Main
{
    public static int[] GreaterInLeft(int arr[], int n)
    {
        int temp[]= new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i=n-1 ; i>=0 ; i-- )
        {
            int curr = arr[i];
            while(st.size()>0 && curr > arr[st.peek()])
            {
                temp[st.pop()]= curr;
            }
            st.push(i);
        }
        while(st.size()>0)
        {
            temp[st.pop()]=-1;
        }
        return temp;
    }

    /*
               FINDING SMALLER ELEMENT IN LEFT
    */

    public static int[] SmallerInLeft(int arr[], int n)
    {
        int temp[]= new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i=n-1 ; i>=0 ; i-- )
        {
            int curr = arr[i];
            while(st.size()>0 && curr < arr[st.peek()])
            {
                temp[st.pop()]= curr;
            }
            st.push(i);
        }
        while(st.size()>0)
        {
            temp[st.pop()]=-1;
        }

        return temp;
    }
    /*
               FINDING GREATER ELEMENT IN RIGHT
    */

    public static int[] GreaterInRight(int arr[], int n)
    {
        int temp[]= new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i=0 ; i<n; i++ )
        {
            int curr = arr[i];
            while(st.size()>0 && curr > arr[st.peek()])
            {
                temp[st.pop()]= curr;
            }
            st.push(i);
        }
        while(st.size()>0)
        {
            temp[st.pop()]=-1;
        }
        return temp;
    }
    /*
               FINDING SMALLER ELEMENT IN RIGHT
    */
    public static int[] SmallerInRight(int arr[], int n)
    {
        int temp[]= new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i=0 ; i<n; i++ )
        {
            int curr = arr[i];
            while(st.size()>0 && curr < arr[st.peek()])
            {
                temp[st.pop()]= curr;
            }
            st.push(i);
        }
        while(st.size()>0)
        {
            temp[st.pop()]=-1;
        }
        return temp;
    }

    public static void main(String[] args) {
        int []hist= {4, 5, 2, 10, 8};

        int temp[]=GreaterInLeft(hist, hist.length);
        System.out.println("Next Greater in Left : "+Arrays.toString(temp));

        int temp1[]=SmallerInLeft(hist, hist.length);
        System.out.println("Next Smaller in Left : "+Arrays.toString(temp1));

        int temp2[]=GreaterInRight(hist, hist.length);
        System.out.println("Next Greater in Right : "+Arrays.toString(temp2));

        int temp3[]=SmallerInRight(hist, hist.length);
        System.out.println("Next Smaller in Right : "+Arrays.toString(temp3));


    }
}
