package org.example.BUILDER;

import org.example.BUILDER.entity.Aluno;
import org.example.BUILDER.entity.EnderecoCompleto;
import org.example.BUILDER.entity.Pessoa;

public class Main {
    public static void main(String[] args) {

        Pessoa carlos = new Pessoa.PessoaBuilder()
                .name("Carlos")
                .enderecoCompleto(new EnderecoCompleto.EnderecoCompletoBuilder()
                        .logradouro("Rua Marfim")
                        .build())
                .build();

        System.out.println(carlos);


        EnderecoCompleto end = new EnderecoCompleto.EnderecoCompletoBuilder()
                .logradouro("Rua Marfim")
                .build();

        System.out.println(end.toString());


        final Aluno aluno = new Aluno.AlunoBuilder()
                .registro("12345")
                .pessoaAluno(new Pessoa.PessoaBuilder()
                        .name("Carlos")
                        .enderecoCompleto(new EnderecoCompleto.EnderecoCompletoBuilder()
                                .logradouro("Rua Osorio")
                                .build())
                        .build())
                .build();

        System.out.println(aluno);

    }
}
