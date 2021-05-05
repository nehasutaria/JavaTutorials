package com.leetCode;

public class NumberOfIsland {
    public static void main(String[] args){
        char[][] grid = { { '1', '1', '1' }, { '1', '0', '0' }, { '1', '0', '1' } };
        System.out.println("Number of islands is " + numberOfIslands(grid));

    }
    public static int numberOfIslands(char[][] grid){
        if(grid==null || grid.length==0||grid[0].length==0)
            return 0;

        int row = grid.length;
        int col = grid[0].length;

        int count=0;
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]=='1'){
                    count++;
                    merge(grid, i, j);
                }
            }
        }
        return count;
    }
    public static void merge(char[][] grid, int i, int j){
        int row = grid.length;
        int col = grid[0].length;

        if(i<0 || i>=row || j<0 || j>=col || grid[i][j]!='1')
            return;
        grid[i][j]='X';

        merge(grid, i-1, j);
        merge(grid, i+1, j);
        merge(grid, i, j-1);
        merge(grid, i, j+1);
    }
}
