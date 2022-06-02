package com.management.controller;

import java.util.List;

import com.management.model.Major;
import com.management.service.IMajorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/majors")
public class MajorController {
  private IMajorService majorService;
  
  @Autowired
  public MajorController(IMajorService majorService) {
    this.majorService = majorService;
  }

  @GetMapping()
  public String getMajors(ModelMap model) {
    List<Major> majors = majorService.findAll();
    model.addAttribute("majors", majors);
    for (Major m : majors) {
      System.out.println(m.getName());
    }
    return "major";
  }
}
