/*
 * Copyright (c) 2015 Konstantin Lepa <konstantin+ukase@lepabox.net>
 *
 * This file is part of Handlebars Helpers.
 *
 * Ukase is free software: you can redistribute it and/or modify
 * it under the terms of the Apache License 2 as
 * published by the Free Software Foundation, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Apache License 2 for more details.
 *
 * You should have received a copy of the Apache License 2
 * along with this program. If not, see <http://www.apache.org/licenses/>.
 */

package com.github.ukase.helpers;

import com.github.jknack.handlebars.Helper;
import com.github.jknack.handlebars.Options;
import org.junit.Test;

import static org.junit.Assert.*;

public class EqualsHelperTest extends HelperTest {
    private static final Helper<Object> HELPER = new EqualsHelper();

    public EqualsHelperTest() {
        super(HELPER);
    }

    @Test
    public void testEquals() throws Exception {
        Object context = "testString";

        Options options = getOptions(context, "testString");

        assertEquals("Wrong render", FN_TEXT, getResult(context, options));
    }

    @Test
    public void testNotEquals() throws Exception {
        Object context = "testString";

        Options options = getOptions(context, "notTestString");

        assertEquals("Wrong render", INVERSE_TEXT, getResult(context, options));
    }

    @Test
    public void testNulls() throws Exception {
        Options options = getOptions(null, "someValue");

        assertEquals("Wrong render", INVERSE_TEXT, getResult(null, options));
    }

}