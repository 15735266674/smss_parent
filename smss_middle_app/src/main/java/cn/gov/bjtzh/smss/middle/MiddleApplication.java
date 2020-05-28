package cn.gov.bjtzh.smss.middle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * All rights Reserved, Designed By YangJingRui
 *
 * @Package cn.gov.bjtzh.smss.middle
 * @Description: smss_middle_app
 * @Author: YangJingRui
 * @Email: arui83428@126.com
 * @Date: 2020-05-08 11:36
 * @Version V1.0
 * @Copyright: 2020@www.guodatou.com All rights reserved.
 */
@EnableScheduling
@EnableSwagger2
@SpringBootApplication
@tk.mybatis.spring.annotation.MapperScan(basePackages = {"cn.gov.bjtzh.smss.middle.entity.dao"})

public class MiddleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MiddleApplication.class, args);
    }

}
