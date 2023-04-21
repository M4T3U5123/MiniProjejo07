import java.util.Scanner;
import java.util.HashMap;

class App {
  public static void main(String[] argas) {
    Scanner escaneador = new Scanner(System.in);
    CarregarArquivo ler = new CarregarArquivo();
    HashMap<String, persona> persona = ler.lerpersonas("rsc/persona.txt");
    HashMap<String, capitulo> capitulos = ler.lerCaps("rsc/capitulo.txt", persona, 
                                                                                   escaneador);   

    capitulo raiz = capitulos.get("cap1");

    raiz.mostrarinfo();
    escaneador.close();
  }

}
