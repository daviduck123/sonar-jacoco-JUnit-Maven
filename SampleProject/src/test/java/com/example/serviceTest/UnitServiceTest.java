package com.example.serviceTest;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.MockApplication;
import com.example.service.UnitService;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MockApplication.class)
public class UnitServiceTest {
	
	@Test
	public void Calc1(){
		assertThat(3, is(3));
	}
	
	@Test
	public void Calc2(){
		assertThat(5, is(5));
	}
	
	@Test
	public void Calc3(){
		assertThat(7, is(7));
	}
}
