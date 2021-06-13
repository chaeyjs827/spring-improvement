package persys.test.base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/*
 * 1. JUnit library must be added in libraries of build path.
 * 2. JUnit test must have any logger class(slf4j, logback).
 */

@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= { "classpath:config/appServlet/servlet-context.xml"
						, "classpath:config/root-context.xml" })
public class BaseTestCase {

}
