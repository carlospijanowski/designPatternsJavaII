package br.com.seteideias.BUILDER.entity;

public class EnderecoCompleto {

    private String logradouro;
    private String numero;
    private String complemento;

    private EnderecoCompleto(String log) {
        this.logradouro = log;
    }

    public String toString() {
        return "EnderecoCompleto {logradouro.: '" + this.logradouro + "'}";
    }

    public static class EnderecoCompletoBuilder {

        private String logradouroDentroDoBuilder;
        private String numero;
        private String complemento;

        public EnderecoCompletoBuilder logradouro(String rua) {

            this.logradouroDentroDoBuilder = rua;
            return this;

        }

        public EnderecoCompleto build() {
            return new EnderecoCompleto(this.logradouroDentroDoBuilder);
        }

    }

}
