package com.sergei.spring.boot.service;

import com.sergei.spring.boot.model.Role;

import java.util.Set;

public interface RoleService {

    void addRole(Role role);

    Role getRoleByName(String name);

    Set<Role> getRoles();
}
