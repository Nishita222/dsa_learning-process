//print all permutation
// public class Backtracking {
//     public static void printPermutation (String str, String perm){
//         if (str.length()==0){
//             System.out.println(perm);
//             return;
//         }
//         for(int i=0; i<str.length();i++){
//             char currChar = str.charAt(i);
//             String newStr =str.substring (0,i) + str.substring(i+1);
//             printPermutation(newStr, perm + currChar);
//         }
//     }
//     public static void main(String[] args){
//         String str = "ABC";
//         printPermutation(str,"");
//     }
// }

//N-queens
// import java.util.*;
// class Backtracking {
//     public static void main(String[] args) {
//        Backtracking bt = new Backtracking();
//        List<List<String>> result = bt.solveNQueens(4);
//        for(List<String> board : result) {
//            for(String row : board) {
//                System.out.println(row);
//            }
//            System.out.println();
//        }
//    }
//    public boolean isSafe(int row, int col, char[][] board) {
//        //horizontal
//        for(int j=0; j<board.length; j++) {
//            if(board[row][j] == 'Q') {
//                return false;
//            }
//        }
      
//        //vertical
//        for(int i=0; i<board.length; i++) {
//            if(board[i][col] == 'Q') {
//                return false;
//            }
//        }
      
//        //upper left
//        int r = row;
//        for(int c=col; c>=0 && r>=0; c--, r--) {
//            if(board[r][c] == 'Q') {
//                return false;
//            }
//        }
      
//        //upper right
//        r = row;
//        for(int c=col; c<board.length && r>=0; r--, c++) {
//            if(board[r][c] == 'Q') {
//                return false;
//            }
//        }
      
//        //lower left
//        r = row;
//        for(int c=col; c>=0 && r<board.length; r++, c--) {
//            if(board[r][c] == 'Q') {
//                return false;
//            }
//        }
      
//        //lower right
//        for(int c=col; c<board.length && r<board.length; c++, r++) {
//            if(board[r][c] == 'Q') {
//                return false;
//            }
//        }
      
//        return true;
//    }
  
//    public void saveBoard(char[][] board, List<List<String>> allBoards) {
//        String row = "";
//        List<String> newBoard = new ArrayList<>();
      
//        for(int i=0; i<board.length; i++) {
//            row = "";
//            for(int j=0; j<board[0].length; j++) {
//                if(board[i][j] == 'Q')
//                    row += 'Q' + " ";
//                else
//                    row += '.' + " ";
//            }
//            newBoard.add(row);
//        }
      
//        allBoards.add(newBoard);
//    }
  
//    public void helper(char[][] board, List<List<String>> allBoards, int col) {
//        if(col == board.length) {
//            saveBoard(board, allBoards);
//            return;
//        }
      
//        for(int row=0; row<board.length; row++) {
//            if(isSafe(row, col, board)) {
//                board[row][col] = 'Q';
//                helper(board, allBoards, col+1);
//                board[row][col] = '.';
//            }
//        }
//    }
  
//    public List<List<String>> solveNQueens(int n) {
//        List<List<String>> allBoards = new ArrayList<>();
//        char[][] board = new char[n][n];
      
//        helper(board, allBoards, 0);
//        return allBoards;
//    }
// }


// Sudoku Solver
class Backtracking{
    public boolean isSafe(char[][] board, int row, int col, int num){
        // row & column 
        for (int i = 0; i<board.length; i++){
            //column check
            if (board[i][col] == (char)(num + '0') ){
                return false;
            }
            //row check
            if (board[row][i] == (char)(num + '0')){
                return false;
            }
        }

        // grid
        int sr = row/3 *3;
        int sc = col/3 *3;
        for (int i = sr; i<sr+3; i++){
            for (int j = sc; j<sc+3; j++){
                if (board[i][j] == (char)(num + '0')){
                    return false;
                }
            }
        }
        return true;
    }
    //RECURSIVE BLOCK
    //we will have to go on each and every cell for solution i.e we will need row and column
    public boolean helper(char[][] board, int row, int col){  // we use boolean to tell us that if we get a valid sudoku solution it will return true and if we get an invalid solution we will get false  
        if (row == board.length){
            return true;
        }
        //FIRST THING THAT WE CHECKED
        //agli baar jb hum recusrion kr rhe honge toh agla wala row and column kya hai
        int nrow = 0;
        int ncol = 0;
        if(col != board.length-1){                   // i.e unless you are not on row's last cell ..
            nrow = row; ncol = col + 1;                          // you continue with same row
                                    // new columns 
        }else{                                       // but when you have reached to the last column
            nrow = row +1;                           // you begin with new row
            ncol = 0 ;                               // and column traversal will obviously be from 0 again
        }
        // SECOND THING THAT WE CHECK
        // Does that CELL already contains a number --- If yes nothing happens we go onto next cell 
        if (board[row][col] != '.'){                 // If there is no number already present we call function -- as in to fill the blank cell 
            if(helper(board , nrow, ncol)){          // iss helper se true return hota hai i.e esa hua ki we found the sudkou ka solution -----agar humne agla wala cell successfully fill kr diya toh hum return true kr denge
                return true;
            }                                        // hum bhi true return krdenge ki we got our answer  
        }else{                                       //hum hmaare numbers fill krenge 
            for (int i = 1; i <= 9; i++){            // but agar agla wala cell fill nhi hua toh hum current cell pr number dalenge and check krenge ki kya ye valid hai ya nhi
                if(isSafe(board, row, col, (i))){    // we will check if this number is safe to put in the current cell or not
                    board[row][col] = (char)(i+'0'); // if it is safe then we will put this number in the current cell
                    if(helper(board, nrow, ncol)){   // now we will call the helper function for the next cell
                        return true;                 // if the next cell is filled successfully then we will return true
                    }else{
                        board[row][col] = '.';       // if the next cell is not filled successfully then we will remove the number from the current cell and try with the next number
                    }
                }
            }
        }
        return false;

    }
    public static void main(String[] args) {

        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        Backtracking obj = new Backtracking();

        obj.helper(board,0,0);

        // Print solved board
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
   }
}
