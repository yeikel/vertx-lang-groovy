/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.groovy.core;
import groovy.transform.CompileStatic
import io.vertx.lang.groovy.InternalHelper
import java.util.List
import java.util.Map.Entry
import java.util.Set
/**
 * @author <a href="mailto:nmaurer@redhat.com">Norman Maurer</a>
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@CompileStatic
public class MultiMap {
  final def io.vertx.core.MultiMap delegate;
  public MultiMap(io.vertx.core.MultiMap delegate) {
    this.delegate = delegate;
  }
  public Object getDelegate() {
    return delegate;
  }
  /**
   * Returns the value of with the specified name.  If there are
   * more than one values for the specified name, the first value is returned.
   *
   * @param name The name of the header to search
   * @return The first header value or {@code null} if there is no such entry
   */
  public String get(String name) {
    def ret = this.delegate.get(name);
    return ret;
  }
  /**
   * Returns the values with the specified name
   *
   * @param name The name to search
   * @return A immutable {@link List} of values which will be empty if no values
   *         are found
   */
  public List<String> getAll(String name) {
    def ret = this.delegate.getAll(name);
    return ret;
  }
  /**
   * Checks to see if there is a value with the specified name
   *
   * @param name The name to search for
   * @return True if at least one entry is found
   */
  public boolean contains(String name) {
    def ret = this.delegate.contains(name);
    return ret;
  }
  /**
   * Return true if empty
   */
  public boolean isEmpty() {
    def ret = this.delegate.isEmpty();
    return ret;
  }
  /**
   * Gets a immutable {@link Set} of all names
   *
   * @return A {@link Set} of all names
   */
  public Set<String> names() {
    def ret = this.delegate.names();
    return ret;
  }
  /**
   * Adds a new value with the specified name and value.
   *
   *
   * @param name The name
   * @param value The value being added
   *
   * @return {@code this}
   */
  public MultiMap add(String name, String value) {
    this.delegate.add(name, value);
    return this;
  }
  /**
   * Adds all the entries from another MultiMap to this one
   *
   * @return {@code this}
   */
  public MultiMap addAll(MultiMap map) {
    this.delegate.addAll((io.vertx.core.MultiMap)map.getDelegate());
    return this;
  }
  /**
   * Sets a value under the specified name.
   *
   * If there is an existing header with the same name, it is removed.
   *
   * @param name The name
   * @param value The value
   * @return {@code this}
   */
  public MultiMap set(String name, String value) {
    this.delegate.set(name, value);
    return this;
  }
  /**
   * Cleans this instance.
   *
   * @return {@code this}
   */
  public MultiMap setAll(MultiMap map) {
    this.delegate.setAll((io.vertx.core.MultiMap)map.getDelegate());
    return this;
  }
  /**
   * Removes the value with the given name
   *
   * @param name The name  of the value to remove
   * @return {@code this}
   */
  public MultiMap remove(String name) {
    this.delegate.remove(name);
    return this;
  }
  /**
   * Removes all
   *
   * @return {@code this}
   */
  public MultiMap clear() {
    this.delegate.clear();
    return this;
  }
  /**
   * Return the number of names.
   */
  public int size() {
    def ret = this.delegate.size();
    return ret;
  }

  static final java.util.function.Function<io.vertx.core.MultiMap, MultiMap> FACTORY = io.vertx.lang.groovy.Factories.createFactory() {
    io.vertx.core.MultiMap arg -> new MultiMap(arg);
  };
}