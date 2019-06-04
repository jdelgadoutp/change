package ChangeTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ChangeTree.Change;
import ChangeTree.Denomination;

class ChangeTest {

	@Test
	void testInsert() {
		Change mychange = new Change();
		Denomination myd = new Denomination(3);
		myd.InsertD(0,2);
		myd.InsertD(1,5);
		myd.InsertD(2,10);
		assertEquals(myd.getD()[0], 2);
		assertEquals(myd.getD()[1], 5);
		assertEquals(myd.getD()[2], 10);
		mychange.InsertD(myd, 13,0);
		assertEquals(myd.getD()[2], 10);
	}

}
