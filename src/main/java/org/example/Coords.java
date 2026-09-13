package org.example;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@Getter
@Setter
public class Coords {
    Long x;
    Long y;

    public Coords() {
    }

    public Coords(Long y, Long x) {
        this.y = y;
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Coords coords = (Coords) o;
        return Objects.equals(x, coords.x) && Objects.equals(y, coords.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}
