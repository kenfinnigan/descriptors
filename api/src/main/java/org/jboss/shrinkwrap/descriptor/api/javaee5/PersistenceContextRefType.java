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
package org.jboss.shrinkwrap.descriptor.api.javaee5;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> persistence-context-refType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 *<br>
 * The persistence-context-ref element contains a declaration <br> 
 * of Deployment Component's reference to a persistence context <br> 
 * associated within a Deployment Component's <br> 
 * environment. It consists of: <br> 
 *<br>
 * - an optional description <br> 
 * - the persistence context reference name <br> 
 * - an optional persistence unit name. If not specified, <br> 
 * the default persistence unit is assumed. <br> 
 * - an optional specification as to whether <br> 
 * the persistence context type is Transaction or <br> 
 * Extended. If not specified, Transaction is assumed. <br> 
 * - an optional list of persistence properties <br> 
 * - optional injection targets <br> 
 *<br>
 * Examples: <br> 
 *<br>
 * <persistence-context-ref> <br> 
 * <persistence-context-ref-name>myPersistenceContext <br> 
 * </persistence-context-ref-name> <br> 
 * </persistence-context-ref> <br> 
 *<br>
 * <persistence-context-ref> <br> 
 * <persistence-context-ref-name>myPersistenceContext <br> 
 * </persistence-context-ref-name> <br> 
 * <persistence-unit-name>PersistenceUnit1 <br> 
 * </persistence-unit-name> <br> 
 * <persistence-context-type>Extended</persistence-context-type> <br> 
 * </persistence-context-ref> <br> 
 *<br>
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface PersistenceContextRefType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : mapped-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapped-name</code> element with the given value will be created.
    * Otherwise, the existing <code>mapped-name</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceContextRefType<T>} 
    */
   public PersistenceContextRefType<T> setMappedName(String mappedName);

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of {@link PersistenceContextRefType<T>} 
    */
   public PersistenceContextRefType<T> removeMappedName();

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName();

   // -------------------------------------------------------------------------------------||
   // Element type : injection-target
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>injection-target</code> elements 
    * @return the current instance of {@link PersistenceContextRefType<T>} 
    */
   public PersistenceContextRefType<T> removeAllInjectionTarget();

   /**
    * Returns the <code>injection-target</code> element
    * @return the node defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<PersistenceContextRefType<T>> injectionTarget();

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<PersistenceContextRefType<T>>> getInjectionTargetList();

   // -------------------------------------------------------------------------------------||
   // Element type : description
   // isComplexType: false   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Creates a new <code>description</code> element 
    * @return the current instance of {@link PersistenceContextRefType<T>} 
    */
   public PersistenceContextRefType<T> setDescription(String description);

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param list of <code>description</code> objects 
    * @return the current instance of {@link PersistenceContextRefType<T>} 
    */
   public PersistenceContextRefType<T> setDescriptionList(String... values);

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of {@link PersistenceContextRefType<T>} 
    */
   public PersistenceContextRefType<T> removeAllDescription();

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getDescriptionList();

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-ref-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-context-ref-name</code> element with the given value will be created.
    * Otherwise, the existing <code>persistence-context-ref-name</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceContextRefType<T>} 
    */
   public PersistenceContextRefType<T> setPersistenceContextRefName(String persistenceContextRefName);

   /**
    * Removes the <code>persistence-context-ref-name</code> element 
    * @return the current instance of {@link PersistenceContextRefType<T>} 
    */
   public PersistenceContextRefType<T> removePersistenceContextRefName();

   /**
    * Returns the <code>persistence-context-ref-name</code> element
    * @return the node defined for the element <code>persistence-context-ref-name</code> 
    */
   public String getPersistenceContextRefName();

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-unit-name
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-name</code> element with the given value will be created.
    * Otherwise, the existing <code>persistence-unit-name</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceContextRefType<T>} 
    */
   public PersistenceContextRefType<T> setPersistenceUnitName(String persistenceUnitName);

   /**
    * Removes the <code>persistence-unit-name</code> element 
    * @return the current instance of {@link PersistenceContextRefType<T>} 
    */
   public PersistenceContextRefType<T> removePersistenceUnitName();

   /**
    * Returns the <code>persistence-unit-name</code> element
    * @return the node defined for the element <code>persistence-unit-name</code> 
    */
   public String getPersistenceUnitName();

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-context-type
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-context-type</code> element with the given value will be created.
    * Otherwise, the existing <code>persistence-context-type</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceContextRefType<T>} 
    */
   public PersistenceContextRefType<T> setPersistenceContextType(PersistenceContextTypeType persistenceContextType);

   /**
    * If not already created, a new <code>persistence-context-type</code> element with the given value will be created.
    * Otherwise, the existing <code>persistence-context-type</code> element will be updated with the given value.
    * @return the current instance of {@link PersistenceContextRefType<T>} 
    */
   public PersistenceContextRefType<T> setPersistenceContextType(String persistenceContextType);

   /**
    * Returns the <code>persistence-context-type</code> element
    * @return the node defined for the element <code>persistence-context-type</code> 
    */
   public PersistenceContextTypeType getPersistenceContextType();

   /**
    * Returns the <code>persistence-context-type</code> element
    * @return the node defined for the element <code>persistence-context-type</code> 
    */
   public String getPersistenceContextTypeAsString();

   // -------------------------------------------------------------------------------------||
   // Element type : persistence-property
   // isComplexType: true   maxOccurs: -unbounded   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * Removes all <code>persistence-property</code> elements 
    * @return the current instance of {@link PersistenceContextRefType<T>} 
    */
   public PersistenceContextRefType<T> removeAllPersistenceProperty();

   /**
    * Returns the <code>persistence-property</code> element
    * @return the node defined for the element <code>persistence-property</code> 
    */
   public PropertyType<PersistenceContextRefType<T>> persistenceProperty();

   /**
    * Returns all <code>persistence-property</code> elements
    * @return list of <code>persistence-property</code> 
    */
   public List<PropertyType<PersistenceContextRefType<T>>> getPersistencePropertyList();

}