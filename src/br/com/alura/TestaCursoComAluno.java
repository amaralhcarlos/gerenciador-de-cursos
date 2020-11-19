package br.com.alura;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.add(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.add(new Aula("Criando uma Aula", 20));
        javaColecoes.add(new Aula("Modelando com Coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Maurício Aniche", 17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println("Todos os alunos matrículados nesse curso");
        javaColecoes.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        //Resultado: VERDADEIRO
        System.out.println("O aluno " + a1 + " está matrículado? " + javaColecoes.estaMatriculado(a1));


        //Resultado: FALSO caso o método equals não tenha sido sobrescrito na classe Aluno
        Aluno novoTurini = new Aluno("Rodrigo Turini", 34672);
        System.out.println("O aluno " + novoTurini + " está matrículado? " + javaColecoes.estaMatriculado(novoTurini));


    }

}
