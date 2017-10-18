/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.tika.parser.iwork.iwana;

import static org.apache.tika.TikaTest.assertContains;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import org.apache.tika.metadata.Metadata;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;
import org.junit.Before;
import org.junit.Test;
import org.xml.sax.ContentHandler;

/**
 * Limited testing for the iWorks 13 format parser, which
 *  currently doesn't do anything more than detection....
 */
public class IWork13ParserTest {
    private IWork13PackageParser iWorkParser;
    private ParseContext parseContext;

    @Before
    public void setUp() {
        iWorkParser = new IWork13PackageParser();
        parseContext = new ParseContext();
        parseContext.set(Parser.class, new AutoDetectParser());
    }
    
    @Test
    public void testParseKeynote13() throws Exception {
        InputStream input = IWork13ParserTest.class.getResourceAsStream("/test-documents/testKeynote2013.key");
        Metadata metadata = new Metadata();
        ContentHandler handler = new BodyContentHandler();
        iWorkParser.parse(input, handler, metadata, parseContext);
        
        // Currently parsing is a no-op
        // TODO Test properly when a full Parser is added
        assertEquals(0, metadata.size());
        assertEquals("", handler.toString());
    }
    
    @Test
    public void testParseNumbers13() throws Exception {
        InputStream input = IWork13ParserTest.class.getResourceAsStream("/test-documents/testNumbers2013.numbers");
        Metadata metadata = new Metadata();
        ContentHandler handler = new BodyContentHandler();
        iWorkParser.parse(input, handler, metadata, parseContext);
        
        // Currently parsing is a no-op
        // TODO Test properly when a full Parser is added
        assertEquals(0, metadata.size());
        assertEquals("", handler.toString());
    }
    
    @Test
    public void testParsePages13() throws Exception {
        InputStream input = IWork13ParserTest.class.getResourceAsStream("/test-documents/testPages2013.pages");
        Metadata metadata = new Metadata();
        ContentHandler handler = new BodyContentHandler();
        iWorkParser.parse(input, handler, metadata, parseContext);
        
        // Currently parsing is a no-op
        // TODO Test properly when a full Parser is added
        assertEquals(0, metadata.size());
        assertEquals("", handler.toString());
    }
}
