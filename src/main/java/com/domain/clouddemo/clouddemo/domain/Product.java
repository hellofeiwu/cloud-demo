package com.domain.clouddemo.clouddemo.domain;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionID = 1L;

    /**
     * 商品数据库主键
     */
    private Long id;

    /**
     * 商品名称
     */
    private String name;

    /**
     * 商品封面图片
     */
    private String coverImage;

    /**
     * 商品价格（分）
     */
    private int price;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", coverImage='" + coverImage + '\'' +
                ", price=" + price +
                '}';
    }
}
