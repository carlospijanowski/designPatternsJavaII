package br.com.seteideias.BUILDER;

import br.com.seteideias.BUILDER.entity.Aluno;
import br.com.seteideias.BUILDER.entity.Animal;
import br.com.seteideias.BUILDER.entity.EnderecoCompleto;
import br.com.seteideias.BUILDER.entity.Pessoa;

public class BuilderPrincipal {
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

        final Animal build = new Animal.AnimalBuilder()
                .classe("mamifero")
                .classe("outra coisa")
                .build();

        System.out.println(build);

    }
}
