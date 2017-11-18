import com.github.stoton.factory.AbstractShape;
import com.github.stoton.factory.Circle;
import com.github.stoton.factory.ShapeFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ShapeFactoryTest {

    private ShapeFactory shapeFactory;


    @Before
    public void init() {
        shapeFactory = new ShapeFactory();
    }

    @Test
    public void shapeFactoryReturnACircle() {
        AbstractShape shape = shapeFactory.getShape("circle");
        Circle circle = new Circle();


        // how can I test it?
    }


}
