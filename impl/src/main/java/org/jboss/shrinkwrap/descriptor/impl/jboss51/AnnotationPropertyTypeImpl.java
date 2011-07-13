/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat Middleware LLC, and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.shrinkwrap.descriptor.impl.jboss51;

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jboss51.AnnotationPropertyType;
import org.jboss.shrinkwrap.descriptor.spi.Node;

/**
 * This class implements the <code> annotation-propertyType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * Used to set property values for annotations <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public class AnnotationPropertyTypeImpl<T> implements Child<T>, AnnotationPropertyType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;

   private Node childNode;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public AnnotationPropertyTypeImpl(T t, String nodeName, Node node)
   {
      this.t = t;
      this.childNode = node.create(nodeName);
   }

   public AnnotationPropertyTypeImpl(T t, String nodeName, Node node, Node childNode)
   {
      this.t = t;
      this.childNode = childNode;
   }

   public T up()
   {
      return t;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link AnnotationPropertyType<T>} 
    */
   public AnnotationPropertyType<T> setDescription(String description)
   {
      childNode.create("description").text(description);
      return this;
   }

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link AnnotationPropertyType<T>} 
    */
   public AnnotationPropertyType<T> setDescriptionList(String... values)
   {
      if (values != null)
      {
         for (String name : values)
         {
            setDescription(name);
         }
      }
      return this;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link AnnotationPropertyType<T>} 
    */
   public AnnotationPropertyType<T> removeAllDescription()
   {
      childNode.remove("description");
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.text());
      }
      return result;
   }

   // -------------------------------------------------------------------------------------||
   // Element type : property-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property-name</code> element with the given value will be created.
    * Otherwise, the existing <code>property-name</code> element will be updated with the given value.
    * @return the current instance of {@link AnnotationPropertyType<T>} 
    */
   public AnnotationPropertyType<T> setPropertyName(String propertyName)
   {
      childNode.getOrCreate("property-name").text(propertyName);
      return this;
   }

   /**
    * Removes the <code>property-name</code> element 
    * @return the current instance of {@link AnnotationPropertyType<T>} 
    */
   public AnnotationPropertyType<T> removePropertyName()
   {
      childNode.remove("property-name");
      return this;
   }

   /**
    * Returns the <code>property-name</code> element
    * @return the node defined for the element <code>property-name</code> 
    */
   public String getPropertyName()
   {
      return childNode.textValue("property-name");
   }

   // -------------------------------------------------------------------------------------||
   // Element type : property-value
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property-value</code> element with the given value will be created.
    * Otherwise, the existing <code>property-value</code> element will be updated with the given value.
    * @return the current instance of {@link AnnotationPropertyType<T>} 
    */
   public AnnotationPropertyType<T> setPropertyValue(String propertyValue)
   {
      childNode.getOrCreate("property-value").text(propertyValue);
      return this;
   }

   /**
    * Removes the <code>property-value</code> element 
    * @return the current instance of {@link AnnotationPropertyType<T>} 
    */
   public AnnotationPropertyType<T> removePropertyValue()
   {
      childNode.remove("property-value");
      return this;
   }

   /**
    * Returns the <code>property-value</code> element
    * @return the node defined for the element <code>property-value</code> 
    */
   public String getPropertyValue()
   {
      return childNode.textValue("property-value");
   }

}