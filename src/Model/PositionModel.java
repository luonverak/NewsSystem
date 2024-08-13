package Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class PositionModel {

   

    private int id;
    private String position;

    public PositionModel(String position) {
        this.position = position;
    }

    public PositionModel(int id, String position) {
        this.id = id;
        this.position = position;
    }
     @Override
    public String toString() {
        return "PositionModel{" + "id=" + id + ", position=" + position + '}';
    }
}
