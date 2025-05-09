public class Main {
      int consumo;
      String modelo;
      public int getConsumo() {
         return this.consumo;
      }

      public String getModelo() {
      return this.modelo;
      }

      public void setConsumo(int c){

         this.consumo = c;
      }
      public void setModelo(String m){

      this.modelo = m;
      }
      public void nombre(){
          System.out.println("Mi nombre es Aline Gonzalez Madriles");
      }

      public void comparacion(){
         System.out.println("El consumo del auto "+modelo+" es "+consumo);
         System.out.println("Entonces, el consumo del auto es...");
            if (consumo <= 8){
                  System.out.println("Muy alto, poco recomendable.");
            } else if (consumo <= 15) {
                  System.out.println("Moderado,podria mejorar.");
            } else if (consumo <= 20) {
                  System.out.println("Recomendable, mas ahorro de gasolina.");
            } else {
                System.out.println("El consumo es minimo.");
            }
      }



}
