package VacuumCleaner;

import java.util.Random;

public class Main {

    public static final String[] names = {"Kitchen", "Hall", "Study", "Bedroom", "Living room"};

    public static void main(String[] args) {
        Random random = new Random();
        Cleaner cleaner = new Cleaner();
        Room[] rooms = new Room[names.length];
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room();
            rooms[i].setConditionIsClean(random.nextBoolean());
            rooms[i].setName(names[i]);
            rooms[i].setState(names[i]);

            System.out.println("Room\t" + rooms[i].getName() + "\t" + "\t" + rooms[i].getState());
        }
        for (Room room : rooms) {
            if (room.getConditionIsClean() == false) {
                cleaner.setToClean(room.getConditionIsClean());
                System.out.println("for\t\t"+ room.getName()+"\t"+cleaner.stateClean);
            }
        }
    }
}


