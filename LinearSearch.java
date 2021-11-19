import java.util.*;
public class LinearSearch {
    public static void linearSearch(List<Integer> al,int k){
        for(int i=0;i<al.size();i++){
            if(al.get(i)==k){
                System.out.println("Position of "+k+" is :"+(i+1));
                break;
            }
        }
    }
    public static void main(String args[]){
        List<Integer> al = new ArrayList<>(Arrays.asList(8,7,6,5,4,9,3,0,2,0,1));
        int k=3;
        linearSearch(al,k);

    }
}
