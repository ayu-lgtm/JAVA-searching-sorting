import java.util.*;
public class BS {
    public static int bS(List<Integer> al,Integer l,Integer h,Integer k){
        while(l<=h){
            Integer mid=l+(h-l)/2;
            if(al.get(mid)==k){
                return mid;
            }
            if(al.get(mid)>k){
                h=mid-1;
            }
            if(al.get(mid)<k){
                l=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        List<Integer> al = new ArrayList<>(Arrays.asList(8,7,6,5,4,9,3,0,2,0,1));
        Collections.sort(al);
        Integer k=8;
        Integer s=al.size()-1;
        Integer res=bS(al,0,s,k);
        if(res==-1){
            System.out.println("Element is not present in list.");
        }else{
            System.out.println("Element "+k+" is present at :"+res);
        }
    }
}

