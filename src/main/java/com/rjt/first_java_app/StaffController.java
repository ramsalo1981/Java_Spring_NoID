package com.rjt.first_java_app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class StaffController {
    /*List<Staff> allStaff = Arrays.asList(
            new Staff("Rami","Jon",1000),
            new Staff("Sami","ron",2000),
            new Staff("Dani","gon",3000)
    );*/

    List<Staff> allStaff = new ArrayList<>();
    @GetMapping("/staffdetails")
    public String getStaffDetails(Model model){
        Staff myStaff = new Staff("Rami","Jon",1000);
        model.addAttribute("staff",myStaff);
        return "staffdetails";
    }

    @GetMapping("/formstaffdetails")
    public String getFormStaffDetails(Model model){
        Staff myFormStaff = new Staff("Rami","Jon",1000);
        model.addAttribute("formstaff",myFormStaff);
        return "formstaffdetails";
    }

    @GetMapping("/allstaffdetails")
    public String getAllStaffDetails(Model model){

        model.addAttribute("allStaff",allStaff);
        return "allstaffdetails";
    }

    @GetMapping("/")
    public String addNewStaff(Model model){
        model.addAttribute("addNewStaff", new Staff());
        return "addnewstaff";
    }

    @PostMapping("/dataSubmitForm")
    public String dataSubmitForm(@ModelAttribute Staff staff){
        allStaff.add(staff);
        return "redirect:/allstaffdetails";
    }

    @GetMapping("/contstr")//go direct to home page
    public String getContstrDetails(Model model){

        model.addAttribute("str","I love rami");
        return "contstr";
    }


}
