package org.javaboy.vhr.mapper;

import org.javaboy.vhr.model.Menu;

import java.util.List;

import org.apache.ibatis.annotations.Param;


public interface MenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    List<Menu> getMenusByHrId(Integer hrid);

    List<Menu> getAllMenusWithRole();

    List<Menu> getAllMenus();

    List<Integer> getMidsByRid(Integer rid);

    // ✅ 获取所有一级菜单（parentId 为 NULL 或 1）
    List<Menu> getPrimaryMenu();

    // ✅ 获取指定一级菜单下的所有二级菜单
    List<Menu> getSubMenu(@Param("parentId") Integer parentId);
}