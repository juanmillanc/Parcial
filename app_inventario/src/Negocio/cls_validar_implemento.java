package Negocio;

public class cls_validar_implemento {
    private boolean val = false;
    private String msn;

    public void validarDatosEntrada(String id, String implemento, String cantidad, String fecha) {
        if (id.equals("") || implemento.equals("") || cantidad.equals("") || fecha.equals("")) {
            this.msn = "Debe ingresar todos los datos";
        } else {
            this.val = true;
            msn = "El implemento " + implemento + " ha sido registrado con exito";
        }
    }

    public String getmsn() {
        return this.msn;
    }

    public boolean getVal() {
        return this.val;
    }
}
