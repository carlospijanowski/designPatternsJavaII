package org.example.BUILDER.entity;

public class Pessoa {

    private String name;
    private EnderecoCompleto enderecoCompleto;
    private Pessoa(String name, EnderecoCompleto enderecoCompleto){
        this.name = name;
        this.enderecoCompleto = enderecoCompleto;
    }

    @Override
    public String toString() {
        return "Pessoa{name.: '"+name+"', endereco completo.: '"+enderecoCompleto+"'}";
    }

    public static class PessoaBuilder{

        private String nameNoBuilder;

        private EnderecoCompleto enderecoCompletoNoBuilder;

        public PessoaBuilder name (String nameVindoDeVariavel) {
            this.nameNoBuilder = nameVindoDeVariavel;
            return this;
        }

        public PessoaBuilder enderecoCompleto (EnderecoCompleto end) {
            this.enderecoCompletoNoBuilder = end;
            return this;
        }



        public Pessoa build (){

            return new Pessoa(nameNoBuilder, enderecoCompletoNoBuilder);

        }


    }




}
