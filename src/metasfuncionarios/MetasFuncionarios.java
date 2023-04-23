/*  
 * Uma loja tem 4 vendedores: João, Fabiano, Flavio e Soraia. 
 * Cada vendedor tem seu salário: João ganha R$1000,00 Fabiano ganha R$1.500,00 
 *  Flavio ganha R$800,00 e Soraia ganha R$2000,00.
 * Neste mês, eles tinham uma meta de vendas de 600 unidades, mas João vendeu
 * 600 unidades, Fabiano vendeu 700 unidades, Flavio vendeu 250 e Soraia vendeu
 * 60 unidades.
 * Crie uma matriz do tipo string com todos os valores  dos vendedores, depois o
 * programa deve retornar quem bateu a meta e, se bateu a meta e não chegou a 10%
 * da meta o vendedor não ganha bonus e, não bateu a meta
 */
package metasfuncionarios;

public class MetasFuncionarios {
    public static void main(String[] args) {
        String[][] nome =  {{"João", "1000" ,"600"},
                            {"Fabiano", "1500", "700"},
                            {"Flávio", "800", "250"},
                            {"Soraia", "2000", "60"}};
        int meta = 600;
        for (int i = 0; i < 4; i++) {
            if (Integer.parseInt(nome[i][2]) >= meta){
               System.out.printf("%s atingiu a meta esperada\n", nome [i][0]);
            if (Integer.parseInt(nome[i][2]) >= 660){
                System.out.printf("Salário de %s agora é %.2f porque ultrapassou 10 por cento da meta esperada\n"
                 , nome[i][0], Float.parseFloat(nome[i][1]) * 1.1);                
            }
        }
            else{
                System.out.printf("%s não atingiu a meta esperada\n", nome[i][0]);  
            }     
        }
    }
}

