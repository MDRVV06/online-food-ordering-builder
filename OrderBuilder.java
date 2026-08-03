/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package patternnproj;

/**
 *
 * @author AHMAD
 */
public interface OrderBuilder {

    void buildCustomerName();

    void buildAddress();

    void buildMeal();

    void buildQuantity();

    void buildPaymentMethod();

    Order getOrder();
}
