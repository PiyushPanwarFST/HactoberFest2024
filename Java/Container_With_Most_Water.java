class Solution {
    public int maxArea(int[] height) {
        
        int max = Math.max(right, left);

        int area = 0;
        if(right<left){
            area = right*right;
        }
        else if(left > right){
            area = left*left;
        }

        }
    }
