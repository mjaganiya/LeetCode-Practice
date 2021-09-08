package leetcode;

import java.util.Stack;

/**
 * 901. Online Stock Span
 *
 * Design an algorithm that collects daily price quotes for some stock and returns the span of that stock's price for the current day.
 *
 * The span of the stock's price today is defined as the maximum number of consecutive days (starting from today and going backward) for which the stock price was less than or equal to today's price.
 *
 * For example, if the price of a stock over the next 7 days were [100,80,60,70,60,75,85], then the stock spans would be [1,1,1,2,1,4,6].
 * Implement the StockSpanner class:
 *
 * StockSpanner() Initializes the object of the class.
 * int next(int price) Returns the span of the stock's price given that today's price is price.
 *
 *
 *
 * Example 1:
 *
 * Input
 * ["StockSpanner", "next", "next", "next", "next", "next", "next", "next"]
 * [[], [100], [80], [60], [70], [60], [75], [85]]
 * Output
 * [null, 1, 1, 1, 2, 1, 4, 6]
 *
 * Explanation
 * StockSpanner stockSpanner = new StockSpanner();
 * stockSpanner.next(100); // return 1
 * stockSpanner.next(80);  // return 1
 * stockSpanner.next(60);  // return 1
 * stockSpanner.next(70);  // return 2
 * stockSpanner.next(60);  // return 1
 * stockSpanner.next(75);  // return 4, because the last 4 prices (including today's price of 75) were less than or equal to today's price.
 * stockSpanner.next(85);  // return 6
 *
 */


public class Que901 {
     static class Node {
         int count;
         int price;

         Node(int count, int price) {
             this.count = count;
             this.price = price;
         }
     }

        Stack<Node> st = null;

    public Que901() {
        this.st = new Stack<>();
    }

    public int next(int price) {
            if(st.isEmpty() || st.peek().price>price){
                st.push(new Node(1, price));
                return 1;
            }
            int p = 1;
            while(!st.isEmpty() && st.peek().price<=price){
                p+=st.pop().count;
            }
            st.push(new Node(p, price));
            return p;
        }

        public static void main(String[] args) {
            Que901 q = new Que901();
            System.out.print(" 100 "+q.next(100));
            System.out.print(" 80 "+q.next(80));
            System.out.print(" 60 "+q.next(60));
            System.out.print(" 70 "+q.next(70));
            System.out.print(" 60 "+q.next(60));
            System.out.print(" 75 "+q.next(75));
            System.out.print(" 85 "+q.next(85));
        }
    }
