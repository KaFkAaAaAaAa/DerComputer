public class KomputerWindows implements Komputer{
    private String procesor;
    private String plytaGlowna;
    private String zasilacz;
    @Override
    public void uruchom() {
        System.out.println("Dizłą");
    }

    @Override
    public void zepsujSie() {
        System.out.println("nie dizala");
    }
}
