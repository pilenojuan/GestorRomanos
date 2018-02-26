 
/**
 * La clase que inicia el gestor de romanos
 * 
 */
public class AppRomanos
{
        public static void main (String[] args)
        {
            ConversorRomanos conver = new ConversorRomanos();
            GestorRomanos gest = new GestorRomanos(conver);
            
        }
        
        
        
}
