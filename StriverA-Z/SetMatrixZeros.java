import java.util.Arrays;

public class SetMatrixZeros {
    public static void main(String[] args) {
        int [][] arr = {
                {1,2,3},{4,5,6},{7,8,9}
        };
        transpose(arr);
//        for (int i = 0; i < arr.length; i++) {
//            for(int j = 0; j< arr[i].length;j++) {
//                if(arr[i][j] == 0) {
//                    arr[i][j] = -1;
//                    setMinuses(arr,i,j);
//                }
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            for (int j=0;j<arr[i].length;j++) {
//                if(arr[i][j] == -1) {
//                    arr[i][j] = 0;
//                }
//            }
//        }
        System.out.println(Arrays.deepToString(arr));
    }
    static void transpose(int [][] matrix) {
        for(int i=0;i<matrix.length;i++) {
            for(int j=i;j<matrix.length;j++) {
                swap(matrix,i,j);
            }
        }
    }
    static void swap(int [][] matrix,int i,int j) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
    static void setMinuses(int [][] arr,int i,int j) {
        for (int k = 0; k < arr[i].length; k++) {
            if(arr[i][k] != 0) {
                arr[i][k] = -1;
            }
        }
        for(int k = 0;k<arr.length;k++) {
            if(arr[k][j] != 0) {
                arr[k][j] = -1;
            }
        }
    }
}
