package com.devin.spring.boot.note;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * <p>
 *
 * </p>
 *
 * @author hkh
 * @since 2020/9/22
 */
@SpringBootApplication
@Slf4j
public class SpringBootNote {
    public static void main(String[] args) {
        log.info("bootstrap is runing ");
        SpringApplication.run(SpringBootNote.class, args);
    }

}
