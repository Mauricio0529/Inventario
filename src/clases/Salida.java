package clases;
/**
 *
 * @author Home
 */
public class Salida {
  
    String referencia, categoria, proveedor, producto, cantidad_stock, cantidad_venta, fecha, precio_unidad, total;
    //String total;

    public Salida(String referencia, String categoria, String proveedor, String producto, 
                  String cantidad_stock, String cantidad_venta, String fecha, String precio_unidad, String total) {
        this.referencia = referencia;
        this.categoria = categoria;
        this.proveedor = proveedor;
        this.producto = producto;
        this.cantidad_stock = cantidad_stock;
        this.cantidad_venta = cantidad_venta;
        this.fecha = fecha;
        this.precio_unidad = precio_unidad;
        this.total = total;
    }

    public Salida(String string, String nombre) {
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

    public String getCantidad_stock() {
        return cantidad_stock;
    }

    public void setCantidad_stock(String cantidad_stock) {
        this.cantidad_stock = cantidad_stock;
    }

    public String getCantidad_venta() {
        return cantidad_venta;
    }

    public void setCantidad_venta(String cantidad_venta) {
        this.cantidad_venta = cantidad_venta;
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