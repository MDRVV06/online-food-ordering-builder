/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patternnproj;

/**
 *
 * @author AHMAD
 */
public class PickupOrderBuilder implements OrderBuilder {

    private Order order;

    public PickupOrderBuilder() {
        order = new Order("Pickup Order");
    }

    @Override
    public void buildCustomerName() {
        order.setCustomerName("Mohammed");
    }

    @Override
    public void buildAddress() {
        order.setAddress("Pickup from Restaurant");
    }

    @Override
    public void buildMeal() {
        order.setMeal("Pizza");
    }

    @Override
    public void buildQuantity() {
        order.setQuantity(1);
    }

    @Override
    public void buildPaymentMethod() {
        order.setPaymentMethod("Credit Card");
    }

    @Override
    public Order getOrder() {
        return order;
    }
}
