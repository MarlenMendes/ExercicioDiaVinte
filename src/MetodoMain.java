public class MetodoMain {
    public static void main(String[] args) {
        Renault renault = new Renault("Renault", 2022, 25000.0, "Prata", 4);
        Fiat fiat = new Fiat("Fiat", 2021, 20000.0, "Preto", 2);
        Hyundai hyundai = new Hyundai("Hyundai", 2023, 30000.0, "Branco", 4);

        renault.iniciarMotor();
        renault.acelerar();
        renault.frear();

        fiat.iniciarMotor();
        fiat.acelerar();
        fiat.frear();

        hyundai.iniciarMotor();
        hyundai.acelerar();
        hyundai.frear();

    }
}
