package cn.edu.bupt.mybatisplus.demo.todo.service;

import cn.edu.bupt.mybatisplus.demo.todo.entity.Todo;
import com.baomidou.mybatisplus.extension.service.IService;
import java.util.List;
public interface ITodoService extends IService<Todo> {
   // List<Todo> findByNameOrPhone(String name, String phone);
}
