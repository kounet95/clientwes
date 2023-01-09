/**
 * Compte.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public class Compte  implements java.io.Serializable {
    private java.lang.Long condeCompte;

    private double solde;

    public Compte() {
    }

    public Compte(
           java.lang.Long condeCompte,
           double solde) {
           this.condeCompte = condeCompte;
           this.solde = solde;
    }


    /**
     * Gets the condeCompte value for this Compte.
     * 
     * @return condeCompte
     */
    public java.lang.Long getCondeCompte() {
        return condeCompte;
    }


    /**
     * Sets the condeCompte value for this Compte.
     * 
     * @param condeCompte
     */
    public void setCondeCompte(java.lang.Long condeCompte) {
        this.condeCompte = condeCompte;
    }


    /**
     * Gets the solde value for this Compte.
     * 
     * @return solde
     */
    public double getSolde() {
        return solde;
    }


    /**
     * Sets the solde value for this Compte.
     * 
     * @param solde
     */
    public void setSolde(double solde) {
        this.solde = solde;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Compte)) return false;
        Compte other = (Compte) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.condeCompte==null && other.getCondeCompte()==null) || 
             (this.condeCompte!=null &&
              this.condeCompte.equals(other.getCondeCompte()))) &&
            this.solde == other.getSolde();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCondeCompte() != null) {
            _hashCode += getCondeCompte().hashCode();
        }
        _hashCode += new Double(getSolde()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Compte.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "compte"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("condeCompte");
        elemField.setXmlName(new javax.xml.namespace.QName("", "condeCompte"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("solde");
        elemField.setXmlName(new javax.xml.namespace.QName("", "solde"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
