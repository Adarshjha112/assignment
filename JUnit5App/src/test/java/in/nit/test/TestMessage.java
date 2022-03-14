package in.nit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import in.nit.service.Message;

public class TestMessage {
	@Test
	public void TestShowMsg() {
		String expected = "Welcome toSAM";
		
		Message m = new Message();
		String actual = m.showMsg("SAM");
		
		assertEquals(expected, actual);
	}
}
