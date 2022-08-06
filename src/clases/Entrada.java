/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Home
 */
public class Entrada {
    
    String referencia, categoria, proveedor, producto, cantidad, fecha, precio_unidad;
    String total;

    public Entrada(String referencia, String categoria, String proveedor, 
            String producto, String cantidad, String fecha, String precio_unidad, String total) {
        this.referencia = referencia;
        this.categoria = categoria;
        this.proveedor = proveedor;
        this.producto = producto;
        this.cantidad = cantidad;
        this.fecha = fecha;
        this.precio_unidad = precio_unidad;
        this.total = total;
    }

    public Entrada(String catego, String product) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getReferencia() {
        return referencia;  
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPrecio_unidad() {
        return precio_unidad;
    }

    public void setPrecio_unidad(String precio_unidad) {
        this.precio_unidad = precio_unidad;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
}