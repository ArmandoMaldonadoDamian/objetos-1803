
package abstraccion;


public class Conversion {
    private Grados grados;
    public float centigradosAFarenheit(){
        //este metodo tiene logica
        float resultado= grados.getCentigrados()*1.8f+32;
        return resultado;
    }

    public Grados getGrados() {
        return grados;
    }

    public void setGrados(Grados grados) {
        this.grados = grados;
        
        
    }
        
         private Longitudes longitudes;
    public float metrosApies(){
        //este metodo tiene logica
        float resultado=longitudes.getmetros()*1.8f+32;
        return resultado;
    }

    public Longitudes getmetros() {
        return metros;
    }

    public void setGrados(metros metros) {
        this.metros = metros;
    }
}

    


 