import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Scanner;
public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(){};
    //lấy và gán giá trị cho Radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;

    }
    //Tinh chu vi
    public double chuVi() {
        return 2 * Math.PI * radius;

    }
    //Tinh dien tich
    public double dienTich() {
        return Math.PI * radius * radius;
    }
    //Lay du lieu tu nguoi dung
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ban kinh duong tron: ");
        radius = sc.nextDouble();
        sc.nextLine();
    }
    //Hien thi thong tin va ket qua
    public static void displayData(Circle circle) { // Nhận đối tượng Circle làm tham số
        System.out.println("Với đường tròn có bán kính là: " + circle.getRadius());
        System.out.println("Chu vi hình tròn là: " + circle.chuVi());
        System.out.println("Diện tích hình tròn là: " + circle.dienTich());
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.inputData();
        displayData(circle); // Truyền đối tượng circle vào displayData
    }

}
