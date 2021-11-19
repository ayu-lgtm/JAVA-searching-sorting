import java.util.*;
public class CountingSort {
    public static void countingSort(List<Integer> al,int n,int k){
        int count[]=new int[k];
        for(int i=0;i<k;i++){
            count[i]=0;
        }
        for(int i=0;i<n;i++){
            count[al.get(i)]++;
        }
        int index=0;
        for(int i=0;i<k;i++){
            for(int j=0;j<count[i];j++){
                al.set(index,i);
                index++;
            }
        }
    }
    public static void main(String args[]){
        List<Integer> al = new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,20,1,5,7));
        
        int max=Integer.MIN_VALUE;
        for(Integer x:al){
            if(x>max){
                max=x;
            }
        }
        countingSort(al,al.size(),max+1);
        System.out.print(al);
    }
}
