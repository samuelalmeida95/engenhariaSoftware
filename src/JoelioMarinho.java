public class JoelioMarinho {
    private Integer atributo1;
    private Integer atributo2;
    private Integer atributo3;

    public JoelioMarinho(Integer atributo1, Integer atributo2) {
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;

    }

    public Integer getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(Integer atributo1) {
        this.atributo1 = atributo1;
    }

    public Integer getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(Integer atributo2) {
        this.atributo2 = atributo2;
    }

    public Integer getAtributo3() {
        return atributo3;
    }

    public void setAtributo3(Integer atributo3) {
        this.atributo3 = atributo3;
    }
    public Integer soma(){
        atributo3 =atributo1+atributo2;
        return atributo3;
    }
}
