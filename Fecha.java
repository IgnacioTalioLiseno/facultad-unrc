
/**
 * Fecha: clase cuyos objetos representan fechas calendarias, para el 
 * calendario gregoriano. Esta clase implementa una variedad de 
 * funcionalidades sobre fechas, como comparaciones, cómputos de días,
 * etc.
 * 
 * @author N. Aguirre 
 * @version 0.1
 */
public class Fecha
{
    // dia de la fecha
    private int dia;
    
    // mes de la fecha
    private int mes;
    
    // año de la fecha
    private int anho;

    /**
     * Constructor por defecto, para la clase fecha.
     * Crea como fecha por defecto la fecha inicial del 
     * calendario gregoriano (15/10/1582)
     */
    public Fecha()
    {
        dia = 15;
        mes = 10;
        anho = 1582;
    }

    /**
     * Constructor de la clase Fecha, que recibe la fecha a 
     * crear como parámetro. La fecha no puede ser previa
     * al 15/10/1582. Debe tenerse en cuenta la creación de
     * fechas válidas, en relación a número de días en los
     * meses, años bisiestos, etc.
     */
    public Fecha(int nuevoDia, int nuevoMes, int nuevoAnho)
    {
        assert(diaValido (nuevoDia, nuevoMes, nuevoAnho) && (postGregoriano (nuevoDia, nuevoMes, nuevoAnho))); 
        dia=nuevoDia;

        mes=nuevoMes;

        anho=nuevoAnho;
        
    }
    
    private boolean postGregoriano(int d, int m, int a){
        assert(diaValido(d, m, a));
        if((a < 1582) || (a==1582 && m==10) || (a==1582 && m==10 && d<=14 )){
         return false;
        }else{  
                return true;
        }
    }
    
    private boolean diaValido(int d, int m, int a){
        if(a==2 && esBisiesto(a) && d>=1 && d<=29){
         return true;
        }else{
            if((m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12)){
                return true;
        }else{
                 if((m==4 || m==6 || m==9 || m==11) && (d>=1 && d<=30)){
                    return true;
                    }else{
                        return false;
                    }
                }
            }
        }
        
         /**
     * Retorna el dia de la fecha
     */
    public int obtenerDia() {
        //
    }
    
    /**
     * Retorna el mes de la fecha
     */
    public int obtenerMes() {
        // Implementar este método, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Retorna el año de la fecha
     */
    public int obtenerAnho() {
        // Implementar este método, reemplazando la línea siguiente
        return 0;
    }
    
     /**
     * Cambia el día de la fecha. El nuevo día debe ser válido
     * para el mes y año actuales.
     */
    public void cambiarDia(int nuevoDia) {
        assert(nuevoDia>0 && nuevoDia <=31);
        dia=nuevoDia;
    }
    
    /**
     * Cambia el mes de la fecha. El nuevo mes debe ser válido
     * para el día y año actuales.
     */
    public void cambiarMes(int nuevoMes) {
        assert(nuevoMes>0 && nuevoMes <=12);
        mes=nuevoMes;
    }
    
    /**
     * Cambia el año de la fecha. El nuevo año debe ser válido
     * para el día y mes aactuales.
     */
    public void cambiarAnho(int nuevoAnho) {
        assert(nuevoAnho>=1582);
        anho=nuevoAnho;
    }
    
    /**
     * Chequea si la fecha es igual a otra fecha dada
     */
    public boolean equals(Fecha otraFecha) {
        if(dia==otroDia && mes==otroMes && anho==otroAnho){
        return true;}
        else{}
    }
    
    /**
     * Chequea si la fecha es anterior a otra fecha dada
     */
    public boolean esAnterior(Fecha otraFecha) {
        // Implementar este método, reemplazando la línea siguiente
        return true;
    }
    
    /**
     * Computa distancia en días entre dos fechas.
     * El parámetro otraFecha debe corresponder a una fecha igual o 
     * posterior a la fecha del objeto.
     */
    public int cantidad(Fecha otraFecha) {
        // Implementar este método, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Computa la cantidad de días de un mes dado. El parámetro
     * debe corresponder a un mes válido.
     */
    private int cantDias(int unMes) 
    {
        // Implementar este método, reemplazando la línea siguiente
        return 0;
    }
    
    /**
     * Decide si un año dado es bisiesto o no. Un año es bisiesto
     * si es múltiplo de 4, salvo los múltiplos de 100 que no son 
     * múltiplos de 400.
     * El parámetro debe corresponder a un año válido.
     */
    private boolean esBisiesto(int unAnho) 
    {
        // Implementar este método, reemplazando la línea siguiente
        return true;
    }
    }
