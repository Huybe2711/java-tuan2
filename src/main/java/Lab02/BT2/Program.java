/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab02.BT2;

/**
 *
 * @author ADMIN
 */
public class Program {
    public static void main(String[] args) {
        HinhTron c1 = new HinhTron( 5.0);
        System.out.println("Hinh tron[ban kinh:" + c1.getBankinh() + ", dientich:" + c1.tinhDienTich() + ", chu vi:" + c1.tinhChuVi());
        HinhTru c2 = new HinhTru(5.0, 4.0);
        System.out.println("Hinh tru[ban kinh:" + c2.getBankinh() + ", dientich:" + c2.getChieucao() + ", chu vi:" + c2.tinhDienTich(); + ", the tich" + c2.tinhTheTich())
    }
    
}
