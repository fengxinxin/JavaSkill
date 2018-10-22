package com.iolo.javaskill.stackAndQueue;

import java.util.Stack;

/**
 * 如何用栈实现队列？
 *
 * @author Fengxinxin
 * @date 2018-10-22
 */
public class StackQueue {
    private Stack<Integer> stackA = new Stack<>();
    private Stack<Integer> stackB = new Stack<>();

    public void endQueue(int element) {
        stackA.push(element);
    }

    public Integer deQueue() {
        if (stackB.isEmpty()) {
            if (stackA.isEmpty()) {
                return null;
            }
            transfer();
        }
        return stackB.pop();
    }

    private void transfer() {
        while (!stackA.isEmpty()) {
            stackB.push(stackA.pop());
        }
    }

    public static void main(String[] args) {
        StackQueue stackQueue = new StackQueue();
        stackQueue.endQueue(1);
        stackQueue.endQueue(2);
        stackQueue.endQueue(3);
        System.out.println(stackQueue.deQueue());
        System.out.println(stackQueue.deQueue());
        stackQueue.endQueue(4);
        System.out.println(stackQueue.deQueue());
        System.out.println(stackQueue.deQueue());
    }



}
