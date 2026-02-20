package com.cs_is.basics.Recursion;

public class LeetCodeJosephusprblm {
    static int solve(int n, int k){
        //base case
        if(n==0){
            return 0;
        }
        return (solve(n-1, k)+k) % n;
    }
    static int findWinner(int n, int k){
        return solve(n,k)+1; //For - modulo answer
    }
    public static void main(String [] args){
        System.out.println(findWinner(5,2));
        System.out.println(findWinner(8,2));
    }
}
