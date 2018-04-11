package com.company.primeira;

public abstract class Email {
//--LINGUA--\\
    String deL;
    String paraL;
    String assuntoL;
    String queridoL;
    String sinceramenteL;

 //---email ---\\\

     String  remetente;
      String  destinatario;
     String  assuntoE;
     String corpo;

     void definelanguage(String detemp,String paratemp, String assuntotemp, String queridotemp, String sinceramentetemp){

          deL=detemp;
          paraL=paratemp;
         assuntoL=assuntotemp;
         queridoL=queridotemp;
         sinceramenteL=sinceramentetemp;
     }


    public Email(String de,String para, String assunto, String corpoP){
        remetente=de;
        destinatario=para;
        assuntoE=assunto;
        corpo=corpoP;
    }

    void printa(){
        System.out.println(deL+": "+remetente);
        System.out.println(paraL+": "+destinatario);
        System.out.println(assuntoL+": "+this.assuntoE);
        System.out.println(queridoL+" "+destinatario);
        System.out.println();
        System.out.println();
        System.out.println(corpo);
        System.out.println();
        System.out.println();
        System.out.println(sinceramenteL+",");
        System.out.println(remetente);
    }


}
