package multi.project.example.HelloController;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Hello {

    @RequestMapping("/")
    public String index() {
        return "hello world";
    }

}