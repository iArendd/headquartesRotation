import java.util.Scanner;

public class resultado3 {


    public static void main(String[] args) {

        while(true){

            Scanner leitor = new Scanner(System.in);

            System.out.println("Digite o primeiro número da matriz: ");
            int num1 = leitor.nextInt();

            System.out.println("Digite o segundo número da matriz: ");
            int num2 = leitor.nextInt();

            System.out.println("Digite o terceiro número da matriz: ");
            int num3 = leitor.nextInt();

            System.out.println("Digite o quarto número da matriz: ");
            int num4 = leitor.nextInt();

            int A[][] = {{num1,num2},
                        {num3,num4}};


            //Solicitando dimensão
            System.out.println("Digite o grau de rotação habilitado (0 / 90 / 180 / 270): ");
            int rotacao = leitor.nextInt();

            int quantLinha = 2;
            int quantColuna = 2;

            int matriz[][] = new int[quantLinha][quantColuna];
            
            for(int linha = 1; linha < matriz.length; linha++){

                for(int coluna = 1; coluna < matriz[linha].length; coluna++){

                    if(rotacao == 0){

                        System.out.println("--------00°--------"); 
                        System.out.println("###################");  
        
                    
                        for(int z = 0; z < A[linha].length; z++){
        
                            int auxiliarZero = 0;
                            int auxiliarUm = 1;
        
                            System.out.print("--(");
        
                            System.out.print(A[z][auxiliarZero] + "-" + A[z][auxiliarUm]);
        
                            System.out.print(")--");  
        
                        }
                        
                    
                        System.out.printf("%n");
                        System.out.println("###################");   
                        System.out.printf("%n");

                        break;

                    }else{ 

                        if(rotacao == 90){

                            System.out.println("--------90°--------"); 
                            System.out.println("###################");  
                        
                            for(int z = 0; z < A[linha].length; z++){
            
                                int auxiliarZero = 0;
                                int auxiliarUm = 1;
            
                                System.out.print("--(");
            
                                System.out.print(A[auxiliarUm][z] + "-" + A[auxiliarZero][z]);
            
                                System.out.print(")--");  
            
                            }

                            System.out.printf("%n");
                            System.out.println("###################");   
                            System.out.printf("%n");

                            break;

                        }else{

                            if(rotacao == 180){

                                System.out.println("--------180°--------"); 
                                System.out.println("###################");  
                
                                for(int z = 1; z < A[linha].length; z++){
                
                                    int auxiliarZero = 0;
                                    int auxiliarUm = 1;
                
                                    System.out.print("--(");
                
                                    System.out.print(A[auxiliarUm][linha] + "-" + A[auxiliarUm][auxiliarZero]);
                
                                    System.out.print(")--");  
                
                                    if(auxiliarUm == 1){
                
                                        auxiliarUm = 0;
                
                                        System.out.print("--(");
                
                                        System.out.print(A[auxiliarUm][linha] + "-" + A[auxiliarUm][auxiliarZero]);
                
                                        System.out.print(")--");  
                
                                        
                                    }
                
                                }
                
                                System.out.printf("%n");
                                System.out.println("###################");   
                                System.out.printf("%n");

                            }else{

                                if(rotacao == 270){

                                    System.out.println("--------270°--------"); 
                                    System.out.println("###################");  

                                    for(int z = 1; z < A[linha].length; z++){

                                        int auxiliarZero = 0;
                                        int auxiliarUm = 1;

                                        System.out.print("--(");

                                        System.out.print(A[auxiliarZero][auxiliarUm] + "-" + A[linha][auxiliarUm]);

                                        System.out.print(")--");  

                                        if(auxiliarUm == 1){

                                            auxiliarUm = 0;

                                            System.out.print("--(");

                                            System.out.print(A[auxiliarZero][auxiliarUm] + "-" + A[linha][auxiliarUm]);

                                            System.out.print(")--");  

                                        }

                                    }

                                    
                                    System.out.printf("%n");
                                    System.out.println("-------------------");

                                }else{

                                    System.out.println("O número inserido não é um grau válido. Digite novamente.");

                                    break;

                                }
                            }
                        }
                    }
                }
            }
        }
    }    
}
 
                /*
                for(int linhaMatriz[] : matriz){

                    for(int colunaMatriz : linhaMatriz){

                        System.out.print(colunaMatriz+" ");

                    }

                    System.out.printf("%n");

                }
                */
        
        

    
    

