package controller;

import java.util.Map;

import oracle.sql.LobDBAccessImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.DaoInf;
import model.Test1;

@Controller
@RequestMapping("/mainkind")
public class MainController {
	private static Logger loggger = Logger.getLogger(MainController.class);
	@Autowired
	private DaoInf daoInf;
	
	@RequestMapping("/to_main")
	public String getTest(String user_id,String password,Map<String, Object> map){
		loggger.info(user_id+"***"+password);
//		List<Test1> test1 = daoInf.geTest1s();
//		loggger.info("输出属性值："+test1.toString());
//		map.put("test", test1);
		return "main";
	}
	
	@RequestMapping(value = "/to_login")
	public String retTest(Test1 test1) {
		loggger.info("跳转到登陆页面...");
		return "login";
	}
}
