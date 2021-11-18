public class BubbleSort {
    void Sort(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n-1; i++){//loop through the array to do the number of operation
            for(int j=0; j<n-i-1; j++){//loop through the array for the actual sorting
                if(arr[j]>arr[j+1]){ //check if first element is bigger from the seccond element
                    //swap the element
                    int temp = arr[j];//save the first element into temp var
                    arr[j] = arr[j+1];//swaping the first element with the seccond element
                    arr[j+1] = temp;//change the swapped second element with temp var (wich is the first element that bigger)
                }
            }
        }
    }

    void printArray(int arr[])//it just loop through the array to print each element
    {
        int n = arr.length;
        for(int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();//create object of the algorithm
        int arr[] = {3, 60, 35, 2, 45, 320, 5};//the scrambled array
        ob.Sort(arr);//sorting the array
        System.out.println("Sorted array");
        ob.printArray(arr);//print the sorted array
    }
}
