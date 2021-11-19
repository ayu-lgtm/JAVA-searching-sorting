import java.util.*;
public class SelectionSort {
    public static void selectionSort( List<Integer> al,int s){
        for(int i=0;i<s-1;i++){
            int min_index=i;
            for(int j=i+1;j<s;j++){
                if(al.get(j)<al.get(min_index)){
                    min_index=j;
                }
            }
            Collections.swap(al, min_index, i);
        }
    }
    public static void main(String args[]){
        List<Integer> al = new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,20,1,5,7));
        selectionSort(al,al.size());
        System.out.print(al);
    }
}
