package com.revature;

import com.revature.entity.HelloWorld;
import com.revature.entity.ListBean;
import com.revature.entity.Pokemon;
import com.revature.entity.Trainer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Pokemon pokemon = new Pokemon();
//        pokemon = new Pokemon("Pikachu", "Pika","Electric", "Mouse", 20);
//        pokemon.setLevel(21);
//        System.out.println(pokemon);

        // Use the beans.xml file to create some beans, setting up a bean factory to create beans
        BeanFactory factoryXml = new ClassPathXmlApplicationContext("beans.xml"); // we pass in the file that we're using as our config data

        ApplicationContext contextXml = new ClassPathXmlApplicationContext("beans.xml");

        // getBean returns an object so we need to cast it a HelloWorld object
        HelloWorld helloWorldBean = (HelloWorld) factoryXml.getBean("helloWorld1");
        HelloWorld helloWorldBean2 = (HelloWorld) factoryXml.getBean("helloWorld1");

        System.out.println(helloWorldBean);

        helloWorldBean.setMessage("New message");

        // we see the change reflected in the both beans even though we only changed 1
        // Singleton scope means we only have 1 instance per that one bean definition
        // if we add scope="prototype", it will allow us to change one bean instance without affecting the other:
        System.out.println(helloWorldBean);
        System.out.println(helloWorldBean2);

        // but we can still use HelloWorld as a normal POJO
        // The reason we use Spring is for working with enterprise apps with a lot of objects and dependencies
//        HelloWorld helloWorld = new HelloWorld("Hello");
//        System.out.println(helloWorld);


        // property based-injection:
        HelloWorld helloWorldBean3 = (HelloWorld) factoryXml.getBean("helloWorld3");
        System.out.println(helloWorldBean3);


        // More complex beans
        Pokemon pokemon1 = (Pokemon) factoryXml.getBean("Pokemon1");
        Pokemon pokemon2 = (Pokemon) factoryXml.getBean("Pokemon2");
        System.out.println(pokemon1);
        System.out.println(pokemon2);

        Trainer trainer1 = (Trainer) factoryXml.getBean("Trainer1");
        System.out.println(trainer1);


        ListBean listBean1 = (ListBean) factoryXml.getBean("list1");
        System.out.println(listBean1);


        }
}
