package practices;

public class AscDifference {

    public static void main(String[] args) {

        int arr[]={4,2,5,8,1};

        int min=arr[0];
        int max=arr[2];

        int current=1;
        int index=0;

        for(int i=0;i<arr.length;i++){
            current=arr[i];
            if(min>current&&current!=arr[arr.length-1]){
                min=current;
                index=i;
            }

            if (min<current&&current > arr[index]){
                max=current;
            }else{
                max=0;
            }
        }

        System.out.println("minimum: "+ min);
        System.out.println("max: "+max);

        if (min>max){
            System.out.println(-1);
        }else{
            System.out.println(max-min);
        }
    }
}
