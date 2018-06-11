package cc.ccoder.concurrency.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Slf4j
public class TestController {

    private static int count = 0;

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        count++;
        log.info("count:" + count);
        return "test";
    }

}
