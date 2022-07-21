// Exercício de aprendizado em POO // 

// Classe comum //
class Carro {

 // Atributos comuns //
 String cor;
 String modelo;
 int capacidadeTanque;

 // Metodo construtor //
 Carro() {

 }

 // Metodo construtor Sobrecarga //
 Carro(String cor, String modelo, int capacidadeTanque) {
  this.cor = cor;
  this.modelo = modelo;
  this.capacidadeTanque = capacidadeTanque;
 }

 // Metodo set para guardar um valor no atributo //
 void setCor(String cor) {
  this.cor = cor;
 }

 // Metodo get para retorna um valor //
 String getCor() {
  return cor;
 }

 void setModelo(String modelo) {
  this.modelo = modelo;
 }

 String getModelo() {
  return modelo;
 }

 void setCapacidadeTanque(int capacidadeTanque) {
  this.capacidadeTanque = capacidadeTanque;
 }

 int getCapacidadeTanque() {
  return capacidadeTanque;
 }

 // Metodo para calculo do valor do tanque //
 double totalValorTanque(double valorCombustivel) {
  return capacidadeTanque * valorCombustivel;
 }
}