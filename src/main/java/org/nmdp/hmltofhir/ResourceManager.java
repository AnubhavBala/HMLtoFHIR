package org.nmdp.hmltofhir;

public class ResourceManager {
    public ResourceManager(String xml)
    {
        XMLParse parse= new XMLParse(xml);
        parse.grab();
    }
	
	public static void addResource(String resource,String strucutre, String value) {
        String [] sequence= new String[20];
        //Rinse and repeat for all resources
        
		/*create resources
		 * another template
		 * schema example
		 * <resourceName>
		 * structureName=something
		 * position=0
		 * </resourceName>
		 * if else with resource if(resource.equals(resoucename)
		 * { 
		 * 	i.e 
		 * 	getelementbytagID(resourcename);
		 * for nodelist
		 * {
		 * if(structname.equals(XMLParser.getAttribute(newtemplate,"structureName")
		 * {
		 * resourcearray[Integer.parseInt(XMLParser.getAttribute(newtemplate,"postion"))]=isNotNull(value);
		 * }
		 * }
		 */
		
	}
    // Checks if string is null if so
	public static String isNotNull(String value)
	{
		return (value==null)|| (value.equals(""))? null: value;
	}
    /* ToDo:
     All resource string arrays
     create  the position template (or or just add on to the resource template
     Follow above 
     String to primative data types methods*/
}
