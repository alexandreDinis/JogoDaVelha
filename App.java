import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        
        Campo[][] velha=new Campo[3][3];
        Boolean game =true;
        char simboloAtual ='x';
        String vitoria ="";
        Scanner scan=new Scanner(System.in);

       iniciarJogo(velha);

        while(game){
            desenhaJogo(velha);
            vitoria=verificaVitoria(velha);
            if(vitoria.equals("")){
            break;
            }
            
            try{
                if(verificarJogada(velha,jogar(scan,simboloAtual),simboloAtual)){
                 
                }
            }catch(Exception e){
                System.out.println("erro");
            }
        }
        System.out.println("Fim do jogo");
    }

public static void desenhaJogo(Campo[][] velha){
    //limpar tela
    System.out.println("    0    1    2");
    System.out.printf("0   %c | %c | %c %n",velha[0][0].getSimbulo(),velha[0][1].getSimbulo(),velha[0][2].getSimbulo());
    System.out.println("  --------------");
    System.out.printf("1   %c | %c | %c %n",velha[1][0].getSimbulo(),velha[1][1].getSimbulo(),velha[1][2].getSimbulo());
    System.out.println("  --------------");
    System.out.printf("2   %c | %c | %c %n",velha[2][0].getSimbulo(),velha[2][1].getSimbulo(),velha[2][2].getSimbulo());

}

public static void limparTela(){
    for(int cont=0;cont<200;cont++){
        System.out.println("");
    }

}

public static  int[]  jogar(Scanner scan, char sa){
    int[] p=new int[2];
    System.out.printf("%s %c%n","Quem Joga", sa);
    System.out.print("Infome a Linha ");
    p[0]=scan.nextInt();
    System.out.print("Infome a Coluna ");
    p[1]=scan.nextInt();
    return p;
}

public static  Boolean verificarJogada(Campo[][] velha, int p[],char simboloAtual){
    if(velha[p[0]][p[1]].getSimbulo()==' '){
        velha[p[0]][p[1]].setSimbulo(simboloAtual);
        return true;
    }else{
        return false;
    }
}

public static void iniciarJogo(Campo[][] velha){
    for(int l=0;l<3;l++){
        for(int c=0;c<3;c++){
            velha[l][c]=new Campo();
        }
    }

}

public static String verificaVitoria(Campo[][] velha){
    
        //Verifica vitoria na horizontal
     if(velha[0][0].getSimbulo()=='x' && velha[0][1].getSimbulo()=='x' && velha[0][2].getSimbulo()=='x' ||
        velha[1][0].getSimbulo()=='x' && velha[1][1].getSimbulo()=='x' && velha[1][2].getSimbulo()=='x' ||
        velha[2][0].getSimbulo()=='x' && velha[2][1].getSimbulo()=='x' && velha[2][2].getSimbulo()=='x' ||
        //verifica vitoria na vertical
        velha[0][0].getSimbulo()=='x' && velha[1][0].getSimbulo()=='x' && velha[2][0].getSimbulo()=='x' ||
        velha[0][1].getSimbulo()=='x' && velha[1][1].getSimbulo()=='x' && velha[2][1].getSimbulo()=='x' ||
        velha[0][2].getSimbulo()=='x' && velha[1][2].getSimbulo()=='x' && velha[2][2].getSimbulo()=='x' ||
        // verifica vitoria nas diagonais
        velha[0][0].getSimbulo()=='x' && velha[1][1].getSimbulo()=='x' && velha[2][2].getSimbulo()=='x' |
        velha[0][2].getSimbulo()=='x' && velha[1][1].getSimbulo()=='x' && velha[2][0].getSimbulo()=='x'){
           return  "x";
    }else   //Verifica vitoria na horizontal
        if(velha[0][0].getSimbulo()=='o' && velha[0][1].getSimbulo()=='o' && velha[0][2].getSimbulo()=='o' ||
        velha[1][0].getSimbulo()=='o' && velha[1][1].getSimbulo()=='o' && velha[1][2].getSimbulo()=='o' ||
        velha[2][0].getSimbulo()=='o' && velha[2][1].getSimbulo()=='o' && velha[2][2].getSimbulo()=='o' ||
        //verifica vitoria na vertical
        velha[0][0].getSimbulo()=='o' && velha[1][0].getSimbulo()=='o' && velha[2][0].getSimbulo()=='o' ||
        velha[0][1].getSimbulo()=='o' && velha[1][1].getSimbulo()=='o' && velha[2][1].getSimbulo()=='o' ||
        velha[0][2].getSimbulo()=='o' && velha[1][2].getSimbulo()=='o' && velha[2][2].getSimbulo()=='o' ||
        // verifica vitoria nas diagonais
        velha[0][0].getSimbulo()=='o' && velha[1][1].getSimbulo()=='o' && velha[2][2].getSimbulo()=='o' |
        velha[0][2].getSimbulo()=='o' && velha[1][1].getSimbulo()=='o' && velha[2][0].getSimbulo()=='o'){
           return "o";


         }           
    

}


}
