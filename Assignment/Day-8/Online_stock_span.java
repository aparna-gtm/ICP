import java.util.*;
class StockSpanner {
    private Stack<Integer> st;
    private ArrayList<Integer> ll;
    int idx;
    public StockSpanner() {
        st=new Stack<>();
        ll=new ArrayList<>();
        idx=0;
    }
    
    public int next(int price) {
        ll.add(price);
        while(!st.isEmpty() && ll.get(st.peek())<=price){
            st.pop();

        }
        int span;
        if(st.isEmpty()){
            span=idx+1;
        }
        else{
            span=idx-st.peek();
        }
        st.push(idx);
        idx++;
        return span;

    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */