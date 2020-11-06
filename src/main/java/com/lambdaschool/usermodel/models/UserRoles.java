package com.lambdaschool.usermodel.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="userroles")
@IdClass(UserRolesId.class)
public class UserRoles implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name="userid")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name="roleid")
    private Role role;

    public UserRoles() {
    }

    public UserRoles(User user, Role role) {
        this.user = user;
        this.role = role;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
