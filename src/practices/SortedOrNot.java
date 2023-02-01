package practices;

public class SortedOrNot {

    public static void main(String[] args) {
        int[] arr={3,5,7,9};    //true
        int[] arg={9,5,10,11,12} ;   //false

        int index=0;
        boolean resultArr=sorted(arr,index);
        boolean resultArg=sorted(arg,index);

        System.out.println("arr sorted? : "+resultArr);

        System.out.println("arg sorted? : "+resultArg);
    }

    static boolean sorted(int[] arr, int index){
        if(index==arr.length-1) return true;
        if(arr[index]>arr[index+1]) return false;

        boolean result=sorted(arr, index+1);

        return result;
    }
}
