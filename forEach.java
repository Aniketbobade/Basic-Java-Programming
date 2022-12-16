package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class forEach {

	public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = x++;
        int a = --y;
        int b = z--;
        b += ++z;
        int answ = x>a?y>b?y:b:x>z?x:z;
        System.out.println(answ);

	}
}
