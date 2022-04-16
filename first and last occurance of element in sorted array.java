import java.util.*;
class GFG { 
    static int first(int a[],
    int x, int n)
    {
        int low=0;
        int high =n-1;
        int ans=-1;  
 while (low <= high){
  int mid = (low+high)/2;
 if(a[mid]>x)  {

     high = mid-1;

  }
else if (a[mid] < x){

   low=mid+1;

  }

else {

 ans=mid; 
 high=mid-1;
   
}
  }
 return ans;


}
// second part

static int last(int a[],
    int x, int n)
    {
        int low=0;
        int high =n-1;
        int ans=-1;  
 while (low <= high){
  int mid = (low+high)/2;
 if(a[mid]>x)  {

     high = mid-1;

  }
else if (a[mid] < x){

   low=mid+1;

  }

else {

 ans=mid; 
 low=mid+1;
   
}
  }
 return ans;


}

public static void main(String[] args)
{
  int arr[] = {1, 2, 2, 2, 2,
               3, 4, 7, 8, 8};
  int n = arr.length;
  int x = 11;
  System.out.println("First Occurrence = " +
                      first(arr, x, n));
  System.out.println("Last Occurrence = " +
                      last(arr, x, n));
}
}


















    