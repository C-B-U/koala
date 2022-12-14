#2751


import sys

n = int(input())
array = []
for i in range(n):
    array.append(int(sys.stdin.readline()))


def mergeSort(array):
    if len(array) <= 1:
        return array

    middle = len(array) // 2
    left = mergeSort(array[:middle])
    right = mergeSort(array[middle:])

    return merge(left, right)


def merge(left, right):
    sorted_list = [] * n
    i = j = 0

    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            sorted_list.append(left[i])
            i += 1
        else:
            sorted_list.append(right[j])
            j += 1

    if i < len(left):
        sorted_list += left[i:]
    if j < len(right):
        sorted_list += right[j:]

    return sorted_list


array = mergeSort(array)

for i in range(n):
    print(array[i])
