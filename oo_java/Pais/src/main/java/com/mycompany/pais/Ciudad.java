package main.java.com.mycompany.pais;


public class Ciudad {
    
    private int pob;
    private String com;
    private String gent;
    private String post;
    private String name;

    public Ciudad(String name, int pob, String com, String gent, String post) {
        this.name = name;
        this.pob = pob;
        this.com = com;
        this.gent = gent;
        this.post = post;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPob() {
        return this.pob;
    }

    public void setPob(int pob) {
        this.pob = pob;
    }

    public String getCom() {
        return this.com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public String getGent() {
        return this.gent;
    }

    public void setGent(String gent) {
        this.gent = gent;
    }

    public String getPost() {
        return this.post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getInfo() {
        return "Nombre: " + getName() + "\nComunidad: " + getCom() + "\nGentilicio: " + getGent() + "\nCódigo postal: "
                + getPost() + "\n";
    }


}
