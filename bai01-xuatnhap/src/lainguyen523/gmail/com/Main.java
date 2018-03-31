package lainguyen523.gmail.com;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javafx.scene.chart.BubbleChart;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a=br.readLine();
		String b=br.readLine();
		float c=Float.parseFloat(a);
		float d=Float.parseFloat(b);
		System.out.println(c+d);
		

	}

}
