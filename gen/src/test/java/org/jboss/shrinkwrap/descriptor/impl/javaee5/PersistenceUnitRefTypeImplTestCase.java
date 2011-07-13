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
package org.jboss.shrinkwrap.descriptor.impl.javaee5; 

import org.jboss.shrinkwrap.descriptor.spi.Node;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.jboss.shrinkwrap.descriptor.api.Descriptors;import org.junit.Test;
import static org.junit.Assert.*;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceUnitRefType;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.xml.dom.XmlDomExporter;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee5.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.InjectionTargetTypeImpl;

public class PersistenceUnitRefTypeImplTestCase
{   
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceUnitRefType<TestDescriptorImpl> type = new PersistenceUnitRefTypeImpl<TestDescriptorImpl>(provider, "persistence-unit-refType", provider.getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }
   
   @Test
   public void testMappedName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceUnitRefType<TestDescriptorImpl> type = new PersistenceUnitRefTypeImpl<TestDescriptorImpl>(provider, "persistence-unit-refType", provider.getRootNode());
      type.setMappedName("test");
      assertEquals(type.getMappedName(), "test");
      type.removeMappedName();
      assertNull(type.getMappedName());
   }
   
   @Test
   public void testInjectionTarget() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceUnitRefType<TestDescriptorImpl> type = new PersistenceUnitRefTypeImpl<TestDescriptorImpl>(provider, "persistence-unit-refType", provider.getRootNode());
      type.injectionTarget().up();
      type.injectionTarget().up();
      assertTrue(type.getInjectionTargetList().size() == 2);
      type.removeAllInjectionTarget();
      assertTrue(type.getInjectionTargetList().size() == 0);
   }
   
   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceUnitRefType<TestDescriptorImpl> type = new PersistenceUnitRefTypeImpl<TestDescriptorImpl>(provider, "persistence-unit-refType", provider.getRootNode());
      type.setDescription("value1");
      type.setDescription("value2");
      type.setDescriptionList("value3", "value4");
      assertTrue(type.getDescriptionList().size() == 4);
      assertEquals(type.getDescriptionList().get(0), "value1");
      assertEquals(type.getDescriptionList().get(1), "value2");
      assertEquals(type.getDescriptionList().get(2), "value3");
      assertEquals(type.getDescriptionList().get(3), "value4");
      type.removeAllDescription();
      assertTrue(type.getDescriptionList().size() == 0);
   }

   
   @Test
   public void testPersistenceUnitRefName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceUnitRefType<TestDescriptorImpl> type = new PersistenceUnitRefTypeImpl<TestDescriptorImpl>(provider, "persistence-unit-refType", provider.getRootNode());
      type.setPersistenceUnitRefName("test");
      assertEquals(type.getPersistenceUnitRefName(), "test");
      type.removePersistenceUnitRefName();
      assertNull(type.getPersistenceUnitRefName());
   }

   
   @Test
   public void testPersistenceUnitName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      PersistenceUnitRefType<TestDescriptorImpl> type = new PersistenceUnitRefTypeImpl<TestDescriptorImpl>(provider, "persistence-unit-refType", provider.getRootNode());
      type.setPersistenceUnitName("test");
      assertEquals(type.getPersistenceUnitName(), "test");
      type.removePersistenceUnitName();
      assertNull(type.getPersistenceUnitName());
   }
}