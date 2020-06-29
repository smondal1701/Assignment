/**
 * 
 */
package com.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author sandip.mondal
 *
 */
@Controller
public class ScheduleController {

	@Autowired
	private ScheduleMessageService service;

	@RequestMapping("/")
	public String viewHomePage(Model model) {

		List<ScheduleMessage> listSchedules = service.listAll();
		model.addAttribute("listMessages", listSchedules);
		return "index";
	}

	@RequestMapping("/new")
	public String showNewSchedulePage(Model model) {

		ScheduleMessage product = new ScheduleMessage();
		model.addAttribute("message", product);

		return "new_schedule";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveMessage(@ModelAttribute("message") ScheduleMessage scheduleMessage) {
		service.save(scheduleMessage);

		return "redirect:/";
	}

	@RequestMapping("edit/{id}")
	public ModelAndView showEditSchedulePage(@PathVariable(name = "id") String id) {
		System.out.println("ID value in Edit method::" + id);
		ModelAndView mav = new ModelAndView("edit_schedule");
		ScheduleMessage scheduleMsg = service.get(id);
		mav.addObject("message", scheduleMsg);

		return mav;
	}

	@RequestMapping("delete/{id}")
	public String deleteSchedule(@PathVariable(name = "id") String id) {
		service.delete(id);
		return "redirect:/";
	}
}
