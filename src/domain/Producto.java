package domain;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Producto {

    private String nombreProducto;
    int stock;
    int precio;

    public Producto() {
        CrearProducto();
    }

    public Producto(String nombreProducto, int stock, int precio) {
        this.nombreProducto = nombreProducto;
        this.stock = stock;
        this.precio = precio;
    }

    public void CrearProducto(){

        Scanner scanner = new Scanner(System.in);

        while (this.nombreProducto==null){
            try{
            System.out.println("Ingrese el nombre del producto");
            this.nombreProducto = scanner.next();}
                catch (Exception e){
                    e.getMessage();
                }}

        while (this.stock==0){
            scanner.nextLine();
            try{
                System.out.println("Ingrese Stock del producto");
                this.stock= scanner.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Debe ingresar un numero");
            }
            catch (Exception e){
                e.getMessage();
            }}

        while (this.precio==0){
            scanner.nextLine();
            try{
                System.out.println("Ingrese precio del producto");
                this.precio= scanner.nextInt();
            }
            catch (InputMismatchException e){
                System.out.println("Debe ingresar un numero, seguido de una coma y los decimales");
            }
            catch (Exception e){
                e.getMessage();
            }}

    }

    ///region getters y setters


    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio() { return precio;}

    public void setPrecio(int precio) { this.precio = precio;}

    ///endregion

    @Override
    public String toString() {
        return "Producto{" +
                "nombreProducto='" + nombreProducto + '\'' +
                ", stock=" + stock +
                ", precio=" + precio +
                '}';
    }

}