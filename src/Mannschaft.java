public class Mannschaft {
    private Strategie strategie;
    private String mannschaftsname;
    public Mannschaft(Strategie strategie,String mannschaftsname){
        this.mannschaftsname=mannschaftsname;
        this.strategie=strategie;
    }

    public Strategie getStrategie() {
        return strategie;
    }

    public void setStrategie(Strategie strategie) {
        this.strategie = strategie;
    }

    public String getMannschaftsname() {
        return mannschaftsname;
    }

    public void setMannschaftsname(String mannschaftsname) {
        this.mannschaftsname = mannschaftsname;
    }
    public void fuehreStrategieAus(){
        this.strategie.fuehreStrategieAus();
    }
}
