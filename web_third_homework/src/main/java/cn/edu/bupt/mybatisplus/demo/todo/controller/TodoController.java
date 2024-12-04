package cn.edu.bupt.mybatisplus.demo.todo.controller;

import cn.edu.bupt.mybatisplus.demo.todo.entity.Todo;
import cn.edu.bupt.mybatisplus.demo.todo.service.ITodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import java.util.List;

@Controller
@RequestMapping("/contacts")
public class TodoController {
    @Autowired
    private ITodoService todoService;

    // 显示通讯录列表
    @GetMapping()
    public String list(Model model) {
        List<Todo> todos = todoService.list();
        System.out.println("Todos size: " + todos.size());  // Log the size of the list
        model.addAttribute("contacts", todos);
        return "list_page";
    }


    // 跳转到添加页面
    @GetMapping("/add")
    public String addForm() {
        return "add_page";  // 返回 add_page 页面
    }

    // 处理添加操作
    @PostMapping("/add")
    public String add(@RequestParam String name, @RequestParam String phone, @RequestParam String email, @RequestParam String avatar) {
        Todo todo = new Todo();
        todo.setName(name);
        todo.setPhone(phone);
        todo.setEmail(email);
        todo.setAvatar(avatar);
        todoService.save(todo);  // 保存联系人
        return "redirect:/contacts";  // 重定向到通讯录列表页
    }

    // 跳转到编辑页面
    @GetMapping("/edit")
    public String editForm(Model model, @RequestParam Long id) {
        Todo todo = todoService.getById(id);  // 获取联系人数据
        model.addAttribute("todo", todo);  // 将联系人数据传递给视图
        return "edit_page";  // 返回 edit_page 页面
    }

    // 处理编辑操作
    @PostMapping("/edit")
    public String edit(@ModelAttribute Todo todo) {
        todoService.updateById(todo);  // 更新联系人信息
        return "redirect:/contacts";  // 重定向到通讯录列表页
    }

    // 删除联系人
    @GetMapping("/delete")
    public String delete(@RequestParam Long id) {
        todoService.removeById(id);  // 删除联系人
        return "redirect:/contacts";  // 重定向到通讯录列表页
    }

    // 搜索联系人
    @GetMapping("/search")
    public String search(@RequestParam(required = false) String name, @RequestParam(required = false) String phone, Model model) {
        // 使用 QueryWrapper 构造动态查询条件
        QueryWrapper<Todo> queryWrapper = new QueryWrapper<>();

        // 如果传入了姓名，则加上姓名条件
        if (name != null && !name.isEmpty()) {
            queryWrapper.like("name", name);
        }

        // 如果传入了手机号码，则加上手机号码条件
        if (phone != null && !phone.isEmpty()) {
            queryWrapper.like("phone", phone);
        }

        // 执行查询，返回符合条件的列表
        List<Todo> todos = todoService.list(queryWrapper);
        model.addAttribute("contacts", todos);

        // 跳转到新的结果页面
        return "search_results_page";
    }
}
