/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.snuitr.ifeest;

import hirondelle.web4j.model.DateTime;
import javax.jws.WebService;
import javax.jws.WebMethod;

/**
 *
 * @author sander
 */
public class IfeestCalc {
    
    public IfeestCalc() {  
    }
    
    public static long IfeestDiffSeconds(IfeestTimeStamp ts1, IfeestTimeStamp ts2) {
        DateTime dt1 = new DateTime(ts1.getFeestTimeStamp());
        DateTime dt2 = new DateTime(ts2.getFeestTimeStamp());
        long diffSeconds = dt1.numSecondsFrom(dt2);
        return diffSeconds;
    }  
    public static long IfeestDiffSeconds(int y1, int m1, int d1, int y2, int m2, int d2) {
        IfeestTimeStamp ts1 = new IfeestTimeStamp(y1, m1, d1);
        IfeestTimeStamp ts2 = new IfeestTimeStamp(y2, m2, d2);
        DateTime dt1 = new DateTime(ts1.getFeestTimeStamp());
        DateTime dt2 = new DateTime(ts2.getFeestTimeStamp());
        long diffSeconds = dt1.numSecondsFrom(dt2);
        return diffSeconds;
    }
    
}
