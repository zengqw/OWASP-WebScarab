/*
 * Parameter.java
 *
 * Created on 23 February 2005, 08:24
 */

package org.owasp.webscarab.plugin.fuzz;

/**
 *
 * @author  rogan
 */
public class Parameter {
    
    String _location;
    String _name;
    String _type;
    
    /** Creates a new instance of Parameter */
    public Parameter(String location, String name, String type) {
        _location = location;
        _name = name;
        _type = type;
    }
    
    public String getLocation() {
        return _location;
    }
    
    public String getName() {
        return _name;
    }
    
    public String getType() {
        return _type;
    }
    
    public String toString() {
        return _location + ":" + _name + "(" + _type +")";
    }
    
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Parameter)) return false;
        Parameter that = (Parameter) obj;
        return (_location.equals(that._location) && _name.equals(that._name) && _type.equals(that._type));
    }
    
}