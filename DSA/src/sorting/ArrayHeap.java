package sorting;

import java.util.Arrays;

/**
   Heap implementation using array
   insert : time-complexity = O(logn)
   delete : time-complexity = O(logn)
 */

public class ArrayHeap {

	int[] arr;
	private int size;
	private int capacity;

	ArrayHeap(int capacity) {
		this.arr = new int[capacity];
		this.size = 0;
		this.capacity = capacity;
	}

	ArrayHeap(int[] arr, int capacity){
		this.arr = new int[capacity];
		this.arr = Arrays.copyOf(arr, capacity);
		this.size = arr.length;
		this.capacity = capacity;
	}
	
	public int getSize() {
		return size;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getParent(int index) {
		return (index - 1) / 2;
	}

	public int getLeftChild(int index) {
		return 2 * index + 1;
	}

	public int getRightChild(int index) {
		return 2 * index + 2;
	}
	
	public boolean insert(int value) {
		
		if(this.size == this.capacity) {
			System.err.println("Heap is full, cannot insert element");
			return false;
		}
		
		this.size++;
		int index = this.size-1;
		this.arr[index] = value;
		
		while(index !=0 && this.arr[getParent(index)] < this.arr[index]) {
			int temp = arr[index];
			arr[index] = arr[getParent(index)];
			arr[getParent(index)] = temp;
			index = getParent(index);
		}
		return true;
	}
	
	public int delete() {
		if(getSize() == 0) {
			System.err.println("Heap is empty, unable to delete!");
			return -1;
		}
		
		if(getSize() == 1) {
			return this.arr[this.size-1];
		}
		
		int deleted = this.arr[0];
		this.arr[0] = this.arr[this.size-1];
		this.size--;
		
		int index = 0;
		while(true) {
			int leftChild = getLeftChild(index);
			int rightChild = getRightChild(index);
			int largest = index;
			
			if(leftChild < getSize() && this.arr[leftChild] > this.arr[index]) {
				largest = leftChild;
			}
			
			if(rightChild < getSize() && this.arr[rightChild] > this.arr[index]) {
				largest = rightChild;
			}
			
			if(index != largest) {
				int temp = this.arr[largest];
				arr[largest] = arr[index];
				arr[index] = temp;
			}else {
				break;
			}
		}
		
		return deleted;
	}
	
	@Override
	public String toString() {
		return "ArrayHeap [arr=" + Arrays.toString(arr) + ", size=" + size + ", capacity=" + capacity + "]";
	}
	
	public void heapSort() {
		int n = getSize();
		for(int i = 0; i<n; i++) {
			this.arr[n-i-1] = delete();
		}
		System.out.print(Arrays.toString(this.arr));
	}

	public static void main(String args[]) {
		
		ArrayHeap heapArray = new ArrayHeap(4);
		heapArray.insert(100);
		heapArray.insert(12);
		heapArray.insert(68);
		heapArray.insert(102);
		System.out.println("Heap after insertion: "+heapArray.toString());
		heapArray.heapSort();
//		System.out.println("Deleted: "+heapArray.delete());
//		System.out.println("Heap after deletion: "+heapArray.toString());
	}
}
