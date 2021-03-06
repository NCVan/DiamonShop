package DiamonShop.Controller.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController{
	
	@RequestMapping(value = {"/","/trangchu"})
	public ModelAndView Index() {
		_mvShare.setViewName("user/index");
		_mvShare.addObject("slides", _homeService.GetDataSlides());
		_mvShare.addObject("categorys", _homeService.GetDataCategorys());
		return _mvShare;
	}
	
	@RequestMapping(value = {"/product"})
	public ModelAndView Product() {
		ModelAndView mv = new ModelAndView("user/product");
		return mv;
	}
}
