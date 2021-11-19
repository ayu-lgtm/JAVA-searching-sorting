import java.util.*;
public class QuickSortLomuto {
    public static void quickSort(List<Integer> al,int low,int high){
        //Lomuto partition
        if(low<high){
            int p=partition(al,low,high);
            quickSort(al, low, p-1);
            quickSort(al, p+1, high);
        }
    }
    public static int partition(List<Integer> al,int low,int high){
        int pivot = al.get(high);
        int i=low-1;
        for(int j=low;j<high;j++){
            if(al.get(j)<pivot){
                i++;
                Collections.swap(al, i, j);
            }
        }
        Collections.swap(al, i+1, high);
        return i+1;
    }
    public static void main(String args[]){
        List<Integer> al = new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,20,1,5,7));
        quickSort(al,0,al.size()-1);
        System.out.print(al);
    }
}
