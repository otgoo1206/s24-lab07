package frogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Refactor Task 2.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Records {
    private final List<FroggerID> records;

    public Records() {
        this.records = new ArrayList<>();
    }

    /**
     * Adds a frogger's record.
     *@param froggerID Frogger-ийн мэдээлэл агуулсан обьект
     * @return false хэрэв бүртгэл давхцаж байвал, үгүй бол true.
     * @return Return false if the record has existed. Else, return true.
     */
    public boolean addRecord(FroggerID froggerID) {
        if (records.contains(froggerID)) { // `equals()` автоматаар ажиллана
            return false;
        }
        records.add(froggerID);
        return true;
    }
}