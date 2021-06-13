package persys.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import persys.web.dao.UserDao;
import persys.web.exception.AbstractEbloBaseException;
import persys.web.service.UserService;

@Controller
public class UserController {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private UserService userService;

	@Autowired
	private UserDao userDao;

	@RequestMapping("/test")
	@ResponseBody
	@CYJ
	@LSG
	@ExceptionHandler(AbstractEbloBaseException.class)
	public String test() {
		Integer i = 0;
		try {
			i = userDao.getValue();
			String test = userDao.getConnection();
		} catch(Exception e) {
//			e.printStackTrace();
			System.out.println("catch Exception : " + e.getMessage());
			System.out.println("catch Exception : " + e.getCause());
			System.out.println("catch Exception : " + e.getStackTrace());
		}
		logger.debug("here!");
		return "Value is from DB : " + i;
	}
	
	@GetMapping("/test/httpRequestResponse")
	@ResponseBody
	public String testHttpRequestResponse() {
		return "HELLO WORLD";
		
	}
	
}
