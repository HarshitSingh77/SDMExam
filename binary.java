public class BinarySearch
{
    public static int binarySearch(int[]arr, int key)
    {
        for(int i = 0; <arr.length; i++)
        {
            if(arr[i] == key)
            {return i;}
        }
    }
        return -1;
}

    public static void public static void main(String args[]) 
    {
        int[]a1={10,20,30,40,50,60};
        int key = 50;
        System.out.println(key+"is found at index: "+binarySearch(a1,key));
        
    }
