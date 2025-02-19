#include <stdio.h>

int data[10] = {4, 1, 2, 3, 9, 7, 8, 6, 10, 5};

void quick_sort (int *data, int start, int end) {
	if(start >= end){
		return; 
	} 
	int pivot = start; 
	int i = pivot + 1;
	int j = end;
	int temp; 

	while(i <= j){
		while(i <= end && data[i] <= data[pivot]){
			i++; 
		} 
		while(j > start && data[j] >= data[pivot]){ 
			j--; 
		} 
		if(i > j){
			temp = data[j]; 
			data[j] = data[pivot]; 
			data[pivot] = temp; 
		}
		else {
			temp = data[i]; 
			data[i] = data[j]; 
			data[j] = temp; 
		} 
	}
	
	quick_sort(data, start, j - 1); 
	quick_sort(data, j + 1, end); 
} 

int main(void){
	int i; 
	quick_sort(data, 0, 9);

	for(i=0; i<10; i++){ 
		printf("%d ", data[i]); 
	} 
	return 0; 
}

