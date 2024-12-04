package cn.edu.bupt.mybatisplus.demo.todo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("cn.edu.bupt.mybatisplus.demo.todo.mapper")
@SpringBootApplication
public class MybatisPlusDemoTodoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPlusDemoTodoApplication.class, args);
    }

}
