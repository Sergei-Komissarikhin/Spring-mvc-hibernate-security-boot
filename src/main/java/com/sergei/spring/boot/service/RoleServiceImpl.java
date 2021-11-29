package com.sergei.spring.boot.service;

import com.sergei.spring.boot.dao.RoleDao;
import com.sergei.spring.boot.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;


@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleDao roleDao;

    @Override
    @Transactional
    public void addRole(Role role) {
        roleDao.addRole(role);
    }

    @Override
    public Role getRoleByName(String name){
        return roleDao.getRoleByName(name);
    }

    @Override
    public Set<Role> getRoles() {
        return roleDao.getRoles();
    }
}
