package frogger;

/**
 * Refactor Task 1 & 2: Frogger
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22), Duan Liang (F23)
 */
public class Frogger {

    // Field for task 1.
    private final Road road;
    private int position;
    
    // Field for task 2. Anything to add/change?
    //firstName, lastName, phoneNumber, zipCode, state, gender гэсэн 6
    // тусдаа хувьсагч байгаа нь Long Parameter List асуудлыг үүсгэж байна.
    private final Records records;
    private String firstName, lastName, phoneNumber, zipCode, state, gender;

    public Frogger(Road road, int position, Records records, String firstName, String lastName, String phoneNumber,
    String zipCode, String state, String gender) {
        this.road = road;
        this.position = position;
        this.records = records;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.state = state;
        this.gender = gender;
    }

    /**
     * Moves Frogger.
     *
     * @param forward true is move forward, else false.
     * @return true if move successful, else false.
     */
    public boolean move(boolean forward) {
        int nextPosition = this.position + (forward ? 1 : -1);
        if (!isValid(nextPosition) || isOccupied(nextPosition)) {
            return false;
        }
        this.position = nextPosition;
        return true;
    }

    // TODO: Do you notice any issues here?
    //Road класст isOccupied болон isValid методыгоо өгсөн тул Frogger хамаарал багатай болсон.
    public boolean isOccupied(int position) {
        return road.isOccupied(position);
    }
    
    public boolean isValid(int position) {
        return road.isValid(position);
    }
    

    /**
     * Records Frogger to the list of records.
     * 
     * @return true if record successful, else false.
     */
    public boolean recordMyself() {
        FroggerID froggerID = new FroggerID(firstName, lastName, phoneNumber, zipCode, state, gender);
        return records.addRecord(froggerID);
    }
    

}
