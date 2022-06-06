
package modell;

public class kincseslada {
    private String szin, szoveg;
    private boolean vanbennekincs;

    public kincseslada(String szin, String szoveg, boolean vanbennekincs) {
        this.szin = szin;
        this.szoveg = szoveg;
        this.vanbennekincs = vanbennekincs;
    }

    public String getSzin() {
        return szin;
    }

    public String getSzoveg() {
        return szoveg;
    }

    public boolean isVanbennekincs() {
        return vanbennekincs;
    }

    public void setSzin(String szin) {
        this.szin = szin;
    }

    public void setSzoveg(String szoveg) {
        this.szoveg = szoveg;
    }

    public void setVanbennekincs(boolean vanbennekincs) {
        this.vanbennekincs = vanbennekincs;
    }
    
}
