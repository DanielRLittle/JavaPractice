package com.qa;

import org.apache.deltaspike.cdise.api.CdiContainer; 
import org.apache.deltaspike.cdise.api.CdiContainerLoader;
import javax.enterprise.inject.spi.Bean;
import javax.enterprise.inject.spi.BeanManager;
import java.util.Set;


public class Main {

    public static void main(String[] args) {

        System.out.println("\n\n>>> Executing : " + Main.class.toString() + " <<<\n");

        // this will give you a CdiContainer for Weld or OWB, depending on the jar you added
        CdiContainer cdiContainer = CdiContainerLoader.getCdiContainer();

        // now we gonna boot the CDI container. This will trigger the classpath scan, etc
        cdiContainer.boot();

        BeanManager beanManager = cdiContainer.getBeanManager();

        Set<Bean<?>> beans = beanManager.getBeans(World.class);
        Bean<?> bean = beanManager.resolve(beans);

        World world = (World) beanManager.getReference(bean, World.class, beanManager.createCreationalContext(bean));

        System.out.println("# " + world.run());

        cdiContainer.shutdown();

    }
}


