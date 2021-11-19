import java.util.*;
public class ShellSort {
    public static void shellSort(List<Integer> al,int n){
        int gap;
        for(gap=n/2;gap>=1;gap=gap/2){
            for(int j=gap;j<n;j++){
                for(int i=j-gap;i>=0;i=i-gap){
                    if(al.get(i+gap)>al.get(i)){
                        break;
                    }
                    else{
                        Collections.swap(al,i+gap,i);
                    }
                }
            }
        }
    }
    public static void main(String args[]){
        List<Integer> al = new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,20,1,5,7));
        shellSort(al,al.size());
        System.out.print(al);
    }
}
