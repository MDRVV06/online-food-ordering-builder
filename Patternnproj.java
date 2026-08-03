/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patternnproj;

/**
 *
 * @author AHMAD
 */
public class Patternnproj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        OrderBuilder orderBuilder = new DeliveryOrderBuilder();

        OrderDirector director = new OrderDirector(orderBuilder);

        director.buildOrder();

        Order order = orderBuilder.getOrder();

        System.out.println(order);

    }
}
