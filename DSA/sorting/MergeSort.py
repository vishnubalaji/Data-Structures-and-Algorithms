def merge_sort(arr):
    if len(arr) <= 1:
        return
    mid = len(arr)//2
    
    left = arr[:mid]
    right = arr[mid:]

    merge_sort(left)
    merge_sort(right)
    merge_sorted_lists(left, right, arr)

def merge_sorted_lists(a, b, arr):
    a_len = len(a)
    b_len = len(b)
    i = 0
    j = 0
    k = 0
    
    while i < a_len and j < b_len:
        if(a[i] <= b[j]):
            arr[k] = a[i]
            i+=1
        else:
            arr[k] = b[j]
            j+=1
        k+=1
    while i < a_len:
        arr[k] = a[i]
        i+=1
        k+=1
    while j < b_len:
        arr[k] = b[j]
        j+=1
        k+=1
    print(sorted)

if __name__ == "__main__":
    arr = [5,4,3,7,0,1,8,2]
    merge_sort(arr)
    print(arr)