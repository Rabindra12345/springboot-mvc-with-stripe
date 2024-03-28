package com.rabindra.springmvcthymeleaf;

import com.rabindra.springmvcthymeleaf.web.i18n.I18NService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
class SpringmvcThymeleafApplicationTests {

	@Autowired
	private I18NService i18NService;

	@Test
	public void testMessageByLocaleService() throws Exception {
		String expectedResult = "Bootstrap starter template";
		String messageId = "index.main.callout";
		String actual = i18NService.getMessage(messageId);
		assertEquals("The actual and expected Strings don't match", expectedResult, actual);
	}

}
