package cn.edu.bupt.mybatisplus.demo.todo.service.impl;


import cn.edu.bupt.mybatisplus.demo.todo.entity.Todo;
import cn.edu.bupt.mybatisplus.demo.todo.mapper.TodoMapper;
import cn.edu.bupt.mybatisplus.demo.todo.service.ITodoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TodoServiceImpl extends ServiceImpl<TodoMapper, Todo> implements ITodoService {

 //   @Override
   // public List<Todo> findByNameOrPhone(String name, String phone) {
  //      return baseMapper.findByNameOrPhone(name, phone);
   // }
}