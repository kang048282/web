package cn.edu.bupt.mybatisplus.demo.todo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Todo {
    @TableId(type= IdType.AUTO)
    private Long id; // 确保有 id 字段
    private String name;   // 姓名
    private String phone;  // 手机号码
    private String email;  // 邮箱
    private String avatar; // 头像路径
}
