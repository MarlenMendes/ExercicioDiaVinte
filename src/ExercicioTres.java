import java.time.LocalDate;

class Funcionario {
    private String nome;
    private LocalDate dataAdmissao;
    private double salario;
    private int identificador;
    private static int proximoIdentificador = 1;

    public Funcionario(String nome, LocalDate dataAdmissao, double salario) {
        this.nome = nome;
        setDataAdmissao(dataAdmissao);
        setSalario(salario);
        this.identificador =proximoIdentificador++;

    }

    public static void setProximoIdentificador(int proximoIdentificador) {
        Funcionario.proximoIdentificador = proximoIdentificador;
    }

    private void setSalario() {
        setSalario(0.0);
    }

    private void setSalario(double salario) {
    }

    private void setDataAdmissao(LocalDate dataAdmissao) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

      public Funcionario(LocalDate dataAdmissao) {

    }

    public void setDataAdmissao() {
        setDataAdmissao(null);
    }

    public void Funcionario(LocalDate dataAdmissao) {
        if (dataAdmissao.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Data de admissão não pode ser no futuro");
        }
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public int getIdentificador() {
        return identificador;
    }

    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João", LocalDate.of(2022, 6, 1), 2000.0);
        Funcionario funcionario2 = new Funcionario("Maria", LocalDate.of(2022, 5, 15), 1500.0);
        Funcionario funcionario3 = new Funcionario("Carlos", LocalDate.of(2022, 4, 10), 1800.0);

        System.out.println("Funcionário 1: " + funcionario1.getNome() + ", Identificador: " + funcionario1.getIdentificador());
        System.out.println("Funcionário 2: " + funcionario2.getNome() + ", Identificador: " + funcionario2.getIdentificador());
        System.out.println("Funcionário 3: " + funcionario3.getNome() + ", Identificador: " + funcionario3.getIdentificador());

    }

    
    }

