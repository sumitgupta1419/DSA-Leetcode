class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiralOrder = new ArrayList<>();
        int rowbegin = 0;
        int colbegin = 0;
        int rowend = matrix.length-1;
        int colend = matrix[0].length-1;

     
        while(rowbegin <= rowend && colbegin <= colend){

            for(int i=colbegin ;i<=colend ;i++){
                spiralOrder.add(matrix[rowbegin][i]);
               
            } rowbegin++;

            for(int i=rowbegin ;i<=rowend ;i++){
                spiralOrder.add(matrix[i][colend]);
               
            } colend--;

            if(rowbegin<=rowend){
                for(int i=colend; i>=colbegin ;i--){
                    spiralOrder.add(matrix[rowend][i]);
                    
                }rowend--;
            }
            if(colbegin<=colend){
                for(int i =rowend;i>=rowbegin ;i--){
                    spiralOrder.add(matrix[i][colbegin]);
                    
                }colbegin++;
            }
        }
        return spiralOrder;


        
    }
}