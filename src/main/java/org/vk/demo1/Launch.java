package org.vk.demo1;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Launch {

    @GetMapping("/")
    public String home() {
        System.out.println("hello from lUanch");
        return "index"; // This means /WEB-INF/views/index.jsp
    }
}
