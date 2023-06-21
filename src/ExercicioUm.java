abstract class Carro {
    private String marca;
    private int ano;
    private double valor;
    private String cor;
    private int portas;
    protected int velocidade;

    public Carro(String marca, int ano, double valor, String cor, int portas) {
        this.marca = marca;
        this.ano = ano;
        this.valor = valor;
        this.cor = cor;
        this.portas = portas;
        this.velocidade = 0;
    }
    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }

    public double getValor() {
        return valor;
    }
    public String getCor() {
        return cor;
    }
    public int getPortas() {
        return portas;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void iniciarMotor() {
        System.out.println("Iniciando o motor... minha velocidade está em " + velocidade + " km/h");
    }

    public abstract void frear();

    public abstract void acelerar();
}

class Renault extends Carro {
    public Renault(String marca, int ano, double valor, String cor, int portas) {
        super(marca, ano, valor, cor, portas);
    }

    @Override
    public void frear() {
        velocidade -= 5;
        System.out.println("Freando... minha velocidade está em " + velocidade + " km/h");
    }

    @Override
    public void acelerar() {
        velocidade += 10;
        System.out.println("Acelerando... minha velocidade está em " + velocidade + " km/h");
    }
}

class Fiat extends Carro {
    public Fiat(String marca, int ano, double valor, String cor, int portas) {
        super(marca, ano, valor, cor, portas);
        velocidade = 3;
    }

    @Override
    public void frear() {
        velocidade -= 6;
        System.out.println("Freando... minha velocidade está em " + velocidade + " km/h");
    }

    @Override
    public void acelerar() {
        velocidade += 12;
        System.out.println("Acelerando... minha velocidade está em " + velocidade + " km/h");
    }
}

class Hyundai extends Carro {
    public Hyundai(String marca, int ano, double valor, String cor, int portas) {
        super(marca, ano, valor, cor, portas);
        velocidade = 5;
    }

    @Override
    public void frear() {
        velocidade -= 2;
        System.out.println("Freando... minha velocidade está em " + velocidade + " km/h");
    }

    @Override
    public void acelerar() {
        velocidade += 15;
        System.out.println("Acelerando... minha velocidade está em " + velocidade + " km/h");
    }

}
