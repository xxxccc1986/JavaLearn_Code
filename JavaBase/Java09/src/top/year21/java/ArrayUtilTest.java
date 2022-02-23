package top.year21.java;

public class ArrayUtilTest {
    public static void main(String[] args) {
//        ArrayUtil util = new ArrayUtil();
        int[] arr1 = new int[]{1,5,-2,8,6};
        int sum = ArrayUtil.getSum(arr1);
        System.out.println("和值是" + sum);
        int max = ArrayUtil.getMax(arr1);
        System.out.println("最大值是" + max);
        int min = ArrayUtil.getMin(arr1);
        System.out.println("最小值是" + min);
        int average = ArrayUtil.getAve(arr1);
        System.out.println("平均值是" + average);

//        System.out.println("排序前");
//        util.traversal(arr1);
//
//        System.out.println("排序后");
//        util.getSort(arr1);
//        util.traversal(arr1);
        ArrayUtil.searchIndex(arr1,6);

    }
}
