import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWight {

	public static void main(String[] args) {
		int result = lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1});
		System.out.println(result);

	}
	
	public static int lastStoneWeight(int[] stones) {
        if(stones==null)
            return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < stones.length; i++) {
            pq.offer(stones[i]);
        }
        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();
            if (first != second) {
                int rem = Math.abs(first - second);
                pq.offer(rem);
            }
        }
        return pq.size()==1 ? pq.poll() : 0;
    }

}
