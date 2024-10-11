package estadistica;

public class Estadistica {
    private int numElementos;
    private double sumaX, sumaX2;

    /// Agrega d a la serie
    /// @param d: dato
    public void agrega(double d)
    {
        numElementos++;
        sumaX += d;
        sumaX2 += d*d;
    }

    /// Agrega n veces el dato d a la lista
    /// @param d: dato
    /// @param n: numero de veces
    public void agrega(double d, int n)
    {
        numElementos += n;
        sumaX += n*d;
        sumaX2 += n*d*d;
    }

    // Devuelve la media de los elementos
    public double media()
    {
        return sumaX/numElementos;
    }

    // Devuelve la varianza
    public double varianza()
    {
        return sumaX2/(numElementos-Math.pow(media(),2));
    }

    // Devuelve la desviacion tipica, es decir, la raiz de la varianza
    public double desviacionTipica()
    {
        return Math.sqrt(varianza());
    }
}
