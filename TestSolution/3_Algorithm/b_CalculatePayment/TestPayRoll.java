import org.junit.Test;

import junit.framework.TestCase;


public class TestPayRoll extends TestCase {

	private PayRoll objPayRoll;
	
	public TestPayRoll(String name){
		super(name);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		objPayRoll = new PayRoll();
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
		objPayRoll = null;
	}
	
	@Test
	public void testCalculatePayRoll_1(){
		assertEquals(objPayRoll.calculatePayRoll(40, 150), 6000.0);
	}
	
	@Test
	public void testCalculatePayRoll_2(){
		assertEquals(objPayRoll.calculatePayRoll(0, 10000), 0.0);
	}
	
	@Test
	public void testCalculatePayRoll_3(){
		assertEquals(objPayRoll.calculatePayRoll(40, 0), 0.0);
	}
	
	@Test
	public void testCalculatePayRoll_4(){
		assertEquals(objPayRoll.calculatePayRoll(-40, -10000), 0.0);
	}
	
	@Test
	public void testCalculatePayRoll_5(){
		assertEquals(objPayRoll.calculatePayRoll(80, 10000), 1000000.0);
	}
	
	@Test
	public void testCalculatePayRoll_6(){
		assertEquals(objPayRoll.calculatePayRoll(120, 25300.45), 4048072.0);
	}

}
