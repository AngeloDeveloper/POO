package com.company.primeira;

public class portugues extends Email{

        public portugues(String remetente, String destinatario, String assunto,String corpo) {
            super(remetente, destinatario, assunto, corpo);
            definelanguage("De","para","Assunto","querido","Sincerelamente");
        }

}
