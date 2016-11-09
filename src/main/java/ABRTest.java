import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



public class ABRTest {

	
	@Test
     public void testContains() {
    	int p=5;
    	ABR tree =new ABR();
    	boolean b = tree.contains(5);
 		assertTrue(b);
		}
	
	
	@Test	
	public void testEmpty()
	{
		ABR tree =new ABR();
	    boolean b = tree.isEmpty();
		assertTrue(b);
		
	}
	
	@Test
	public void testFillList()
	{
		ABR tree =new ABR();
    	ArrayList<int[]> point=new ArrayList<int[]> ();
    	int a=tree.nbelement();
    	int b=point.length();
    	assertEquals(a,b);
		
	}
	
	@Test
	public void testInsert()
	{
		ABR tree =new ABR();
    	tree.insert(5);
    	boolean b = tree.contains(5);
 		assertTrue(b);
	}

}
