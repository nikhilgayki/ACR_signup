package commonMethods;

public class PropertyFileReader{
	
	ConfigurationManager config = new ConfigurationManager();
	
	public String getUrl(){
		return config.read_ConfigurationFile("URL");
	}
	
	public String getBrowserName(){
		return config.read_ConfigurationFile("BROWSER");
	}
	
	public String getDataProvider(){
		return config.read_ConfigurationFile("DATAPROVIDER");
	}
	
}
