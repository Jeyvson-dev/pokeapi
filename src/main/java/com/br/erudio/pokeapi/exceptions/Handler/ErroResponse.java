package com.br.erudio.pokeapi.exceptions.Handler;

public class ErroResponse {

    private int status;
    private String mensagem;


    public ErroResponse() {
    }

    public int getStatus() {
        return this.status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMensagem() {
        return this.mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }


}
