package org.koreait.global.configs;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class MessageSourceConfig {

    @Bean
    public MessageSource messageSource() {
        ResourceBundleMessageSource ms = new ResourceBundleMessageSource();
        ms.addBasenames("messages.commons", "messages.validations", "messages.errors", "messages.pokemon");
        ms.setDefaultEncoding("UTF-8");
        //한글 입력시 깨짐 방지
        ms.setUseCodeAsDefaultMessage(true);
        //메세지가 없어도 코드 형태로 출력하게 해줌
        return ms;
    }
}