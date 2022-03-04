package cn.citybank.coindesk.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Slf4j
public class homeController {

    @GetMapping("/index.html")
    public String index() {
        return "/static/index.html";
    }
}
