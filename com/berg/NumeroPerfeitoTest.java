package com.berg;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumeroPerfeitoTest {

	@Test
	public void testEdivisor() {

		assertEquals( true, NumeroPerfeito.Edivisor(10, 2) );
		assertEquals( false, NumeroPerfeito.Edivisor(10, 3) );
		assertEquals( false, NumeroPerfeito.Edivisor(10, 4) );
		assertEquals( true, NumeroPerfeito.Edivisor(10, 5) );
		assertEquals( false, NumeroPerfeito.Edivisor(10, 6) );
		assertEquals( false, NumeroPerfeito.Edivisor(10, 7) );
		assertEquals( false, NumeroPerfeito.Edivisor(10, 8) );
	}

	@Test
	public void testEperfeito() {

		assertEquals( false, NumeroPerfeito.Eperfeito(1) );
		assertEquals( false, NumeroPerfeito.Eperfeito(2) );
		assertEquals( false, NumeroPerfeito.Eperfeito(3) );
		assertEquals( false, NumeroPerfeito.Eperfeito(4) );
		assertEquals( false, NumeroPerfeito.Eperfeito(5) );
		assertEquals( true, NumeroPerfeito.Eperfeito(6) );
	}

}
