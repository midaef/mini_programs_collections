
from ezprint import p

arr = [1,2,3,4,5,6,7,8,9,10]

search_value = 2
min_value = 0
max_value = len(arr) - 1
sr_value = len(arr) // 2

while min_value < max_value:
	sr_value = (max_value +  min_value) // 2
	sr1_value = arr(sr_value)
	if sr1_value < search_value:
		min_value = sr_value + 1
	elif sr1_value > x:
		max_value =  sr_value
	else:
		return sr_value
		
	
else:
	return -1
