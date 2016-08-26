package kr.ac.sungkyul.controller;

/*import javax.servlet.http.HttpServletRequest;*/

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/blog/*")
public class BlogController {
	@ResponseBody
	@RequestMapping
	public String list(/*HttpServletRequest request, */
/*			@Auth UserVo authUser,*/
			@RequestParam("p") int page,
			@RequestParam("n") String name) {
		/*String p = request.getParameter("p"); // 구체적 기술을 넣으면 안 됨 (톰캣 기본 지원)*/
		
		System.out.println("page : " + page);
		System.out.println("name : " + name);
		common();
		return "BlogController:list()";
	}

	@ResponseBody
	@RequestMapping
	public String add() {
		common();
		return "BlogController:add()";
	}

	private void common() {
		System.out.println("common() called");
	}
}