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
package org.jboss.shrinkwrap.descriptor.api.ejbjar30;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * This interface defines the contract for the <code> application-exceptionType </code> xsd type 
 * <p> 
 * Original Documentation:
 * <p> 
 *<br>
 *<br>
 * The application-exceptionType declares an application <br> 
 * exception. The declaration consists of: <br> 
 *<br>
 * - the exception class. When the container receives <br> 
 * an exception of this type, it is required to <br> 
 * forward this exception as an applcation exception <br> 
 * to the client regardless of whether it is a checked <br> 
 * or unchecked exception. <br> 
 * - an optional rollback element. If this element is <br> 
 * set to true, the container must rollback the current <br> 
 * transaction before forwarding the exception to the <br> 
 * client. If not specified, it defaults to false. <br> 
 *<br>
 *<br>
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @since Generation date :2011-07-19T22:54:35.59+02:00
 */
public interface ApplicationExceptionType<T> extends Child<T>
{

   // -------------------------------------------------------------------------------------||
   // Element type : exception-class
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>exception-class</code> element with the given value will be created.
    * Otherwise, the existing <code>exception-class</code> element will be updated with the given value.
    * @return the current instance of {@link ApplicationExceptionType<T>} 
    */
   public ApplicationExceptionType<T> setExceptionClass(String exceptionClass);

   /**
    * Removes the <code>exception-class</code> element 
    * @return the current instance of {@link ApplicationExceptionType<T>} 
    */
   public ApplicationExceptionType<T> removeExceptionClass();

   /**
    * Returns the <code>exception-class</code> element
    * @return the node defined for the element <code>exception-class</code> 
    */
   public String getExceptionClass();

   // -------------------------------------------------------------------------------------||
   // Element type : rollback
   // isComplexType: false   maxOccurs: -   isAttribute: false
   // -------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>rollback</code> element with the given value will be created.
    * Otherwise, the existing <code>rollback</code> element will be updated with the given value.
    * @return the current instance of {@link ApplicationExceptionType<T>} 
    */
   public ApplicationExceptionType<T> setRollback(Boolean rollback);

   /**
    * Removes the <code>rollback</code> element 
    * @return the current instance of {@link ApplicationExceptionType<T>} 
    */
   public ApplicationExceptionType<T> removeRollback();

   /**
    * Returns the <code>rollback</code> element
    * @return the node defined for the element <code>rollback</code> 
    */
   public Boolean isRollback();

}