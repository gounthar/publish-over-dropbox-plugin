/*
 * The MIT License
 *
 * Copyright (C) 2017 by René de Groot
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.jenkinsci.plugins.publishoverdropbox.domain;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class JsonObjectRequestTest {

    @Test
    public void simpleEncode() throws Exception {
        // Arrange
        final String input = "simple";
        // Execute
        String encoded = JsonObjectRequest.httpHeaderEncode(input);
        // Assert
        assertThat(encoded, is(input));
    }

    @Test
    public void specialCharEncode() throws Exception {
        // Arrange
        final String input = "simple\u2014text";
        final String output = "simple\\u2014text";
        // Execute
        String encoded = JsonObjectRequest.httpHeaderEncode(input);
        // Assert
        assertThat(encoded, is(output));
    }


}