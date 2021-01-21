package com.example.demo;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RequestBody;

import junit.framework.Assert;

class HastaRestApiTest {

	@Test
	void testListele() {
		 List<String> hastalar = Arrays.asList("Murat", "Mehmet", "ayşe");
	     List<String> liste = Arrays.asList("Murat", "Mehmet", "ayşe");
	        Assert.assertEquals(hastalar, liste);
		
	}
	
	@Test
	void testEkle() {
		
		String isim = "Murat";
		boolean ekle = HastaRestApi.hastalar.add("Murat");
		 Assert.assertEquals("Murat",isim);

	}
}