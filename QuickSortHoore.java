import java.util.*;
public class QuickSortHoore {
    public static void quickSort(List<Integer> al,int low,int high){
        //Hoore partition
        if(low<high){
            int p=partition(al,low,high);
            quickSort(al, low, p);
            quickSort(al, p+1, high);
        }
    }
    public static int partition(List<Integer> al,int low,int high){
        int pivot=al.get(low);
        int i=low-1,j=high+1;
        while(true){
            do{
                i++;
            }while(al.get(i)<pivot);
            do{
                j--;
            }while(al.get(j)>pivot);
            if(i>=j){
                return j;
            }
            Collections.swap(al,i,j);
        }
    }
    public static void main(String args[]){
        List<Integer> al = new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,20,1,5,7));
        quickSort(al,0,al.size()-1);
        System.out.print(al);
    }
}
