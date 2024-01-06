package basic.simple;

public class DataTypeStorage {
	public static int dataTypes(String type) {
        if(type.equals("Long"))
        {
             return 8;
        }else if(type.equals("Double")){
             return 8;
        }else if(type.equals("Integer")){
             return 4;
        }else if(type.equals("Float")){
            return 4;
        }else{
             return 1;
        }    
    }
}
