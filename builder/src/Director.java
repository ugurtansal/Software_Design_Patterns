public class Director {
    private BreakfastBuilder breakfastBuilder;

    public Director(BreakfastBuilder breakfastBuilder){
        this.breakfastBuilder=breakfastBuilder;
    }

    public Breakfast prepareBreakfast(){
        breakfastBuilder.egg();
        breakfastBuilder.blackOlive();
        breakfastBuilder.bread();
        breakfastBuilder.greenOlive();
        breakfastBuilder.erzincanBezTulumCheese();
        breakfastBuilder.jelly();
        breakfastBuilder.honey();
        breakfastBuilder.tea();
        breakfastBuilder.coffee();
        breakfastBuilder.peanutButter();
       return breakfastBuilder.build();
    }
}
