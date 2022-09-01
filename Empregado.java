public class Empregado{
    private String nome;
    private int idade;
    private int tipo;
    private double salario;
    private double comissao;
    private double bonus;

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public int getTipo() {
        return tipo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalario() {
        return salario;
    }
    public double getComissao() {
        return comissao;
    }
    public double getBonus() {
        return bonus;
    }

    public double calcularSalario(){
        if (tipo == 1)
            return salario;
        if (tipo == 2)
            return salario + salario + comissao;
        if (tipo == 3)
            return salario + bonus;
        return 0;
    }

    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}

/*  O encapsulador é o privete
    Get e Set são metodos
    comitir OBS: não pode falar cimitar
    tracked & untracked
    Transporte de untracked para tracked fica "A" e fica verde, pois esta stade.
    "M" significa Modifield

    Comandos
    git status -s
    git add <nome do arquivo.>
    git log
    git commit -m "colocar um texto"
    javac*.java
    
*/