class MyCircularDeque {
    int [] myquque;
    int front;//队头指针
    int rear;//队尾指针
    int size;//队列长度
    int capacity;//队列的容量
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        this.myquque = new int[k];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
        this.capacity = k;
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(front == rear && size == capacity)return false;
        else{
            front = (front+capacity-1)%capacity;
            myquque[front] = value;
            size++;
            return true;
        }
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(front == rear && size == capacity)return false;
        else{
            myquque[rear]= value;
            rear = (rear+1)%capacity;
            size++;
            return true;
        }
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(rear ==front&&size==0)return false;
        else{
            front = (front+1)%capacity;
            size--;
            return true;
        }
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(rear ==front&&size==0)return false;
        else{
            rear = (rear-1+capacity)%capacity;
            size--;
            return true;
        }
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if(rear == front && size == 0)return -1;
        int frontE=myquque[front];
        return frontE;
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        if(rear == front && size == 0)return -1;
        int rearE= myquque[(rear-1+capacity)%capacity];
        return rearE;
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return (rear == front && size == 0);
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return (front == rear && size == capacity);
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */