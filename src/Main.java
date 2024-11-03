/**
 * Главный класс, демонстрирующий использование класса House.
 */
public class Main {
    public static void main(String[] args) {
        // Создаем два дома с использованием билдера
        House house1 = new House.HouseBuilder()
                .setFloors(2)
                .setRooms(5)
                .setHasGarage(true)
                .build();

        House house2 = new House.HouseBuilder()
                .setFloors(3)
                .setRooms(7)
                .setHasGarage(false)
                .build();


        System.out.println(house1);
        System.out.println(house2);
    }
}