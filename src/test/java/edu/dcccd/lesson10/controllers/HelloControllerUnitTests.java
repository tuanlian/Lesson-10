package edu.dcccd.lesson10.controllers;

import org.junit.Test;
import org.springframework.ui.Model;
import org.springframework.validation.support.BindingAwareModelMap;
import static org.junit.Assert.*;

public class HelloControllerUnitTests {
    @Test
    public void testSayHello() {
        HelloController controller = new HelloController();
        Model model = new BindingAwareModelMap();
        String result = controller.sayHello("World", model);
        assertEquals("World", model.asMap().get("user"));
        assertEquals("hello", result);
    }
}