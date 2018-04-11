package com.company.primeira;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada= new Scanner(System.in);

        int op=10;

        do{

            System.out.println("Bem vindo ao email Escolha uma classe de emails para escrever");
            System.out.println("1 para portugues 2 para ingles");
            int tempop=entrada.nextInt();
            entrada.nextLine();

            String remetente;
            String destinatario;
            String assunto;
            String corpo;

            switch (tempop){
                case 1:
                    System.out.println("Digite o remetente: ");
                    remetente= entrada.nextLine();
                    System.out.println("Digite o destinatario: ");
                    destinatario= entrada.nextLine();
                    System.out.println("Digite o assunto: ");
                    assunto= entrada.nextLine();
                    System.out.println("Digite o corpo da mensagem");
                    corpo=entrada.nextLine();
                    portugues aemail= new portugues(remetente,destinatario,assunto,corpo);
                    System.out.println("");
                    System.out.println("Seu email: ");
                    aemail.printa();
                    break;
                case 2:
                    System.out.println("Write sender: ");
                    remetente= entrada.nextLine();
                    System.out.println("Write receiver: ");
                    destinatario= entrada.nextLine();
                    System.out.println("Write subject: ");
                    assunto= entrada.nextLine();
                    System.out.println("Write a message");
                    corpo=entrada.nextLine();
                    Ingles bemail= new Ingles(remetente,destinatario,assunto,corpo);
                    System.out.println("");
                    System.out.println("Your menssage: ");
                    bemail.printa();
                    break;


            }
            }while (op!=0);



    }
}
