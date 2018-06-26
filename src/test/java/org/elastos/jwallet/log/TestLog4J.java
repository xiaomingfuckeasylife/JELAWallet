/**
 * Copyright (c) 2017-2018 The JELAWallet Developers
 * <p>
 * Distributed under the MIT software license, see the accompanying file
 * LICENSE or https://opensource.org/licenses/mit-license.php
 */
package org.elastos.jwallet.log;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *
 * clark
 *
 * 6/26/18
 *
 */
public class TestLog4J {

    private Logger logger = LoggerFactory.getLogger(TestLog4J.class);

    @Test
    public void testLog4J(){
        logger.info("hey log4j");
    }
}
