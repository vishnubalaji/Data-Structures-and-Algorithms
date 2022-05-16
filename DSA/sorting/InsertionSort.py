def insertion_sort(arr):
    arr_len = len(arr)
    for i in range(1, arr_len):
        value = arr[i]
        hole = i

        while(hole>0 and arr[hole-1]>value):
            arr[hole] = arr[hole-1]
            hole-=1
        arr[hole] = value


if __name__ == "__main__":
    arr = [5,3,4,2,1]
    insertion_sort(arr)
    print(arr)