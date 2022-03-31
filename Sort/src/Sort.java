/**
 * @ClassName BubbleSort
 * @Description 排序
 * @Author cyc
 * @Date 2022/3/31
 * @Version 1.0
 **/

public class Sort {
    /**
     * @Author cyc
     * @Description
     * @Date 23:14 2022/3/31
     * @Param [a, l, r]
     * @return void
     **/
    public static void BubbleSort(int[] a, int l, int r) {
        for(int i = l; i <= r; i++) {
            for(int j = i + 1; j <= r; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}
