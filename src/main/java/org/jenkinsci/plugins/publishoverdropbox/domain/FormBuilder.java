/*
 * The MIT License
 *
 * Copyright (C) 2015 by René de Groot
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

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.List;

public class FormBuilder {

    public static final String CONTENT_TYPE = "application/x-www-form-urlencoded";
    private static final String AND = "&";
    private static final String UTF_8 = "UTF-8";
    private static final String EQUALS = "=";
    private List<String> parameters = new LinkedList<String>();

    public FormBuilder appendQueryParameter(String key, String value) {
        parameters.add(key);
        parameters.add(value);

        return this;
    }

    public String build() throws UnsupportedEncodingException {
        StringBuilder query = new StringBuilder();
        for (int i = 0; i < parameters.size(); i = i + 2) {
            append(query, parameters.get(i), parameters.get(i + 1));
        }

        return query.toString();
    }

    private void append(StringBuilder query, String key, String value) throws UnsupportedEncodingException {
        if (query.length() > 0) {
            query.append(AND);
        }
        query.append(URLEncoder.encode(key, UTF_8));
        query.append(EQUALS);
        query.append(URLEncoder.encode(value, UTF_8));
    }
}