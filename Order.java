/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patternnproj;

/**
 *
 * @author AHMAD
 */
public class Order {

    private String customerName;
    private String address;
    private String meal;
    private int quantity;
    private String paymentMethod;
    private String orderType;

    public Order(String orderType) {
        this.orderType = orderType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getOrderType() {
        return orderType;
    }

    @Override
    public String toString() {
        return "Order Type: " + orderType
                + "\nCustomer: " + customerName
                + "\nAddress: " + address
                + "\nMeal: " + meal
                + "\nQuantity: " + quantity
                + "\nPayment Method: " + paymentMethod;
    }
}
