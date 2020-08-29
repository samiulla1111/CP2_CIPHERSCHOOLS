class Solution {
    static boolean[][] visited;
    public List < String > findWords(char[][] board, String[] words) {
        List < String > result = new ArrayList < String > ();
        HashSet<String> res = new HashSet();
        for (int k = 0; k < words.length; k++) {
            visited = new boolean[board.length][board[0].length];
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == words[k].charAt(0) && callDFS(board, words[k], i, j, 0)) {
                        res.add(words[k]);
                    }
                }
            }
        }
        for(String x : res){
            result.add(x);
        }
        return result;
    }
    public boolean callDFS(char[][] board, String word, int i, int j, int index) {
        if (word.length() == index) {
            return true;
        }
        //return case for recursion
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length || visited[i][j] || board[i][j] != word.charAt(index)) {
            return false;
        }
        visited[i][j] = true;
        if (callDFS(board, word, i + 1, j, index + 1) ||
            callDFS(board, word, i - 1, j, index + 1) ||
            callDFS(board, word, i, j + 1, index + 1) ||
            callDFS(board, word, i, j - 1, index + 1)) {
            return true;
        }
        visited[i][j] = false;
        return false;
    }
}