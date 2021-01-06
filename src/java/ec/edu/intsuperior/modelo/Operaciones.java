/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author SANTIAGO SOLIS
 */
@WebService(serviceName = "Operaciones")
public class Operaciones {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "suma")
    public Integer suma(@WebParam(name = "numero1") int numero1, @WebParam(name = "numero2") int numero2) {
        //TODO write your implementation code here:
        return numero1+numero2;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "factorial")
    public Integer factorial(@WebParam(name = "num") int num) {
        //TODO write your implementation code here:
      int acu=1;
        for (int i = 1; i <= num; i++) {
          acu =acu*i;  
            
        }
        return acu;
    }
    
}
