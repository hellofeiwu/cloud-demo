package com.domain.clouddemo.clouddemo.domain;

import java.io.Serializable;
import java.util.Date;

public class ProductComment implements Serializable {
    private static final long serialVersionID = 1L;

    /**
     * 商品评论数据库主键
     */
    private Long id;

    /**
     * 所示商品的ID
     */
    private Long productId;

    /**
     * 评论作者的ID
     */
    private Long authorId;

    /**
     * 评论的具体内容
     */
    private String content;

    /**
     * 评论创建时间
     */
    private Date create;

    @Override
    public String toString() {
        return "ProductComment{" +
                "id=" + id +
                ", productId=" + productId +
                ", authorId=" + authorId +
                ", content='" + content + '\'' +
                ", create=" + create +
                '}';
    }
}
