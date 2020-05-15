class RecentCounter {
    Queue<Integer> l;
    public RecentCounter() {
        l = new LinkedList();
    }
    
    public int ping(int t) {
        l.add(t);
        while(l.peek()< t-3000){
            l.poll();
        }
        return l.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */