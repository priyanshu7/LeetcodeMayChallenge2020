package may2020;

import java.util.Stack;

class StockSpanner {
    Stack<Integer> prices, wt;

    public StockSpanner() {
        prices = new Stack<>();
        wt = new Stack<>();
    }

    public int next(int price) {
        int w = 1;
        while (!prices.isEmpty() && prices.peek() <= price) {
            prices.pop();
            w += wt.pop();
        }

        prices.push(price);
        wt.push(w);
        return w;
    }
}