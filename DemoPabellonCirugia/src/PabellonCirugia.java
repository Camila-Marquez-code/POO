import java.util.Objects;

public class PabellonCirugia {
    private int numero;
    private String especialidad;
    private Estado estado;

    public PabellonCirugia (int numero, String especialidad) {
        this.numero = numero;
        this.especialidad = especialidad;
        this.estado = Estado.DISPONIBLE;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public Estado getEstado() {
        return this.estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String estadoMinuscula = this.estado.name().toLowerCase();

        return this.numero + ", " + this.especialidad + ", " + estadoMinuscula;
    }

    @Override
    public boolean equals(Object otro) {
        if (this == otro) return true;
        if (otro == null || getClass() != otro.getClass()) return false;

        PabellonCirugia pabellonCirugia = (PabellonCirugia) otro;
        return Objects.equals(numero, pabellonCirugia.numero);
    }
}
