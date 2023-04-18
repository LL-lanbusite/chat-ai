package com.yupi.autoreply.controller;

import com.yupi.autoreply.common.BaseResponse;
import com.yupi.autoreply.monitor.ZsxqMonitor;
import com.yupi.autoreply.service.impl.AskImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 开放接口
 *
 * @author <a href="https://github.com/liyupi">程序员鱼皮</a>
 * @from <a href="https://yupi.icu">编程导航知识星球</a>
 */
@RestController
@RequestMapping("/")
@Slf4j
public class MainController {

    @Autowired
    private AskImpl ask;

    @PostMapping("/ask")
    public BaseResponse<String> ask(String question) {
        ask.ask(question);
        return null;
    }
}
