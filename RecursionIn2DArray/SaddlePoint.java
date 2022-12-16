package RecursionIn2DArray;

import java.util.Iterator;

public class SaddlePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 6,3,9 }, {9,10,8 }, { 2,4, 5 } };
		boolean flag = true;
		flag = loop1(0, a, flag);
		if (flag == true) {
			System.out.println("no saddle point");
		}
	}

	private static boolean loop1(int i, int[][] a, boolean flag) {
		// TODO Auto-generated method stub
		if (i < a.length) {
			flag = loop2(0, i, a, flag);
			i++;
			return loop1(i, a, flag);
		}
		return flag;
	}

	private static boolean loop2(int j, int i, int[][] a, boolean flag) {
		// TODO Auto-generated method stub
		if (j < a.length) {
			int ele = a[i][j];
			int count1 = 0;
			int count2 = 0;
			int res[] = new int[2];
			res = loop3(0, i, j, a, count1, count2, ele, res);
			if (res[0] == 0 && res[1] == 0) {
				System.out.println(a[i][j]);
				flag = false;
				return flag;
			}
			j++;
			return loop2(j, i, a, flag);
		}
		return flag;
	}

	private static int[] loop3(int k, int i, int j, int[][] a, int count1, int count2, int ele, int[] res) {
		// TODO Auto-generated method stub
		if (k < a.length) {
			if (ele > a[i][k]) {
				res[0] = ++count1;
			} 
			if (ele < a[k][j]) {
				res[1] = ++count2;
			}
			k++;

			return loop3(k, i, j, a, count1, count2, ele, res);
		}
		return res;
	}
}
