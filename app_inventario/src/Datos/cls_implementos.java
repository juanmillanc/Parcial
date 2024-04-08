package Datos;

public class cls_implementos {

    private String idStr;
    private String implemantoStr;
    private String cantidadStr;
    private String descripcionStr;

    public cls_implementos(String idStr, String implemantoStr, String cantidadStr, String descripcionStr) {
        this.idStr = idStr;
        this.implemantoStr = implemantoStr;
        this.cantidadStr = cantidadStr;
        this.descripcionStr = descripcionStr;
    }

    public String getIdStr() {
        return idStr;
    }

    public void setIdStr(String idStr) {
        this.idStr = idStr;
    }

    public String getImplemantoStr() {
        return implemantoStr;
    }

    public void setImplemantoStr(String implemantoStr) {
        this.implemantoStr = implemantoStr;
    }

    public String getCantidadStr() {
        return cantidadStr;
    }

    public void setCantidadStr(String cantidadStr) {
        this.cantidadStr = cantidadStr;
    }

    public String getDescripcionStr() {
        return descripcionStr;
    }

    public void setDescripcionStr(String descripcionStr) {
        this.descripcionStr = descripcionStr;
    }

}
