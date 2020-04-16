public class FindInTwoDimentionArray {
    public boolean Find(int target, int [][] array) {
        int m=array[0].length, n=array.length;
        int row=0;
        int col=m-1;
        while (row<n && row>=0 && col<m && col>=0) {
            if (array[row][col]==target) {
                return true;
            }

            else if (array[row][col]<target) {
                row++;
            }

            else {
                col--;
            }
        }
        return false;
    }
}
