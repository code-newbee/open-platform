package com.goku.admin.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @Author: XKK
 * @Date: 2021/5/26 17:16
 */
@RestController
@RequestMapping("/sys")
public class SysMenuController {

    @GetMapping("/menu/list")
    public String listMenu() {
        return "菜单列表";
    }

}
