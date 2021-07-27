package com.spring.Controller;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.spring.Controller.ApplicationUserPermission.*;

public enum ApplicationUser {

    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(STUDENT_READ, STUDENT_WRITE, COURSE_READ,COURSE_WRITE));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUser(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
