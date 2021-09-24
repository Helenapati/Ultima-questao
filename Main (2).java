
- A classe principal deve ser capaz de adicionar mais de um pedido, calcular o
  valor total de cada pedido e gerar o relatório de vendas ao final do di, incluíndo
  lucro adquirido.
*/
 public class Supermercado {

  public static void main(String[] args) {

    Produto arroz = new Produto("Arroz", 5.00, 10);
    Produto feijao = new Produto("Feijão", 8.00, 10);
    Produto macarrao = new Produto("Macarrão", 4.00, 10);
    Produto acucar = new Produto("Açucar", 5.00, 10);
    Produto sal= new Produto ("Sal  ",1,00 , 10); 

    Itens i1 = new Itens(0, arroz, 2);
    Itens i2 = new Itens(1, feijao, 3);
    Itens i3 = new Itens(2, macarrao, 1);
    Itens i4 = new Itens(3, acucar, 2);
    Itens i5 = new Itens (4,sal, 4 ) ;
    
    Pedido= new Pedido(1,5 );
    pedido.adicionarItem (i1 );
    pedido.adicionarItem (i2) ;
    pedido.adicionarItem (i3 );
    pedido.adicionarItem (i4);  
    pedido.adicionarItem (i5);

    Calcular= new valor  ;
    Valor total = i1+i2+i3+i4+i5;
    
    Relatorio = new dia;
    Dia = valor total;
    
    System.out.println("Valor do dia :   "+ dia );
   

  }

}
