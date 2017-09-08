    /**
 * Esta clase representa objetos rectangulo con una base y una altura
 * @author Carlos Liñan
 * @version 1.0(18-sep-17)
 */
public class Rectangulo extends Figura
{
  private float base;
  private float altura;
  
  public Rectangulo(float unaBase,float unaAltura)
  {
     base=unaBase;
     altura=unaAltura;
  }
  @Override
  public void calcularArea()
  {
      area=base*altura;
  }
}
