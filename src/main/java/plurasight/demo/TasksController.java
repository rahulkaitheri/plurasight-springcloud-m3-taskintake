package plurasight.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TasksController {
	
	@Autowired
	private TaskProcessor t;
	
	@RequestMapping(path="/tasks", method=RequestMethod.POST)
	public @ResponseBody String launchTaks(@RequestBody String s)
	{
		t.publishRequest(s);
		System.out.println("request made-->"+s);
		return "success";
	}
	

	
}
