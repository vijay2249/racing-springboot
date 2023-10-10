package com.f1.racing.controller;

import com.f1.racing.data.DriverInfo;
import com.f1.racing.service.DriversDataService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@SessionAttributes("name")
public class DriversDataController {

    private DriversDataService driversDataService;

    public DriversDataController(DriversDataService driversDataService) {
    	super();
        this.driversDataService = driversDataService;
    }

    @RequestMapping("/drivers")
    public String driversInfo(ModelMap modal){
        List<DriverInfo> drivers = driversDataService.getDriversInfoList();
        modal.put("drivers", drivers);
        return "driversInfo";
    }

    @RequestMapping(value = "/new-driver", method = RequestMethod.GET)
    public String newDriverInfoForm(){
        return "addDriverInfo";
    }

    @PostMapping("/new-driver")
    public String addNewDriver(@ModelAttribute("drivers") DriverInfo driverInfo){
        driversDataService.addDriverInfo(driverInfo);
        return "redirect:drivers";
    }



    //using command-beans for validation
    @GetMapping("/new-driver-v2")
    public String newDriverAddFormV2(ModelMap model){
        model.put("newDriverInfo", new DriverInfo());
        return "addDriverInfoBinding";
    }

    //validation implementation is pending
    @RequestMapping("/new-driver-v2")
//    @Validated
    public String addNewDriver(ModelMap model, DriverInfo newDriverInfo, BindingResult result){
        if(result.hasErrors()) return "addDriverInfoBinding";
        driversDataService.addDriverInfo(newDriverInfo);
        return "redirect:drivers";
    }

    @RequestMapping("delete-driver")
    public String deleteDriverInfo(@RequestParam String id){
        driversDataService.deleteDriver(id);
        return "redirect:drivers";
    }

    @RequestMapping("update-driver")
    public String showUpdateDriverInfoPage(@RequestParam String id, ModelMap model){

        return "new-driver";
    }

}
