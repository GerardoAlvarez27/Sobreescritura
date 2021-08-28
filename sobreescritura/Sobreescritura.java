package sobreescritura;
/**
 *
 * @author galva
 */
public class Sobreescritura {
int res=0;
   void miMetodo(int var1, int var2)
   { var1=12;
     var2=13;
     res= var1 + var2;
       System.out.println("LA SUMA DE LOS DOS NUMEROS SON" + res);
   }
}