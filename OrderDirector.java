/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patternnproj;

/**
 *
 * @author AHMAD
 */
public class OrderDirector {

    private OrderBuilder orderBuilder;

    public OrderDirector(OrderBuilder orderBuilder) {
        this.orderBuilder = orderBuilder;
    }

    public void buildOrder() {
        orderBuilder.buildCustomerName();
        orderBuilder.buildAddress();
        orderBuilder.buildMeal();
        orderBuilder.buildQuantity();
        orderBuilder.buildPaymentMethod();
    }
}
