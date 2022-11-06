package br.com.seteideias.BUILDER.entity;

public class Animal {

    private String classe;

    private String ordem;

    private Animal (String classe, String ordem){
        this.classe = classe;
        this.ordem = ordem;
    }

    @Override
    public String toString(){
        return "Animal{classe.: '"+classe+"', ordem.: '"+ordem+"'}";
    }

    public static class AnimalBuilder{

        private String classe;
        private String ordem;

        public AnimalBuilder classe(String classe){
            this.classe = classe;
            return this;
        }

        public AnimalBuilder ordem(String ordem){
            this.ordem = ordem;
            return this;
        }

        public Animal build(){
           return new Animal(this.classe, this.ordem);
        }

    }

}
