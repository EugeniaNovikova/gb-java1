package shildt;
// Вычисление расстояния до места вспышки молнии,
// звук от которой доходит до наблюдателя
// через 7,2 секунды
//  Скорость распространения звука 1100 фут/с = 330 м/с
public class Sound {
    public static void main(String[] args) {
        double dist;
        dist = 330 * 7.2;
        System.out.println("Расстояние до места вспышки молнии равно " + dist + " метров");
    }
}
