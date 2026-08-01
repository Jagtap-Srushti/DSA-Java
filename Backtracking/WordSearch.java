package Backtracking;

// Given an m x n grid of characters board and a string word, return true if word exists in the grid.

// The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

public class WordSearch {

    public boolean wordSearch(char board[][],String s){
        int m=board.length;
        int n=board[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dfs(board,s,i,j,0)){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean dfs(char board[][],String s,int i,int j,int idx){
        if(idx==s.length()){
            return true;
        }

        if(i<0 || j<0 || i>=board.length || j>=board[0].length){
            return false;
        }

        if(board[i][j]!=s.charAt(idx)){
            return false;
        }

        char temp=board[i][j];
        board[i][j]='#';

        boolean found=dfs(board,s,i-1,j,idx+1)||
                     dfs(board,s,i+1,j,idx+1)||
                     dfs(board,s,i,j-1,idx+1)||
                     dfs(board,s,i,j+1,idx+1);

        board[i][j]=temp;

        return found;

    }
    public static void main(String[] args) {
        char [][]board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";

        WordSearch obj=new WordSearch();
        System.out.println(obj.wordSearch(board, word));
    }
}
