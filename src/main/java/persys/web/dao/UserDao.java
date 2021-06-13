package persys.web.dao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class UserDao {
	private final String NAMESPACE = this.getClass().getName();

	@Autowired
	private SqlSession sqlSession;
	
	public Integer getValue() throws Exception {
		Integer returnId = sqlSession.selectOne(NAMESPACE + ".getTest");
		
		RestTemplate restTemplate = new RestTemplate();
//		HttpURLConnection huc = new HttpURLConnection();
		
//		if(true) {
//			throw new Exception();
//		}
		return returnId;
	}

	public String getConnection() throws Exception {
		String result = null;
		
		BufferedReader br = null;
		
		URL url = new URL("http://localhost:8080/test/httpRequestResponse/dfgd");
//		URL url = new URL("https://httpbin.org/get");
//		URL url = new URL("https://httpbin.org/get");
//		URL url = new URL("https://kleague.com/");
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
//		con.setRequestMethod("POST");

		int responseCode = con.getResponseCode();
		System.out.println("responseCode : " + responseCode);
		
		br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));

		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		return result;
	}
	
}
