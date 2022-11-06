package br.com.seteideias.BUILDER.entity;

public class Aluno extends Object {

    private String registro;
    private Pessoa pessoaAluno;

    private Aluno(String re, Pessoa pessoa) {
        this.registro = re;
        this.pessoaAluno = pessoa;
    }

    @Override
    public String toString() {
        return "Aluno{registro.: '" + registro + "', pessoaAluno.: '" + pessoaAluno + "'}";
    }

    public static class AlunoBuilder {

        private String registro;
        private Pessoa pessoaAluno;

        public AlunoBuilder registro(String re) {
            this.registro = re;
            return this;
        }

        public AlunoBuilder pessoaAluno(Pessoa pessoa) {
            this.pessoaAluno = pessoa;
            return this;
        }

        public Aluno build() {
            return new Aluno(registro, pessoaAluno);
        }

    }

}
