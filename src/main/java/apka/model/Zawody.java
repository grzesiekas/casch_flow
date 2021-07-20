package apka.model;

public class Zawody {

    public int id;
    public String zawod;
    private int zarobki;
    private int podatki;
    private int spłata_kredytu_hipotecznego;
    private int Sp_kr_studenckiego;
    private int Sp_kr_na_samochód;
    private int Sp_kart_kredytowych;
    private int Sp_kr_konsumenckiego;
    private int Inne_koszty;
    private int koszt_dzieci;
    private int oszczędności;
    private int przychód_pasywny;
    private int suma_przychodów;
    private int koszt_1_dziecka;
    private int suma_kosztów;
    private int wypłata;
    private int własny_kredyt_hipoteczny;
    private int kredyt_studencki;
    private int kredyt_na_samochod;
    private int kartyKredytowe;
    private int kredyt_konsumencki;

    public Zawody() {
    }

    public Zawody(int id, String zawod, int zarobki, int podatki, int spłata_kredytu_hipotecznego,
                  int sp_kr_studenckiego, int sp_kr_na_samochód, int sp_kart_kredytowych,
                  int sp_kr_konsumenckiego, int inne_koszty, int koszt_dzieci, int oszczędności,
                  int przychód_pasywny, int suma_przychodów, int koszt_1_dziecka, int suma_kosztów,
                  int wypłata, int własny_kredyt_hipoteczny, int kredyt_studencki,
                  int kredyt_na_samochod, int kartyKredytowe, int kredyt_konsumencki) {
        this.id = id;
        this.zawod = zawod;
        this.zarobki = zarobki;
        this.podatki = podatki;
        this.spłata_kredytu_hipotecznego = spłata_kredytu_hipotecznego;
        Sp_kr_studenckiego = sp_kr_studenckiego;
        Sp_kr_na_samochód = sp_kr_na_samochód;
        Sp_kart_kredytowych = sp_kart_kredytowych;
        Sp_kr_konsumenckiego = sp_kr_konsumenckiego;
        Inne_koszty = inne_koszty;
        this.koszt_dzieci = koszt_dzieci;
        this.oszczędności = oszczędności;
        this.przychód_pasywny = przychód_pasywny;
        this.suma_przychodów = suma_przychodów;
        this.koszt_1_dziecka = koszt_1_dziecka;
        this.suma_kosztów = suma_kosztów;
        this.wypłata = wypłata;
        this.własny_kredyt_hipoteczny = własny_kredyt_hipoteczny;
        this.kredyt_studencki = kredyt_studencki;
        this.kredyt_na_samochod = kredyt_na_samochod;
        this.kartyKredytowe = kartyKredytowe;
        this.kredyt_konsumencki = kredyt_konsumencki;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getZawod() {
        return zawod;
    }

    public void setZawod(String zawod) {
        this.zawod = zawod;
    }

    public int getZarobki() {
        return zarobki;
    }

    public void setZarobki(int zarobki) {
        this.zarobki = zarobki;
    }

    public int getPodatki() {
        return podatki;
    }

    public void setPodatki(int podatki) {
        this.podatki = podatki;
    }

    public int getSpłata_kredytu_hipotecznego() {
        return spłata_kredytu_hipotecznego;
    }

    public void setSpłata_kredytu_hipotecznego(int spłata_kredytu_hipotecznego) {
        this.spłata_kredytu_hipotecznego = spłata_kredytu_hipotecznego;
    }

    public int getSp_kr_studenckiego() {
        return Sp_kr_studenckiego;
    }

    public void setSp_kr_studenckiego(int sp_kr_studenckiego) {
        Sp_kr_studenckiego = sp_kr_studenckiego;
    }

    public int getSp_kr_na_samochód() {
        return Sp_kr_na_samochód;
    }

    public void setSp_kr_na_samochód(int sp_kr_na_samochód) {
        Sp_kr_na_samochód = sp_kr_na_samochód;
    }

    public int getSp_kart_kredytowych() {
        return Sp_kart_kredytowych;
    }

    public void setSp_kart_kredytowych(int sp_kart_kredytowych) {
        Sp_kart_kredytowych = sp_kart_kredytowych;
    }

    public int getSp_kr_konsumenckiego() {
        return Sp_kr_konsumenckiego;
    }

    public void setSp_kr_konsumenckiego(int sp_kr_konsumenckiego) {
        Sp_kr_konsumenckiego = sp_kr_konsumenckiego;
    }

    public int getInne_koszty() {
        return Inne_koszty;
    }

    public void setInne_koszty(int inne_koszty) {
        Inne_koszty = inne_koszty;
    }

    public int getKoszt_dzieci() {
        return koszt_dzieci;
    }

    public void setKoszt_dzieci(int koszt_dzieci) {
        this.koszt_dzieci = koszt_dzieci;
    }

    public int getOszczędności() {
        return oszczędności;
    }

    public void setOszczędności(int oszczędności) {
        this.oszczędności = oszczędności;
    }

    public int getPrzychód_pasywny() {
        return przychód_pasywny;
    }

    public void setPrzychód_pasywny(int przychód_pasywny) {
        this.przychód_pasywny = przychód_pasywny;
    }

    public int getSuma_przychodów() {
        return suma_przychodów;
    }

    public void setSuma_przychodów(int suma_przychodów) {
        this.suma_przychodów = suma_przychodów;
    }

    public int getKoszt_1_dziecka() {
        return koszt_1_dziecka;
    }

    public void setKoszt_1_dziecka(int koszt_1_dziecka) {
        this.koszt_1_dziecka = koszt_1_dziecka;
    }

    public int getSuma_kosztów() {
        return suma_kosztów;
    }

    public void setSuma_kosztów(int suma_kosztów) {
        this.suma_kosztów = suma_kosztów;
    }

    public int getWypłata() {
        return wypłata;
    }

    public void setWypłata(int wypłata) {
        this.wypłata = wypłata;
    }

    public int getWłasny_kredyt_hipoteczny() {
        return własny_kredyt_hipoteczny;
    }

    public void setWłasny_kredyt_hipoteczny(int własny_kredyt_hipoteczny) {
        this.własny_kredyt_hipoteczny = własny_kredyt_hipoteczny;
    }

    public int getKredyt_studencki() {
        return kredyt_studencki;
    }

    public void setKredyt_studencki(int kredyt_studencki) {
        this.kredyt_studencki = kredyt_studencki;
    }

    public int getKredyt_na_samochod() {
        return kredyt_na_samochod;
    }

    public void setKredyt_na_samochod(int kredyt_na_samochod) {
        this.kredyt_na_samochod = kredyt_na_samochod;
    }

    public int getKartyKredytowe() {
        return kartyKredytowe;
    }

    public void setKartyKredytowe(int kartyKredytowe) {
        this.kartyKredytowe = kartyKredytowe;
    }

    public int getKredyt_konsumencki() {
        return kredyt_konsumencki;
    }

    public void setKredyt_konsumencki(int kredyt_konsumencki) {
        this.kredyt_konsumencki = kredyt_konsumencki;
    }

}

