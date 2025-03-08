package org.javaboy.vhr.controller.system.basic;

import org.javaboy.vhr.model.Menu;
import org.javaboy.vhr.model.RespBean; // 统一返回对象
import org.javaboy.vhr.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 菜单管理 Controller
 */
@RestController
@RequestMapping("/system/menu")  // ✅ 访问路径：/system/menu
public class MenuController {

    @Autowired
    private MenuService menuService;

    /**
     * ✅ 获取完整菜单树（包含一级 & 二级菜单）
     * 前端调用 API: GET http://localhost:8080/system/menu/tree
     */
    @GetMapping("/tree")
    public ResponseEntity<List<Menu>> getMenuTree() {
        List<Menu> menuTree = menuService.getMenuTree();
        return ResponseEntity.ok(menuTree);
    }

}
