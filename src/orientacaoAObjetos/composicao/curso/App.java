package orientacaoAObjetos.composicao.curso;

public class App {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Trixie");
        Aluno aluno2 = new Aluno("Gigi");
        Aluno aluno3 = new Aluno("Katya");

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Javascript");
        Curso curso3 = new Curso("React");

        curso1.adicionarAluno(aluno1);
        curso1.adicionarAluno(aluno2);

        curso2.adicionarAluno(aluno1);
        curso2.adicionarAluno(aluno3);

        aluno1.adicionarCurso(curso3);
        aluno2.adicionarCurso(curso3);
        aluno3.adicionarCurso(curso3);

        for(Aluno aluno: curso1.alunos){
            System.out.println(curso1.nome);
            System.out.println(aluno.nome);
            System.out.println(" ");
        }

        for(Aluno aluno: curso2.alunos){
            System.out.println(curso2.nome);
            System.out.println(aluno.nome);
            System.out.println(" ");

        }for(Aluno aluno: curso3.alunos){
            System.out.println(curso3.nome);
            System.out.println(aluno.nome);
            System.out.println(" ");
        }

        Curso cursoEncontrado = aluno1.obterCursoPorNome("java");

        if(cursoEncontrado != null) {
            System.out.println(cursoEncontrado.nome);
            for (Aluno aluno: cursoEncontrado.alunos) {
                System.out.println(aluno.toSrting());
            }
        }

    }
}
