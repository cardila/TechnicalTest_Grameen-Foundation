import org.junit.Test;
import junit.framework.TestCase;

public class TestBlankCDstoBackup extends TestCase {

	private BlankCDstoBackup objCDsBackup;
	
	public TestBlankCDstoBackup(String name){
		super(name);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		objCDsBackup = new BlankCDstoBackup();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
		objCDsBackup = null;
	}
	
	@Test
	public void testCalculateCDs_1(){
		assertEquals(objCDsBackup.calculateNumCDs(1), 2);
	}
	
	@Test
	public void testCalculateCDs_2(){
		assertEquals(objCDsBackup.calculateNumCDs(5), 8);
	}
	
	@Test
	public void testCalculateCDs_3(){
		assertEquals(objCDsBackup.calculateNumCDs(-7), 0);
	}
	
	@Test
	public void testCalculateCDs_4(){
		assertEquals(objCDsBackup.calculateNumCDs(11.7), 18);
	}
	
	@Test
	public void testCalculateCDs_5(){
		assertEquals(objCDsBackup.calculateNumCDs(2345674.9), 3431388);
	}

}
