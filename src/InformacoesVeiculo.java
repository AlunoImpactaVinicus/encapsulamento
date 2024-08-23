public class InformacoesVeiculo {
      private String vin;

     public void setVin(String vin){
         int lenVin = vin.length();
         if (lenVin < 17) {
             this.vin = vin;
         }
         else {
             System.out.println("Vin inválida.");
         }


     }
     public String getVin(){
         return vin;
     }
}
