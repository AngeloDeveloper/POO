package com.company.primeira;

public class Ingles extends Email{

    public Ingles(String remetente, String destinatario, String assunto,String corpo) {
        super(remetente, destinatario, assunto, corpo);
        definelanguage("From","For","Subject","Dear","Sincerely");
    }

}