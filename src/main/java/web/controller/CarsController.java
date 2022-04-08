package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarDao carDao;

    public CarsController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping
    public String paramIndex(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if(count != null) {
            model.addAttribute("h1", "Existing cars in the table");
            model.addAttribute("list", carDao.getParamCarList(count));
        } else {
            model.addAttribute("list", carDao.getCarList());
        }
        return "/cars";
    }


}
