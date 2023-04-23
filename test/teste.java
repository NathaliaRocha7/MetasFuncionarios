/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author eueml
 */
public class teste {
    public static void main(String[] args) {
        String[][] nome = {{"João", "1000", "600"}, {"Fabiano", "1500", "700"}, 
                            {"Flavio", "800", "250"}, {"Soraia", "2000", "60"}};
        int meta = 600;
        for (int i = 0; i < 4; i++) {
            if (Integer.parseInt(nome[i][2]) >= meta){
                System.out.printf("%s Atingiu a meta esperada\n", nome[i][0] );
                if(Integer.parseInt(nome[i][2]) >= (meta * 1.1)){
                System.out.printf("Salario de %s agora é %.2f pois ultrapassou 10 porcento da meta\n"
                                            , nome[i][0], Float.parseFloat(nome[i][1]));
                }
            }
            
            else{
                System.out.printf("%s não atingiu a meta esperada\n", nome[i][0]);
            }
        }
    }
}
