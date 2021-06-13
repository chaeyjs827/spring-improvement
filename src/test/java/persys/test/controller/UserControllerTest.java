package persys.test.controller;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import persys.test.base.BaseTestCase;
import persys.web.controller.UserController;

public class UserControllerTest extends BaseTestCase{

	@Autowired
	private UserController userController;
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Test
	public void test() {
		Boolean b = true;
		String result = userController.test();
		logger.debug("[result] ====> " + result);
	}
	
}
