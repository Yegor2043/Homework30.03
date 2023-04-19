package lesson2.shape;

public class FigureTester {
    public static void main(String[] args) {
        Figure[] figures = new Figure[1000];
        figures[0] = new Circle(15);
        figures[0].area();
        figures[0].perimeter();
        figures[1] = new Rectangle(20, 40);
        figures[1].perimeter();
        figures[1].area();
        figures[2] = new Triangle(3, 4, 5);
        figures[2].area();

    double summArea = figures[0].area();
    double summPerimeter = figures[0].perimeter();
        for (int i = 1; i< figures.length; i++){
        if(figures[i]!=null){

            summArea = summArea + figures[i].area();
            summPerimeter = summPerimeter + figures[i].perimeter();}
    }
        System.out.println("summ area: " + summArea);
        System.out.println("summ perimeter: " + summPerimeter);
}
}