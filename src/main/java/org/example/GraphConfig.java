package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("org.example")
@PropertySource("classpath:graph.properties")
public class GraphConfig {

    @Autowired
    private Environment env;

    @Autowired
    private Coords coords;


    @Bean
    @Scope("prototype")
    public Point beanPoint(){
        Point p = new Point(coords);
        p.setX(env.getProperty("point.x", Long.class, 0L));
        p.setY(env.getProperty("point.y", Long.class, 0L));
        p.setColor(env.getProperty("point.color", Shape.DEFAULT_COLOR));

        return p;
    }

    @Bean
    @Scope("prototype")
    public Circle beanCircle(){
        Circle c = new Circle (coords,
                env.getProperty("circle.radius", Integer.class, 0));
        c.setX(env.getProperty("circle.x", Long.class, 0L));
        c.setY(env.getProperty("circle.y", Long.class, 0L));
        c.setColor(env.getProperty("circle.color", Shape.DEFAULT_COLOR));

        return c;
    }

    @Bean
    public Scene beanScene() {
        List<Shape> objects = new ArrayList<Shape>();
        int pointNums = env.getProperty("scene.points", Integer.class, 1);
        for(int i=0; i < pointNums; i++)
            objects.add(beanPoint());
        int circleNums = env.getProperty("scene.circles", Integer.class, 1);
        for(int i=0; i < circleNums; i++)
            objects.add(beanCircle());

        return new Scene(objects);
    }
}
