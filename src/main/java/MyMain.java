public class MyMain {
    // This method returns true/false if there 
    // was a boat the specified coordinates. This
    // method also prints out an appropriate message
    public static boolean hit(boolean[][] board, int row, int col) { 
        if (board[row][col]){
            System.out.println("Hit!");
            return true;
        }
        System.out.println("Miss.");
        return false;
    }


    // Places a boat onto the board
    // The top-left piece of the board is located at (row, col)
    // The remaining pieces are placed in the direction given
    // by the direction input
    public static boolean[][] placeBoat(boolean[][] board, String direction, int boatLength, int row, int col) { 
        
        if (direction == "right"){
            for (int i = 0; i < boatLength; i++){
                board[row][col + i] = true;
            }
        }
        else if (direction == "down"){
            for (int i = 0; i < boatLength; i++){
                board[row + i][col] = true;
            }
        }

        return board;
    }

    // Returns true if the every row in the 2D array
    // is in both alphabetical order and in order of 
    // increasing length
    // You may assume that all Strings are lowercase 
    public static boolean inOrder(String[][] words) { 

        String last = "0";
        for (String[] list: words){
            for (String word: list){
                if (last.charAt(0) >= word.charAt(0) || last.length() >= word.length()){
                    return false;
                }
                last = word;

            }
            last = "0";
        }
        return true;
    }

    public static void main(String[] args) {
        // You can test your code here
    }
}
