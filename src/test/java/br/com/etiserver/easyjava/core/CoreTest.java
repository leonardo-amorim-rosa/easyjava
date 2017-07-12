package br.com.etiserver.easyjava.core;

import org.junit.Test;

import br.com.etiserver.easyjava.utils.TestUtils;
import junit.framework.Assert;

/**
 * Created by optimus on 10/07/17.
 */
public class CoreTest {

	private Core core = new Core();
    
	@Test
    public void test_puts_prints_simple_text() {
    	Assert.assertEquals("test print", core.puts("test print"));
    }
    
    @Test
    public void test_puts_false_printe_text() {
    	Assert.assertFalse("test false".equals(core.puts("test true")));
    }
    
    @Test
    public void test_puts_with_arguments() {
    	String text = "Test with two arguments {0} and {1}";
    	Assert.assertEquals("Test with two arguments Red and Blue", core.puts(text, new String[] {"Red", "Blue"}));
    }
    
    @Test
    public void test_puts_with_wrong_number_of_arguments() {
    	String text = "Test with two arguments {0} and {1}";
    	Assert.assertEquals("Test with two arguments Red and {1}", core.puts(text, new String[] {"Red"}));
    }
 
    @Test
    public void test_puts_with_null_arguments() {
    	String text = "Test with two arguments {0} and {1}";
    	Assert.assertEquals(text, core.puts(text, (String[])null));
    }
    
    @Test
    public void test_gets_with_valid_label() {
    	core.setScanner(TestUtils.mockScannerInputValue("text"));
    	String label = "Name";
    	String actual = core.gets(label);
    	String expected = "text";
		Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_gets_with_invalid_label() {
    	core.setScanner(TestUtils.mockScannerInputValue("text"));
    	String label = null;
    	String actual = core.gets(label);
    	String expected = "text";
		Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_geti_with_valid_label() {
    	core.setScanner(TestUtils.mockScannerInputValue("2"));
    	String label = "Age";
    	int actual = core.geti(label);
    	int expected = 2;
		Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_geti_with_invalid_label() {
    	core.setScanner(TestUtils.mockScannerInputValue("2"));
    	String label = null;
    	int actual = core.geti(label);
    	int expected = 2;
		Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_getf_with_valid_label() {
    	core.setScanner(TestUtils.mockScannerInputValue("2"));
    	String label = "Money";
    	double actual = core.getf(label);
    	double expected = 2.0;
		Assert.assertEquals(expected, actual);
    }

    @Test
    public void test_getf_with_invalid_label() {
    	core.setScanner(TestUtils.mockScannerInputValue("2"));
    	String label = null;
    	double actual = core.getf(label);
    	double expected = 2.0;
		Assert.assertEquals(expected, actual);
    }
    
}
