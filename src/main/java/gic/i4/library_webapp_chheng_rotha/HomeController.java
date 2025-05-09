package main.java.gic.i4.library_webapp_chheng_rotha;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index"; // Will render src/main/resources/templates/index.html
    }
}
