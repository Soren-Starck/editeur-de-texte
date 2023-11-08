package fr.iut.editeur.document;

public class Document {

    private String texte;

    public Document() {
        this.texte = "";
    }

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public void ajouter(String texte) {
        this.texte += texte;
    }

    @Override
    public String toString() {
        return this.texte;
    }

    public void remplacer(int start, int end, String remplacement) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        texte = leftPart + remplacement + rightPart;
    }

    public void majuscule(int start, int end) {
        String leftPart = texte.substring(0, start);
        String rightPart = texte.substring(end);
        String toUpper = texte.substring(start, end).toUpperCase();
        texte = leftPart + toUpper + rightPart;
    }

    public void clear() {
        texte = "";
    }
}
