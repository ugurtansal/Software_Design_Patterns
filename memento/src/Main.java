public class Main {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        CareTaker caretaker = new CareTaker();

        // İlk çizgi çizilir ve kaydedilir
        canvas.drawLine("1. çizgi");
        caretaker.save(canvas);

        // İkinci çizgi çizilir ve kaydedilir
        canvas.drawLine("2. çizgi");
        caretaker.save(canvas);

        // Üçüncü çizgi çizilir ama kaydedilmez
        canvas.drawLine("3. çizgi");

        System.out.println("\n Durum:");
        canvas.showCanvas();

        // Geri al (3. çizgi silinmiş olacak)
        caretaker.undo(canvas);

        System.out.println("\n Geri alındıktan sonra durum:");
        canvas.showCanvas();
    }
}
