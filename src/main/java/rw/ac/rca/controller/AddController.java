/**
 * 
 */
package rw.ac.rca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import rw.ac.rca.service.CalculatorService;

/**
 * @author Aphrodice Rwagaju
 *
 */
@Controller
public class AddController {
	@RequestMapping("/add.php")
	//Second method to pass values
	public ModelAndView add(@RequestParam("t1") int a, @RequestParam("t2") int b) {
		CalculatorService calcService = new CalculatorService();
		double sum = calcService.addTwoNumbers(a, b);
		double prod = calcService.multiplyTwoNumbers(a, b);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("results");
		mv.addObject("theSum", sum);
		mv.addObject("product", prod);
		return mv;
	}
}
