package persys.web.serviceImpl;

import org.springframework.stereotype.Service;

import persys.web.controller.LSG;
import persys.web.service.UserService;
import persys.web.service.constant.UserLevelConst;

@Service
public class UserServiceImpl implements UserService {

	@Override
	@LSG
	public String testPrint() {
		String str = UserLevelConst.ADMIN.getName();
		return str;
	}

}
