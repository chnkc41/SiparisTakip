//package com.cihan.siparis.repository;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.util.Assert;
//
//import com.cihan.siparis.SiparisTakipApplication;
//import com.cihan.siparis.model.Restoran;
//import com.cihan.siparis.repository.restoran.RestoranRepository;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = SiparisTakipApplication.class, webEnvironment=WebEnvironment.MOCK)
//public class RestoranRepTest {
//
//	@Autowired
//	RestoranRepository repository;
//
//	@Test
//	public void testSave() {
//		Restoran res = new Restoran();
//		res.setName("Test restoran1");
//		Restoran saved = repository.save(res);
//
//		Assert.notNull(saved, "Kaydedilemedi");
//	}
//
//}
