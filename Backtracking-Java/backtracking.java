class KnightTour {
    
    /* 
     * Knight's Tour is a game where you mimic the move the knight makes in Chess, but this time the player is given
     * N * N grid, and the objective is to visit every square in the grid only once to traverse through the whole grid.
     *
     * I will be using backtracking technique to accomplish this.
     * Wish me good luck :)
     */
    
    static int N = 8;
    
    // A utility function to check if i, j are valid
    // index for N*N chessboard.
    static boolean isSafe(int x, int y, int[] board) {
        if(x >= -1 && y >= -1 && board.length == N) {
            return true;
        }
        return false;
    }
    
    // A utility function to print the solution matrix board[N][N]
    static void printSolution(int[] board) {
        // TODO 
    }

    // Function that runs the utility function
    static boolean SolveKT() {
        // TODO
        return true;
    }

    // The Utility function itself.
    static boolean solveKTUtil(int x, int y, int movei, int sol[][], int xMove[], int yMove[]) {
        //TODO
        return true;
    }
    
}