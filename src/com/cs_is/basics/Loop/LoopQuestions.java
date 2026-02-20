package com.cs_is.basics.Loop;

public class LoopQuestions {
    public static void main(String[] args) {
        char[][] names={{'d','e','e','p','t','i'},
                {'h','a','r','i','s','h'},
                {'a','d','i','t','h','i'},
                {'s','u','r','y','a'}};
        int[][] nums={{1,2,3,4,},
                {5,6,7},
                {8,9},
                {10}};
        /*
        outer loop: main array.length->4
        inner loop: main array[row].length -> 6,6,6,5
         */
        for(int r=0;r<names.length;r++){
            for(int c=0;c<names[r].length;c++){
                System.out.print(names[r][c]+" ");
            }
            System.out.println();
        }
        for(char[] ch:names){
            for(char c:ch){
                System.out.print(c+" ");
            }
            System.out.println();
        }
        for(int[] number:nums){
            for(int n: number){
                System.out.print(n+"  ");
            }
            System.out.println();
        }
    }
}