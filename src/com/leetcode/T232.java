package com.leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Enbing
 * @create 2021-09-14 9:23 PM
 * @Description
 */
public class T232 {
    class MyQueue {

        Deque<Integer> instack;
        Deque<Integer> outstack;

        /**
         * Initialize your data structure h    ere.
         */
        public MyQueue() {
            instack = new LinkedList<Integer>();
            outstack = new LinkedList<Integer>();

        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            instack.push(x);
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            if (outstack.isEmpty()) {
                outStack1ToStack2();
            }
            return outstack.pop();
        }

        /**
         * Get the front element.
         */
        public int peek() {
            if (outstack.isEmpty()) {
                outStack1ToStack2();
            }
            return outstack.peek();
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return instack.isEmpty() && outstack.isEmpty();
        }

        public void outStack1ToStack2() {
            while (!instack.isEmpty()) {
                outstack.push(instack.pop());
            }
        }
    }

}
