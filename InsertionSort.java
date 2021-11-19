import java.util.*;
public class InsertionSort {
    public static void insertionSort(List<Integer> al,int n){
        for(int i=1;i<n;i++){
            int key=al.get(i);
            int j=i-1;
            while(j>=0 && al.get(j)>key){
                al.set(j+1,al.get(j));
                j--;
            }
            al.set(j+1,key);
        }
    }
    public static void main(String args[]){
        List<Integer> al = new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,20,1,5,7));
        insertionSort(al,al.size());
        System.out.print(al);
    }
}
