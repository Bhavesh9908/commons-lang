/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.lang3.function;

import java.util.function.BiPredicate;

/**
 * A functional interface like {@link BiPredicate} that declares a {@code Throwable}.
 *
 * @param <T> Predicate type 1.
 * @param <U> Predicate type 2.
 * @param <E> Thrown exception.
 * @since 3.11
 */
@FunctionalInterface
public interface FailableBiPredicate<T, U, E extends Throwable> {

    /**
     * Tests the predicate.
     *
     * @param object1 the first object to test the predicate on
     * @param object2 the second object to test the predicate on
     * @return the predicate's evaluation
     * @throws E if the predicate fails
     */
    boolean test(T object1, U object2) throws E;
}