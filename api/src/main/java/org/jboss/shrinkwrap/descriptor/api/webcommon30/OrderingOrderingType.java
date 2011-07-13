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
package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> ordering-orderingType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * This element contains a sequence of "name" elements, each of <br> 
 * which <br> 
 * refers to an application configuration resource by the "name" <br> 
 * declared on its web.xml fragment. This element can also contain <br> 
 * a single "others" element which specifies that this document <br> 
 * comes <br> 
 * before or after other documents within the application. <br> 
 * See section 8.2.2 of the specification for details. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:55:02.759+02:00
 */
public interface OrderingOrderingType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : name
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>name</code> element 
    * @return the current instance of {@link OrderingOrderingType<T>} 
    */
   public OrderingOrderingType<T> setName(String name);

   /**
    * Creates for all String objects representing <code>name</code> elements, 
    * a new <code>name</code> element 
    * @param list of <code>name</code> objects 
    * @return the current instance of {@link OrderingOrderingType<T>} 
    */
   public OrderingOrderingType<T> setNameList(String... values);

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of {@link OrderingOrderingType<T>} 
    */
   public OrderingOrderingType<T> removeAllName();

   /**
    * Returns all <code>name</code> elements
    * @return list of <code>name</code> 
    */
   public List<String> getNameList();

   public OrderingOrderingType<T> others();

   public Boolean isOthers();
}