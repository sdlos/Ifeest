/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.snuitr.ifeest;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author sander
 */
@WebService(serviceName = "IfeestWSDiffInSec")
@Stateless()
public class IfeestWSDiffInSec {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Diff")
    public long Diff(@WebParam(name = "y1") int y1,
            @WebParam(name = "m1") int m1, @WebParam(name = "d1") int d1,
            @WebParam(name = "y2") int y2, @WebParam(name = "m2") int m2,
            @WebParam(name = "d2") int d2) {

        return IfeestCalc.IfeestDiffSeconds(y1, m1, d1, y2, m2, d2);
    }
}
