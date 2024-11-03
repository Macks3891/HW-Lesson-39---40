/**
 * Класс, представляющий дом.
 */
public class House {
    private int floors;
    private int rooms;
    private boolean hasGarage;


    private House(HouseBuilder builder) {
        this.floors = builder.floors;
        this.rooms = builder.rooms;
        this.hasGarage = builder.hasGarage;
    }


    public int getFloors() {
        return floors;
    }

    public int getRooms() {
        return rooms;
    }

    public boolean hasGarage() {
        return hasGarage;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", rooms=" + rooms +
                ", hasGarage=" + hasGarage +
                '}';
    }


    public static class HouseBuilder {
        private int floors;
        private int rooms;
        private boolean hasGarage;


        public HouseBuilder setFloors(int floors) {
            this.floors = floors;
            return this;
        }

        public HouseBuilder setRooms(int rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }


        public House build() {
            return new House(this);
        }
    }
}