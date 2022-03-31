/**
 * @ClassName SortTest
 * @Description 测试sort
 * @Author dell
 * @Date 2022/3/31
 * @Version 1.0
 **/
public class SortTest {
    public static void main(String[] args) {
        int[] temp = new int[]{2,3,4,1,9,0,6,5,6};
        Sort.BubbleSort(temp, 0, 8);
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}
