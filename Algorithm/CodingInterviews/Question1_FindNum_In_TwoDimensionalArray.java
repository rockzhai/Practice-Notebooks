package CodingInterviews;
/**
 * 0二维数组中的查找
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * */
public class Question1_FindNum_In_TwoDimensionalArray {
    public static void main(String[] args) {
        int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int target1 = 1;
        int target2 = 10;
        System.out.println(Solution.find(array,target1));
        System.out.println(Solution.find(array,target2));

    }

    private static class Solution {
        public static boolean find(int [][] array ,int target) {
            if (array==null){
                return false;
            }
            int row = 0;
            int column = array[0].length-1;
            while (row<array.length&&column>=0){
                if (array[row][column]==target){
                    return true;
                }
                if (array[row][column]>target){
                    column--;
                }else {
                    row++;
                }
            }
            return false;
        }
    }
}
