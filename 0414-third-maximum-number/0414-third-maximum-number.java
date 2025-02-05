class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> st=new HashSet<>();
        for(int i:nums){
            st.add(i);
        }
        if(st.size()<3) return Collections.max(st);
        st.remove(Collections.max(st));
        st.remove(Collections.max(st));

        return Collections.max(st);
    }
}