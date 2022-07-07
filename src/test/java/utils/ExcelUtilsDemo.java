package utils;

public class ExcelUtilsDemo {
	
	public static void main(String args[]){
		
		String projPath = System.getProperty("user.dir");
		ExcelUtils excel = new ExcelUtils(projPath + "/excel/data.xlsx", "Sheet1");
		
		excel.getRowCount();
		excel.getCellDataString(0,0);
		excel.getCellDataNumber(1,1);
	}

}
