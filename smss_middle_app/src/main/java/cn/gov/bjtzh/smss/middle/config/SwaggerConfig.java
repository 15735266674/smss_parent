package cn.gov.bjtzh.smss.middle.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * All rights Reserved, Designed By YangJingRui
 *
 * @Package cn.gov.bjtzh.smssmiddle.config
 * @Description: smss_parent
 * @Author: YangJingRui
 * @Email: arui83428@126.com
 * @Date: 2020-05-08 11:36
 * @Version V1.0
 * @Copyright: 2020@www.guodatou.com All rights reserved.
 */

@Configuration
@EnableSwagger2
@EnableKnife4j
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.gov.bjtzh.smssmiddle.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("水果电商运营平台 RESTful APIs")
                .description("水果电商运营平台接口文档")
                .termsOfServiceUrl("http://localhost:8181/doc.html")
                .version("1.0")
                .build();
    }


}
