import java.util.*;
public class MergeSort {
    public static void mergeSort(List<Integer> al,int l,int h){
        if(l<h){
            int mid=l+(h-l)/2;
            mergeSort(al, l, mid);
            mergeSort(al, mid+1, h);
            merge(al,l,mid,h);
        }
    }
    public static void merge(List<Integer> al,int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int left[]=new int[n1];
        int right[]=new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=al.get(i+low);
        }
        for(int i=0;i<n2;i++){
            right[i]=al.get(i+mid+1);
        }
        int p=0,q=0,k=low;
        while(p<n1 && q<n2){
            if(left[p]<right[q]){
                al.set(k++,left[p]);
                p++;
            }else{
                al.set(k++,right[q]);
                q++;
            }
        }
        while(p<n1){
            al.set(k++,left[p]);
            p++;
        }
        while(q<n2){
            al.set(k++,right[q]);
            q++;
        }
    }
    public static void main(String args[]){
        List<Integer> al = new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,20,1,5,7));
        mergeSort(al,0,al.size()-1);
        System.out.print(al);
    }
}
