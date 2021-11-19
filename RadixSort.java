import java.util.*;
public class RadixSort {
    public static void radixSort(List<Integer> al,int n){
        int max=Integer.MIN_VALUE;
        for(Integer x:al){
            if(x>max){
                max=x;
            }
        }
        for(int exp=1;max/exp>0;exp=exp*10){
            CountingSort(al,n,exp);
        }
    }
    public static void CountingSort(List<Integer> al,int n,int emp){
        int count[]=new int[10];
        for(int i=0;i<10;i++){
            count[i]=0;
        }
        for(int i=0;i<n;i++){
            count[(al.get(i)/emp)%10]++;
        }
        int output[]=new int[n];

        for(int i=1;i<10;i++){
            count[i]=count[i-1]+count[i];
        }
        for(int i=n-1;i>=0;i--){
            output[count[(al.get(i)/emp)%10]-1]=al.get(i);
            count[(al.get(i)/emp)%10]--;
        }
        for(int i=0;i<n;i++){
            al.set(i, output[i]);
        }
        
    }
    public static void main(String args[]){
        List<Integer> al = new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,20,1,5,7));
        radixSort(al,al.size());
        System.out.print(al);
    }
}
