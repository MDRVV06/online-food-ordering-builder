/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patternnproj;

/**
 *
 * @author AHMAD
 */
public class DeliveryOrderBuilder implements OrderBuilder {

    private Order order;

    public DeliveryOrderBuilder() {
        order = new Order("Delivery Order");
    }

    @Override
    public void buildCustomerName() {
        order.setCustomerName("Ahmad");
    }

    @Override
    public void buildAddress() {
        order.setAddress("Zarqa");
    }

    @Override
    public void buildMeal() {
        order.setMeal("Burger");
    }

    @Override
    public void buildQuantity() {
        order.setQuantity(2);
    }

    @Override
    public void buildPaymentMethod() {
        order.setPaymentMethod("Cash");
    }

    @Override
    public Order getOrder() {
        return order;
    }
}
