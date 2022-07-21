public class RodarAplicacao {

 public static void main(String[] args) {

  Carro carro1 = new Carro();

  // Definindo detalhes do carro //
  carro1.setCor("Azul");
  carro1.setModelo("BMW SÉRIE 3");
  carro1.setCapacidadeTanque(59);

  // Mostrando detalhes do carro //
  System.out.println(carro1.getModelo());
  System.out.println(carro1.getCor());
  System.out.println(carro1.getCapacidadeTanque());
  System.out.println(carro1.totalValorTanque(6.39));

  Carro carro2 = new Carro("Cinza", "Mercedez-Benz Classe C", 66);

  System.out.println(carro2.getModelo());
  System.out.println(carro2.getCor());
  System.out.println(carro2.getCapacidadeTanque());
  System.out.println(carro2.totalValorTanque(6.46));

 }
}
