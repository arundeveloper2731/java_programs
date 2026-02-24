/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ordersystem;

/**
 *
 * @author Arun Ak
 */
public enum OrderStatus {
    PLACED(false),
    SHIPPED(false),
    DELIVERED(true),
    CANCELLED(true);

    private boolean Completed;

    OrderStatus(boolean Completed) {
        this.Completed = Completed;
    }

    public boolean Completed() {
        return Completed;
    }
}
