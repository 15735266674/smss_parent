package cn.gov.bjtzh.smss.middle.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 主页控制器
 */
@Slf4j
@RestController
public class IndexController {

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public Map<String, Object> test(){
        log.debug("测试log");
        return null;
    }
}
