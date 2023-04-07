package projeto;

public class Aluno {

    private String nome;
    private char sexo;
    public float nota1, nota2, nota3, mediaind, idade ;

    

    public Aluno() {
    }

    public Aluno(String nome, char sexo, float nota1,float nota2,float nota3, float mediaind, float idade) {
        setNome(nome);
        setSexo(sexo);
        setNota1(nota1);
        setNota2(nota2);
        setNota3(nota3);
        setMediaind(mediaind);
        setIdade(idade);
    }

   

    @Override
    public String toString() {
        return "Aluno {" + "nome=" + nome + ", sexo=" + sexo
                + ",Idade= " + idade + ", primeira nota= " + nota1 + ",segunda nota " + nota2 + ",terceira nota " + nota3 +'}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        sexo = Character.toUpperCase(sexo);

        if (sexo != 'F' && sexo != 'M') {
            sexo = '-';
        }
        this.sexo = sexo;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }
    
    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }
    public float getMediaind() {
        return mediaind;
    }

    public void setMediaind(float mediaind) {
        this.mediaind = mediaind;
    }

     public float getIdade() {
        return idade;
    }

    public void setIdade(float idade) {
        this.idade = idade;
    }
}
