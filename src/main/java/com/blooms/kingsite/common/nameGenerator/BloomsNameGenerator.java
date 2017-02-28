package com.blooms.kingsite.common.nameGenerator;

import java.beans.Introspector;
import java.util.Iterator;
import java.util.ServiceLoader;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;
import org.springframework.util.ClassUtils;

import com.blooms.kingsite.framework.core.exceptions.VitamineException;
import com.blooms.kingsite.framework.core.vitamine.Vitamination;

public class BloomsNameGenerator extends AnnotationBeanNameGenerator {
    private static Vitamination vitamination = null;

    static {
        ServiceLoader<Vitamination> iaction = ServiceLoader.load(Vitamination.class);
        Iterator<Vitamination> iter = iaction.iterator();
        if (iter.hasNext()) {
            vitamination = (Vitamination) iter.next();
            if (iter.hasNext()) {
                throw new VitamineException("See it in more interfaces");
            }
        } else {
            throw new VitamineException("See it in none interfaces");
        }
    }

    protected String buildDefaultBeanName(BeanDefinition definition) {
        if (vitamination.seein()) {
            String shortClassName = ClassUtils.getShortName(definition.getBeanClassName());
            return Introspector.decapitalize(shortClassName);
        } else {
            return null;
        }
    }
    
    public static void main(String[] args) {
        ServiceLoader<Vitamination> serviceLoader = ServiceLoader.load(Vitamination.class);
        for(Vitamination service : serviceLoader) {
            System.out.println(service.seein() + "=" + service.seeout());
        }

    }

}
