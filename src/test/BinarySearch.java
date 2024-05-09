package test;


/*
Binary search
 */
public class BinarySearch {

    public static void main(String[] args) {

        latest.LatestClass latestClass = new latest.LatestClass();

        int[] array = {1,2,4,6,7,8,9,23,45};
        int searchItem = 4;

        //latestClass .binarySearch(array,searchItem);
    }

    // 2, 3 ,5 7, 8,10

    public  void binarySearch(int[] arr, int item){


        int itemIndex = -1;

        int start = 0;
        int end = arr.length -1;
        int middle = (start + end)/2;


        while (start < end){

            middle = (start+end)/2;
            if(item == arr[middle]){
                itemIndex = middle;
                break;
            }

            else if(item < arr[middle]){

                end = middle -1;

            }
            else {

                start = middle +1;
            }
        }

        System.out.println(String.format("Item index is %d", itemIndex));
    }

}

