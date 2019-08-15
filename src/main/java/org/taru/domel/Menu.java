package org.taru.domel;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单实体
 */
public class Menu {

  private Integer id;
  private String name;
  private Integer parent_id;
  private String url;
  private String perms;
  private int type;
  private int flag;

  List<Menu> date = new ArrayList<>();

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getParent_id() {
    return parent_id;
  }

  public void setParent_id(Integer parent_id) {
    this.parent_id = parent_id;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getPerms() {
    return perms;
  }

  public void setPerms(String perms) {
    this.perms = perms;
  }

  public int getType() {
    return type;
  }

  public void setType(int type) {
    this.type = type;
  }

  public List<Menu> getDate() {
    return date;
  }

  public void setSonMenus(List<Menu> sonMenus) {
    this.date = date;
  }

  public int getFlag() {
    return flag;
  }

  public void setFlag(int flag) {
    this.flag = flag;
  }

  @Override
  public String toString() {
    return "Menu{"
        + "id="
        + id
        + ", name='"
        + name
        + '\''
        + ", parent_id="
        + parent_id
        + ", url='"
        + url
        + '\''
        + ", perms='"
        + perms
        + '\''
        + ", type="
        + type
        + ", flag="
        + flag
        + ", sonMenus="
        + date
        + '}';
  }
}
