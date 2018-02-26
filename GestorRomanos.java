import java.util.TreeMap;
/**
 * La clase GestorArabigos genera una lista
 * de nºs arábigos con sus correspondientes
 * nºs romanos.
 * La lista está ordenada por nº arábigo
 * Para modelar la lista se utiliza un TreeMap
 */

public class GestorRomanos
{

    private TreeMap<Integer, String> listaArabigos;
    private ConversorRomanos conversor;

    /**
     * Constructor 
     */
    public GestorRomanos(ConversorRomanos conversor)
    {
        listaArabigos = new TreeMap<Integer, String>();
        this.conversor = conversor;
    }

    /**
     * Añadir un romano. Se añade la clave que es 
     * su valor arábigo y el valor asociado que es
     * el nº romano
     * 
     * @param  romano el nº romano se añade como 
     *          valor asociado.
     * 
     */
    public void añadirRomano(String romano)
    {
        int arabigo = conversor.convertir(romano);
        listaArabigos.put(arabigo, romano);
    }

    /**
     * Añadir varios romanos.  
     * 
     * @param  el array con los nºs romanos
     * 
     */
    public void añadirRomanos(String[] romanos)
    {
        for (int i = 0; i < romanos.length; i++)
        {
            listaArabigos.put(conversor.convertir(romanos[i]), romanos[i]);
        }
    }

    /**
     * representación  textual del map
     *
     */
    public String toString()
    {
        return listaArabigos.toString();
    }

    /**
     * Mostrar la lista de arábigos   
     *  
     */
    public void escribirListaArabigos()
    {

        System.out.println(this.toString());

    }

}
