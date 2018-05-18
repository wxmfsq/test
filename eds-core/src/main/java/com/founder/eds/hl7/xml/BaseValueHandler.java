package com.founder.eds.hl7.xml;

import com.founder.eds.hl7.maphandler.XPathMapHandler;


public interface BaseValueHandler extends ValueHandler
{

    public void setXpathMapHandler(XPathMapHandler mapHandler);
}
