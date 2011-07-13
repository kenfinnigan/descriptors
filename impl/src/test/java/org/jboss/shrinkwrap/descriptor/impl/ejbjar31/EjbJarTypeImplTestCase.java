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
package org.jboss.shrinkwrap.descriptor.impl.ejbjar31;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.jboss.shrinkwrap.descriptor.api.ejbjar31.EjbJarType;
import org.jboss.shrinkwrap.descriptor.gen.TestDescriptorImpl;
import org.junit.Test;

public class EjbJarTypeImplTestCase
{
   @Test
   public void testNullArg() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbJarType<TestDescriptorImpl> type = new EjbJarTypeImpl<TestDescriptorImpl>(provider, "ejb-jarType", provider
            .getRootNode());
      TestDescriptorImpl.testNullArgs(type);
   }

   @Test
   public void testDescription() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbJarType<TestDescriptorImpl> type = new EjbJarTypeImpl<TestDescriptorImpl>(provider, "ejb-jarType", provider
            .getRootNode());
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
   public void testDisplayName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbJarType<TestDescriptorImpl> type = new EjbJarTypeImpl<TestDescriptorImpl>(provider, "ejb-jarType", provider
            .getRootNode());
      type.setDisplayName("value1");
      type.setDisplayName("value2");
      type.setDisplayNameList("value3", "value4");
      assertTrue(type.getDisplayNameList().size() == 4);
      assertEquals(type.getDisplayNameList().get(0), "value1");
      assertEquals(type.getDisplayNameList().get(1), "value2");
      assertEquals(type.getDisplayNameList().get(2), "value3");
      assertEquals(type.getDisplayNameList().get(3), "value4");
      type.removeAllDisplayName();
      assertTrue(type.getDisplayNameList().size() == 0);
   }

   @Test
   public void testIcon() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbJarType<TestDescriptorImpl> type = new EjbJarTypeImpl<TestDescriptorImpl>(provider, "ejb-jarType", provider
            .getRootNode());
      type.icon().up();
      type.icon().up();
      assertTrue(type.getIconList().size() == 2);
      type.removeAllIcon();
      assertTrue(type.getIconList().size() == 0);
   }

   @Test
   public void testModuleName() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbJarType<TestDescriptorImpl> type = new EjbJarTypeImpl<TestDescriptorImpl>(provider, "ejb-jarType", provider
            .getRootNode());
      type.setModuleName("test");
      assertEquals(type.getModuleName(), "test");
      type.removeModuleName();
      assertNull(type.getModuleName());
   }

   @Test
   public void testEnterpriseBeans() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbJarType<TestDescriptorImpl> type = new EjbJarTypeImpl<TestDescriptorImpl>(provider, "ejb-jarType", provider
            .getRootNode());
      type.enterpriseBeans().up();
      type.removeEnterpriseBeans();
      assertNull(provider.getRootNode().getSingle("enterprise-beans"));
   }

   @Test
   public void testInterceptors() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbJarType<TestDescriptorImpl> type = new EjbJarTypeImpl<TestDescriptorImpl>(provider, "ejb-jarType", provider
            .getRootNode());
      type.interceptors().up();
      type.removeInterceptors();
      assertNull(provider.getRootNode().getSingle("interceptors"));
   }

   @Test
   public void testRelationships() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbJarType<TestDescriptorImpl> type = new EjbJarTypeImpl<TestDescriptorImpl>(provider, "ejb-jarType", provider
            .getRootNode());
      type.relationships().up();
      type.removeRelationships();
      assertNull(provider.getRootNode().getSingle("relationships"));
   }

   @Test
   public void testAssemblyDescriptor() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbJarType<TestDescriptorImpl> type = new EjbJarTypeImpl<TestDescriptorImpl>(provider, "ejb-jarType", provider
            .getRootNode());
      type.assemblyDescriptor().up();
      type.removeAssemblyDescriptor();
      assertNull(provider.getRootNode().getSingle("assembly-descriptor"));
   }

   @Test
   public void testEjbClientJar() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbJarType<TestDescriptorImpl> type = new EjbJarTypeImpl<TestDescriptorImpl>(provider, "ejb-jarType", provider
            .getRootNode());
      type.setEjbClientJar("test");
      assertEquals(type.getEjbClientJar(), "test");
      type.removeEjbClientJar();
      assertNull(type.getEjbClientJar());
   }

   @Test
   public void testVersion() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbJarType<TestDescriptorImpl> type = new EjbJarTypeImpl<TestDescriptorImpl>(provider, "ejb-jarType", provider
            .getRootNode());
      type.setVersion("test");
      assertEquals(type.getVersion(), "test");
      type.removeVersion();
      assertNull(type.getVersion());
   }

   @Test
   public void testMetadataComplete() throws Exception
   {
      TestDescriptorImpl provider = new TestDescriptorImpl("test");
      EjbJarType<TestDescriptorImpl> type = new EjbJarTypeImpl<TestDescriptorImpl>(provider, "ejb-jarType", provider
            .getRootNode());
      type.setMetadataComplete(true);
      assertTrue(type.isMetadataComplete());
      type.removeMetadataComplete();
      assertFalse(type.isMetadataComplete());
   }
}