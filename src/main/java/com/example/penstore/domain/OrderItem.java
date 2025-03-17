package com.example.penstore.domain;
import java.math.BigDecimal;

public class OrderItem {
    // 订单项唯一标识（可根据实际需求决定是否需要）
    private String order_items_id;

    // 关联的订单ID
    private String order_id;

    // 商品ID
    private String productId;

    // 购买数量
    private int quantity;

    // 商品单价（使用BigDecimal处理精确计算）
    private BigDecimal price;

    private String status;

    private String shop_id;

    public String getShop_id() {
        return shop_id;
    }
    public void setShop_id(String shop_id) {
        this.shop_id = shop_id;
    }

    public String getOrder_items_id() {
        return order_items_id;
    }
    public void setOrder_items_id(String order_items_id) {
        this.order_items_id = order_items_id;
    }
    // Getter & Setter
    public String getId() {
        return order_items_id;
    }

    public void setId(String order_items_id) {
        this.order_items_id = order_items_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProduct_id(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}