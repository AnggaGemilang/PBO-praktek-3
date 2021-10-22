/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasus_2;

/**
 *
 * @author angga
 */
public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu Pedas", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu Gejrot", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
//        menu.tampilMenuMakanan();
        menu.tambahPesanan();
        System.out.println("==============================");
        menu.tampilMenuMakanan();
        System.out.println("==============================");
        menu.tampilPemesanan();
    }
}

