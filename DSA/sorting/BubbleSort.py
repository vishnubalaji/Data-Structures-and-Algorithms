def bubble_sort(arr):
    arr_len = len(arr)
    for i in range(arr_len):
        for j in range(arr_len-1):
            if(arr[j]>arr[j+1]):
                arr[j], arr[j+1] = arr[j+1], arr[j]


if __name__ == "__main__":
    arr = [5,3,4,2,1]
    bubble_sort(arr)
    print(arr)