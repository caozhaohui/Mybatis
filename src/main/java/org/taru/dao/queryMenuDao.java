package org.taru.dao;

import org.taru.domel.Menu;

import java.util.List;

public interface queryMenuDao {
    public List<Menu> queryMenu(String id);
}
