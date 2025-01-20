class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq =new PriorityQueue<>((a,b)->b-a);
        long sum=0;
        for(int i:gifts){
            pq.add(i);
            sum+=i;
        }
        while(k-->0){
            int n=pq.poll();
            int sqrt=(int)Math.sqrt(n);
            sum-=n;
            sum+=sqrt;
            pq.add(sqrt);
        }
        return sum;
    }
}