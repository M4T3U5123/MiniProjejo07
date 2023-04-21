import java.util.Scanner;
import java.util.ArrayList;

public class capitulo {
  private String name;
  private String text;
  private ArrayList<escolha> esc;
  private persona persona;
  private int alteracaoenergia;
  private Scanner input;
  public Object adicioneEscolha;


  capitulo(String name,
      String text,
      persona persona,
      int alteracaoenergia,
      Scanner input) 
  {

    this.name = name;
    this.text = text;
    this.esc = new ArrayList<escolha>();
    this.persona = persona;
    this.alteracaoenergia = alteracaoenergia;
    this.input = input;
  }

  public void mostrarinfo() {

    System.out.println("");
    System.out.println(this.name);
    System.out.println(this.text);
    this.persona.alterarEnergia(alteracaoenergia);

    if (this.esc.size() != 0) {
      for (int i = 0; i < esc.size(); i++) {
        System.out.println(" - " + esc.get(i).getTextovisivel());
      }
      System.out.println();
      int Idesc = selecao();
      this.esc.get(Idesc).getProxc().mostrarinfo();

    }

    System.out.println();
  }
 
  private int selecao() {
    int result = -1;

    if (esc != null) {
      while (result == -1) {
        System.out.print("Faça escolha: ");
        String recebe = input.nextLine();

        for (int i = 0; i < esc.size(); i++) {
          if (recebe.equals(esc.get(i).getTextdigitado())) {
            result = i;
          }
        }

      }
      System.out.println();
    }
    return result;
  }
  
  public void adicioneEscolha(escolha escolha)
  {
   this.esc.add(escolha);
  }
}
