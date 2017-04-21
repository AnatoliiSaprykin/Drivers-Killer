package TestPack;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class RunTaskKiller {

	@Before
	public void setUp() throws Exception {
	}

	

	@Test
	public void test() {
		try {
	         
			Runtime.getRuntime().exec(new String[]{"C:/Windows/System32/cmd.exe", "/c", "start", "%windir%/system32/taskkill.exe", "/f", "/im", "geckodriver.exe"});
	           System.out.println("geckodriver is killed");
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }
	
	// %windir%/system32/taskkill.exe /f /im "conhost.exe"
	
	@Test
	public void test1() {
		try {
	         
			Runtime.getRuntime().exec(new String[]{"C:/Windows/System32/cmd.exe", "/c", "start", "%windir%/system32/taskkill.exe", "/f", "/im", "conhost.exe"});
	           System.out.println("conhost is killed");
	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	    }
	
	@After
	public void tearDown() throws Exception {
	}

}
