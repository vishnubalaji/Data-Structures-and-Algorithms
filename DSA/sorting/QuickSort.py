def partition(arr, start, end):
    pivot = arr[end]
    partition_index = start

    for i in range(start, end):
        if(arr[i]<=pivot):
            arr[i], arr[partition_index] = arr[partition_index], arr[i]
            partition_index+=1
    arr[end], arr[partition_index] = arr[partition_index], arr[end]
    return partition_index
    
def quickSort(arr, start, end):
    if(start < end):
        partition_index = partition(arr, start, end)
        quickSort(arr, start, partition_index-1)
        quickSort(arr, partition_index+1, end)
    return

if __name__ == "__main__":
    arr = [5,2,4,3,1]
    arr1 = [11,9,29,7,2,15,28]
    quickSort(arr, 0, len(arr)-1)
    quickSort(arr1, 0, len(arr1)-1)
    print(arr)
    print(arr1)