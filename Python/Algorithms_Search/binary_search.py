
from ezprint import *
import time


def search(arr, value):
	size_arr = len(arr)
	min_value = 0
	max_value = size_arr - 1
	start_time = time.time()
	while min_value <= max_value:
		mid_value = (min_value + max_value) // 2

		if arr[mid_value] == value:
			p('Search: ' + str(value))
			p('Index: ' + str(mid_value))
			p('Time work: ' + str(time.time() - start_time))
			p('Status: find')
			break		
		elif arr[mid_value] < int(value):
			min_value = mid_value + 1
		else:
			max_value = mid_value - 1
	else:
		p('Not found!')


def bubble_sort(arr):
	for i in range(len(arr) - 1 , 0):
		for j in i:
			if arr[j] > arr[j + 1]:
				a = arr[i]
				arr[i] = arr[j]
				arr[j] = a


def main():
	arr = []
	p('===Binary Search===')
	p()
	try:
		j = int(input('Input array size: '))
	except:
		p('Except: Not int!')
		exit()
	for i in range(j):
		try:
			value_arr = int(input('Input ' + str(i + 1) +  ' element array: '))
		except:
			p('Except: Not int!')
			exit()
		arr.append(value_arr)
	s = ''
	for i in arr:
		s += str(i) + ' '
	p('Your array: ' + s)
	try:	
		value = int(input('Input value to search: '))
	except:
		p('Except: Not int!')
		exit()
	search(arr, int(value))


if __name__ == '__main__':
	cls()
	main()