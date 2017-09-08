 /**
 * Esta clase representa objetos triangulo con una base y una altura
 * @author Carlos Liñan
 * @version 1.0(18-sep-17)
 */
public class Triangulo extends Figura
{
  private float base;
  private float altura;
  
  public Triangulo(float unaBase,float unaAltura)
  {
     base=unaBase;
     altura=unaAltura;
  }
  @Override
  public void calcularArea()
  {
      area=base*altura/2;
  }
}
