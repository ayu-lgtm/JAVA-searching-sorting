import java.util.*;
public class CountingGeneral {
    public static void countingSort(List<Integer> al,int n,int k){
        int count[]=new int[k];
        for(int i=0;i<k;i++){
            count[i]=0;
        }
        for(int i=0;i<n;i++){
            count[al.get(i)]++;
        }
        for(int i=1;i<k;i++){
            count[i]=count[i-1]+count[i];
        }
        int output[]=new int[n];
        for(int i= n-1;i>=0;i--){
            output[count[al.get(i)]-1]=al.get(i);
            count[al.get(i)]--;
        }
        for(int i=0;i<n;i++){
            al.set(i,output[i]);
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

