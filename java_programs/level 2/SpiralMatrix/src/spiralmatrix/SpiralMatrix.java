
package spiralmatrix;


public class SpiralMatrix {

   
    public static void main(String[] args) {
       
        SpiralMatrix sm = new SpiralMatrix();
        int[][] mat = {
            {1,  2,  3,  4},
            {5,  6,  7,  8},
            {9, 10, 11, 12},
            {13,14, 15, 16}
        };
        sm.spiral(mat);
        
    }
    void spiral(int[][] mat){
        int top =0;
        int bottom = mat.length-1;
        int left=0;
        int right=mat[0].length-1;
        
        while(top <=bottom && left <= right){
            
            for(int i=left;i<=right;i++){
                System.out.print(mat[left][i]+" ");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(mat[i][right]+" ");
            }
            right--;
            if(top<=bottom){
            for(int i=bottom;i<=left;i--){
                System.out.print(mat[bottom][i]+" ");
            }
            bottom--;
            }
            if(left<=right){
            for(int i=right;i<=left;i++){
                System.out.print(mat[i][top]+" ");
            }
            left++;
            }
        }
    }
    
}
