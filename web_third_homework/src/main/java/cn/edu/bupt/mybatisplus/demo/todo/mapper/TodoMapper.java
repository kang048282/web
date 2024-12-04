package cn.edu.bupt.mybatisplus.demo.todo.mapper;

import cn.edu.bupt.mybatisplus.demo.todo.entity.Todo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;
public interface TodoMapper extends BaseMapper<Todo> {
    // 这里可以添加一些查询方法，比如按姓名或手机号查找
   // List<Todo> findByNameOrPhone(String name, String phone);
}
