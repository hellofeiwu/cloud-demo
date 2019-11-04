package com.domain.clouddemo.clouddemo.domain;
import com.sun.javafx.beans.IDProperty;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class User implements Serializable {
    private static final long serialVersionID = 1L;
    /**
     * 用户数据库主键
     */
    private Long id;

    /**
     * 用户昵称
     */
    private String nickname;

    /**
     * 用户头像
     */
    private String avatar;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", avatar='" + avatar + '\'' +
                '}';
    }
}
