public class KomputerMac implements Komputer{
    private String procesor;
    private String plytaGlowna;
    private String zasilacz;
    @Override
    public void uruchom() {
        System.out.println("dZIAŁAAAAAAAAA");
    }

    @Override
    public void zepsujSie() {
        System.out.println("ni3 Dizłaaaa (┬┬﹏┬┬)");
    }

    public KomputerMac(String procesor, String zasilacz, String plytaGlowna) {
        this.procesor = procesor;
        this.zasilacz = zasilacz;
        this.plytaGlowna = plytaGlowna;
    }
}
