// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8

package seminar5.Homework;

public class zadacha3 {
    public class ChessBoard {
    
        public static int[][] GetChessBoard(){
            int[][] chessBoard = new int[8][8];
            boolean isDark;
            for (int i = 0; i < 8; i++) {
                isDark = (i % 2 == 0) ? true : false;
    
                for (int j = 0; j < 8; j++) {
                    chessBoard[i][j] = (isDark) ? 1 : 0;
                    isDark = !isDark;
                }
            }
            return chessBoard;
        }

        public static void PrintChessBoard(int[][] arr){
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
