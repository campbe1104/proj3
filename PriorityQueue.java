
class PriorityQueueException extends RuntimeException {
	public PriorityQueueException(String err) {
		super(err);
	}
}

public class PriorityQueue {

	private int[] heap;
	int last;

	public PriorityQueue(int max) {
		heap = new int[max + 1];
		last = 0;
	}

	/**
	 * @return a count of how many elements are in the priority queue
	 */
	public int size() {
		// TODO
		return -1;
	}

	/**
	 * @return true if there are no elements in the priority queue
	 */
	public boolean isEmpty() {
		// TODO
		return false;
	}

	/**
	 * @return the smallest value element in the priority queue
	 */
	public int min() {
		// TODO
		return -1;
	}

	/**
	 * removes the smallest value element in the queue
	 * 
	 * @return the smallest value element in the priority queue
	 */
	public int removeMin() {
		// TODO
		return -1;
	}

	/**
	 * inserts a new element into the priority queue
	 * 
	 * @param j the value to insert into the priority queue
	 */
	public void insert(int j) {
		// TODO
	}

	private int findMin(int ind) {
		// TODO
		return -1;
	}

	private void swap(int i, int j) {
		int tmp = heap[i];
		heap[i] = heap[j];
		heap[j] = tmp;
	}

	private void downHeap() {
		// TODO
	}

	private void upHeap() {
		// TODO
	}

}
