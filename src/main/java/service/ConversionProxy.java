package service;

public class ConversionProxy implements service.Conversion {
  private String _endpoint = null;
  private service.Conversion conversion = null;
  
  public ConversionProxy() {
    _initConversionProxy();
  }
  
  public ConversionProxy(String endpoint) {
    _endpoint = endpoint;
    _initConversionProxy();
  }
  
  private void _initConversionProxy() {
    try {
      conversion = (new service.BanqueServiceServiceLocator()).getconversionPort();
      if (conversion != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)conversion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)conversion)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (conversion != null)
      ((javax.xml.rpc.Stub)conversion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public service.Conversion getConversion() {
    if (conversion == null)
      _initConversionProxy();
    return conversion;
  }
  
  public service.Compte getcompte(java.lang.Long code) throws java.rmi.RemoteException{
    if (conversion == null)
      _initConversionProxy();
    return conversion.getcompte(code);
  }
  
  public java.lang.Double conversionEuroEnDh(double montant) throws java.rmi.RemoteException{
    if (conversion == null)
      _initConversionProxy();
    return conversion.conversionEuroEnDh(montant);
  }
  
  public service.Compte[] getComptes() throws java.rmi.RemoteException{
    if (conversion == null)
      _initConversionProxy();
    return conversion.getComptes();
  }
  
  
}