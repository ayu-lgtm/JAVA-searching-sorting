import java.util.*;
public class BubbleSort {
    public static void bubbleSort(List<Integer> al,int n){
        for(int i=0;i<n-1;i++){
            boolean b=false;
            for(int j=0;j<n-1-i;j++){
                if(al.get(j)>al.get(j+1)){
                    Collections.swap(al,j,j+1);
                    b=true;
                }
            }
            if(b==false){
                break;
            }
        }
    }
    public static void main(String args[]){
        List<Integer> al = new ArrayList<>(Arrays.asList(9,8,7,6,5,4,3,20,1,5,7));
        bubbleSort(al,al.size());
        System.out.print(al);
    }
}
