package com.leetCode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args){

        /*for(int i=1; i<5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        List<List<Integer>> triangle = getTriangle(5);
        for (List<Integer> row :triangle) {
            for (Integer i: row) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }


    }
    public static List<List<Integer>> getTriangle(int row){
        List<List<Integer>> triangle = new ArrayList<>();

        if(row == 0) return triangle;

        List<Integer> first_row = new ArrayList<>();
        first_row.add(1);
        triangle.add(first_row);

        for(int i=1; i< row; i++){
            List<Integer> prev_row = triangle.get(i-1);
            List<Integer> current_row = new ArrayList<>();
            current_row.add(1);

            for(int j=1; j<i; j++){
                current_row.add(prev_row.get(j) + prev_row.get(j-1));
            }
            current_row.add(1);
            triangle.add(current_row);
        }
        return triangle;
    }
}
