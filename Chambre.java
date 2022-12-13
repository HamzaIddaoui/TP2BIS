public class Chambre {
    private int _numero;
    private int _Categorie;
    private float _prix;
    private int _Capacite;
    private Etat _Etat;


    public Chambre()
    {
        this._numero = -1;
        this._Categorie = -1;
        this._Capacite = -1;
        this._prix = -1;
        this._Etat = Etat.L;
    }

    public Chambre(int numero, int categorie, float prix, int Capacite, Etat etat)
    {
        this._numero = numero;
        this._Categorie = categorie;
        this._prix = prix;
        this._Capacite = Capacite;
        this._Etat = etat;
    }

    public int get_numero() {
        return _numero;
    }

    public void set_numero(int numero) {
        this._numero = numero;
    }

    public int get_Categorie() {
        return _Categorie;
    }

    public void set_Categorie(int _Categorie) {
        this._Categorie = _Categorie;
    }

    public float get_prix() {
        return _prix;
    }

    public void set_prix(float _prix) {
        this._prix = _prix;
    }

    public int get_Capacite() {
        return _Capacite;
    }

    public void set_Capacite(int _Capacite) {
        this._Capacite = _Capacite;
    }

    public Etat get_Etat() {
        return _Etat;
    }

    public void set_Etat(Etat _Etat) {
        this._Etat = _Etat;
    }

    @Override
    public String toString() {
        return "Chambre{" +
                "_numero=" + _numero +
                ", _Categorie=" + _Categorie +
                ", _prix=" + _prix +
                ", _Capacite=" + _Capacite +
                ", _Etat=" + _Etat +
                '}';
    }
}
