void quickSort(int[] array){
    if (array != null && array.length >= 2){
        quickSort(array, 0, array.length - 1);
    }
}

void quickSort(int[] array, int low, int high){
    if (low >= high) return;
    int pivotIndex = partition(array, low, high);
    quickSort(array, low, pivotIndex - 1);
    quickSort(array, pivotIndex + 1, high);
}

int partition(int[] array, int low, int high){
    //1.
    int pivot = array[high];
    //2.
    int boundary = low;
    for (int i = low; i < high; i++){
        if (array[i] <= pivot){
            swap(array, boundary, i);
            boundary++;
        }
    }
    swap(array, boundary, high);
    return boundary;
}

void swap(int[] array, int i, int j){
    var t = array[i];
    array[i] = array[j];
    array[j] = t;
}

void main() {
    int[] numbers = {7, 2, 9, 4, 3, 8, 5};
    quickSort(numbers);
    System.out.println(Arrays.toString(numbers));
}