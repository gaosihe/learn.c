class StockSpanner {

	private List<Integer> list;
	private List<Integer> rests;

	public StockSpanner() {
		list = new ArrayList<>();
		rests = new ArrayList<>();
	}

	public int next(int price) {

		int va = 1;
		for (int i = list.size() - 1; i >= 0;) {
			if (list.get(i) > price) {
				break;
			}
			int dqwd = rests.get(i);
			va += dqwd;
			i -= dqwd;
		}
		list.add(price);
		rests.add(va);

		return va;
	}
}
/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */