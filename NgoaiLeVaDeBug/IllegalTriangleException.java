/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trainning.NgoaiLeVaDeBug;

/**
 *
 * @author Tam Nguyen
 */
public class IllegalTriangleException extends Exception{
    String errorMessage;

    public IllegalTriangleException(String inErrorMessage) {
        super(inErrorMessage);
        this.errorMessage = inErrorMessage;
    }

    public String getString(){
        return errorMessage;
    }
}
