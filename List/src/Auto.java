public class Auto {
    private String marca;
    private String modello;
    private String colore;
    private int porte;

    public Auto(String marca, String modello, String colore, int porte) {
        this.marca = marca;
        this.modello = modello;
        this.colore = colore;
        setPorte(porte);
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModello() {
        return modello;
    }
    public void setModello(String modello) {
        this.modello = modello;
    }
    public String getColore() {
        return colore;
    }
    public void setColore(String colore) {
        this.colore = colore;
    }
    public int getPorte() {
        return porte;
    }
    public void setPorte(int porte) {
        if(porte < 3 || porte > 6) {
            this.porte = porte;
        }
    }

    @Override
    public String toString() {
        return "Marca: " + this.getMarca() + ", Modello: " + this.getModello() + ", Colore: " + this.getColore() + ", Porte: " + this.getPorte();
    }
}
