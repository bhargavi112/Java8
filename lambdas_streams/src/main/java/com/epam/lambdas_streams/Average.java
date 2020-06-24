package com.epam.lambdas_streams;
import java.util.Arrays;
public class Average {
	double Avg(int[] list) {
		return Arrays.stream(list).mapToDouble(i -> (double)i).average().getAsDouble();
	}
}
