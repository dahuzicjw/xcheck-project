package com.github.xcheck.sample.controller;

import com.github.xcheck.support.annotation.Check;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author chenjw
 * @date 2016/12/1
 **/
@RestController
@RequestMapping("c")
public class ConditionCheckController {

    @Check("if('a>b', 'a@d', 'c#ml(10)')")
    @GetMapping("t1")
    public String t1() {
        return "success" + new Random().nextInt(100);
    }
    @Check("if('a>b', 'a@d', 'c#ml(10)'):xxx")
    @GetMapping("t2")
    public String t2() {
        return "success" + new Random().nextInt(100);
    }
    @Check("if('a>b', 'a@ml(3)')")
    @GetMapping("t3")
    public String t3() {
        return "success" + new Random().nextInt(100);
    }

    @Check("a>0")
    @GetMapping("t4")
    public String t4() {
        return "success" + new Random().nextInt(100);
    }

}
