package practices;

public class FindFirstIndex {

    public static void main(String[] args) {
        int[] arr1={1,3,5,3,3};
        int[] arr2={9,3,5,1,1,1};

        System.out.println(findFirst(arr1,0,3));

        String result=findFirst(arr1,0,3)==1 ? "Match" : "Not a match";
        System.out.println(result);
    }

    static int findFirst(int[]arr,int index,int value){
        if(index==arr.length) return -1;
        if ((arr[index])==value) return index;

        return findFirst(arr,index+1,value);
    }
}

