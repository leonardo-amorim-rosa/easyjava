package br.com.etiserver.easyjava.utils;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

/**
 * Class that contains utility test methods
 * @author optimus
 *
 */
public class TestUtils {

	public static Scanner mockScannerInputValue(String value) {
		ByteArrayInputStream in = new ByteArrayInputStream(value.getBytes());
		System.setIn(in);
		return new Scanner(in);
	}
	
	public static void resetScannerMock() {
		System.setIn(System.in);
	}
}
