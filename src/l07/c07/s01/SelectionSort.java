package l07.c07.s01;

import java.util.Arrays;

/* 選択法 */
public class SelectionSort {

    public static void main(String[] args) {
        // 要素を並び替えたい配列
        int[] nums = new int[] { 4, 2, 3, 5, 1 };

        for (int i = 0; i < nums.length - 1; i++) { // 確定させたい要素
            for (int j = i + 1; j < nums.length; j++) { // その次の要素から開始
                // 前にある方が大きければ中身を入れ替える
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}