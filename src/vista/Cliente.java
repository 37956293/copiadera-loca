/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Usuario
 */
public class Cliente extends Persona {
    private String NIT;
public Cliente (){}
    public Cliente(String NIT, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.NIT = NIT;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

// vamos hacer el crud

    @Override
    protected String[] crear () {
        try{
            //codigo fuente
        String datos[] = new String[6];    
        datos[0] = getNIT();
        datos[1] = getNombres();
        datos[2] = getApellidos();
        datos[3] = getDireccion();
        datos[4] = getTelefono();
        datos[5] = this.getFecha_nacimiento();
            
        return datos;
        }catch(Exception ex){
        System.out.println("algo salio mal:" + ex.getMessage());
        
        return null;
        }
        
        
}   
    
    
    
    
    
}
