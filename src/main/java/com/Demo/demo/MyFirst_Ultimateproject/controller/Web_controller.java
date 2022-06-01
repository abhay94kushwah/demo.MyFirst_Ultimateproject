package com.Demo.demo.MyFirst_Ultimateproject.controller;

import com.Demo.demo.MyFirst_Ultimateproject.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Web_controller {
    @RequestMapping("/demo_file")
    public String demoFile(){

        return "demo_file";
    }
    @RequestMapping("/data_name")
    public String dataName(Model model){

        model.addAttribute("X","Abhay Singh");
        model.addAttribute("Y","Rakesh Singh");
        model.addAttribute("Z","Monika Singh");

        return "data_name";
    }
    @RequestMapping("/employee_info")
    public String employeeData(Model model){
        Employee employee=new Employee("Sanjay kumar",34,"CS");
        model.addAttribute("emp1",employee);
        Employee employee1=new Employee("Prayash chauhan",30,"Civil");
        model.addAttribute("emp2",employee1);
        Employee employee2=new Employee("Vinay kumar",28,"IT");
        model.addAttribute("emp3",employee2);

        return "employee_data";
    }

}
