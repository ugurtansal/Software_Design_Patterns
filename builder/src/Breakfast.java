public class Breakfast {

    private boolean egg;
    private boolean greenOlive;
    private boolean blackOlive;
    private boolean bread;
    private boolean erzincanBezTulumCheese;
    private boolean jelly;
    private boolean honey;

    public boolean getGreenOlive() {
        return greenOlive;
    }

    public void setGreenOlive(boolean greenOlive) {
        this.greenOlive = greenOlive;
    }

    public boolean getEgg() {
        return egg;
    }

    public void setEgg(boolean egg) {
        this.egg = egg;
    }

    public boolean getBlackOlive() {
        return blackOlive;
    }

    public void setBlackOlive(boolean blackOlive) {
        this.blackOlive = blackOlive;
    }

    public boolean getBread() {
        return bread;
    }

    public void setBread(boolean bread) {
        this.bread = bread;
    }

    public boolean getErzincanBezTulumCheese() {
        return erzincanBezTulumCheese;
    }

    public void setErzincanBezTulumCheese(boolean erzincanBezTulumCheese) {
        this.erzincanBezTulumCheese = erzincanBezTulumCheese;
    }

    public boolean getJelly() {
        return jelly;
    }

    public void setJelly(boolean jelly) {
        this.jelly = jelly;
    }

    public boolean getHoney() {
        return honey;
    }

    public void setHoney(boolean honey) {
        this.honey = honey;
    }

    public boolean getTea() {
        return tea;
    }

    public void setTea(boolean tea) {
        this.tea = tea;
    }

    public boolean getCoffee() {
        return coffee;
    }

    public void setCoffee(boolean coffee) {
        this.coffee = coffee;
    }

    public boolean getPeanutButter() {
        return peanutButter;
    }

    public void setPeanutButter(boolean peanutButter) {
        this.peanutButter = peanutButter;
    }

    private boolean tea;
    private boolean coffee;
    private boolean peanutButter;

    public String toString() {

        if(this.getEgg()) {
            System.out.println("Egg");
        }
        if(this.getBlackOlive()) {
            System.out.println("Black Olive");
        }
        if(this.getGreenOlive()) {
            System.out.println("Green Olive");
        }
        if(this.getBread()) {
            System.out.println("Bread");
        }
        if(this.getErzincanBezTulumCheese()) {
            System.out.println("Erzincan Bez Tulum Cheese");
        }
        if(this.getJelly()) {
            System.out.println("Jelly");
        }
        if(this.getHoney()) {
            System.out.println("Honey");
        }if(this.getTea()) {
            System.out.println("Tea");
        }
        if(this.getCoffee()) {
            System.out.println("Coffee");
        }
        if(this.getPeanutButter()) {
            System.out.println("Peanut Butter");
        }
        return "";
    }


}
