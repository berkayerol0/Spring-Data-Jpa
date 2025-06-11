package com.berkayerol.spring_data_jpa;

import com.berkayerol.dto.DtoCustomer;
import com.berkayerol.services.ICustomerService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(classes = {SpringDataJpaApplication.class})
class SpringDataJpaApplicationTests {

	@Autowired
	private ICustomerService customerService;

	@BeforeEach
	public void beforeEach() {

	}

	@Test
	public void testFindCustomerById() {
		DtoCustomer customer = customerService.findCustomerById(1L);
		assertNotNull(1);
	}

	@AfterEach
	public void afterEach() {

	}
}
