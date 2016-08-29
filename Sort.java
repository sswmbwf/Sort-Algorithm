// 各种排序算法集合

public class Sort {
	public static void main(String[] args) {
		int[] arr = {2,3,5,6,8,9,1,7,8,4};
		Sort sort = new Sort();
		sort.bubbleSort(arr);
		sort.showArr(arr);
	}
	
	// 显示数组
	public void showArr(int[] arr) {
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	// 冒泡排序
	public void bubbleSort(int[] arr) {
		int len = arr.length;
		for(int i = 0; i < len; i++) {
			for(int j = i + 1; j < len; j++) {
				if(arr[j-1] > arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = tmp;
				}
			}
		}
	}
}
