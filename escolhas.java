public class escolha {
    private String text;
    private String textmos; 
    private capitulo pcap;// referencia ao objeto capitulo recebendo escolhas no conceito de hierarquia
  
    escolha(String text, capitulo pcap, String textmos) {
  
      this.text = text;
      this.textmos = textmos;
      this.pcap = pcap;
    }
  
    public String getTextovisivel()
    {
        return this.textmos;
    }
  
    public capitulo getProxc()
    {
        return this.pcap;
    }
  
    public String getTextdigitado()
    {
        return this.text;
    }
  
  }
