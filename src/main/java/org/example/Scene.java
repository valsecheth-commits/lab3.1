package org.example;

import jakarta.annotation.PreDestroy;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Scene {
    private List<Shape> objects;

    public Scene(List<Shape> objects) {
        this.objects = objects;
    }

    void draw() {
        for (Shape shape : getObjects()) {
            shape.draw();
        }
    }

    @PreDestroy
    public void destroy() {
        for (Shape shape : getObjects()) {
            shape.erase();
        }
    }
}
