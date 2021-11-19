import java.util.*;
public class HeapSort {
    public static void MaxHeap(List<Integer> al,int n,int i){
        int largest = i;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left<n && al.get(left)>al.get(largest)){
            largest=left;
        }
        if(right<n && al.get(right)>al.get(largest)){
            largest=right;
        }
        if(largest != i){
            Collections.swap(al, i, largest);
            MaxHeap(al, n, largest);
        }
    }
    public static void bulidHeap(List<Integer> al,int n){
        for(int i=(n-2)/2;i>=0;i--){
            MaxHeap(al,n,i);
        }
    }
    public static void heapSort(List<Integer> al,int n){
        bulidHeap(al,n);
        for(int i=n-1;i>=1;i--){
            Collections.swap(al, 0, i);
            MaxHeap(al,i,0);
        }
    }
    public static void main(String args[]){
        List<Integer> al = new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,20,1,5,7));
        heapSort(al,al.size());
        System.out.print(al);
    }
}
