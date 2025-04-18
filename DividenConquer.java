public class DividenConquer {
    public static void printArray(int[] arr){
        for (int i = 0; i<arr.length; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int[] arr, int si, int ei){
        if (si >= ei){
            return;
        }
        // work
        // si = starting index, ei = ending index

        int mid = si + (ei - si) / 2; //(si+ei)/2
        mergeSort(arr, si, mid);//left part
        mergeSort(arr, mid+1, ei); // right part
        merge(arr,si,mid,ei);
    }
    public static void  merge (int[] arr, int si, int mid, int ei){
        int[] temp = new int[ei-si+1];
        int i = si; // iterator for left part
        int j = mid+1;// iterator for right part
        int k = 0; // iterator for temp arr
        while(i<=mid && j<=ei){
            if(arr[i]< arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
            }
            k++;
        }
        // left part
        while(i<=mid){
            temp[k++] = arr[i++];
        }
        // right part
        while (j <= ei){
            temp[k++] = arr[j++];
        }
        // copy temp to original arr
        for(k = 0, i = si; k<temp.length; k++, i++ ){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}