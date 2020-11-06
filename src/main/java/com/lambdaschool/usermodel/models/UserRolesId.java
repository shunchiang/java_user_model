package com.lambdaschool.usermodel.models;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserRolesId implements Serializable {

    private long userid;
    private long roleid;

    public UserRolesId() {
    }

    public UserRolesId(long userid, long roleid) {
        this.userid = userid;
        this.roleid = roleid;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public long getRoleid() {
        return roleid;
    }

    public void setRoleid(long roleid) {
        this.roleid = roleid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRolesId that = (UserRolesId) o;
        return this.userid == that.userid &&
                this.roleid == that.roleid;
    }

    @Override
    public int hashCode() {
        return 37;
    }
}
