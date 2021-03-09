
import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class PoiReadDemo {

    //1.提供一个api
    public static void main(String[] args) throws Exception {
        //获取工作pu
        XSSFWorkbook workbook = new XSSFWorkbook("D:\\JAVA_Application\\Demo01\\Excel\\src\\main\\java\\b1.xlsx");
        //获取工作表
        XSSFSheet sheet = workbook.getSheetAt(0);
        //3.获取行
//        for (Row row : sheet) {
//            for (Cell cell : row) {
//                String value = cell.getStringCellValue();
//                System.out.println(value);
//            }
//        }
        int lastRownum = sheet.getLastRowNum();

        for (int i = 0; i <= lastRownum; i++) {
            XSSFRow row = sheet.getRow(i);
            if (row != null) {
                short celNum = row.getLastCellNum();
//                for (int j = 0; j < celNum; j++) {
//                    XSSFCell cell = row.getCell(j);
//                    if (cell != null) {
//                        String str = cell.getStringCellValue();
//                        System.out.println(str);
//                    } }
//                    XSSFCell cell0 = row.getCell(0);
                XSSFCell cell1 = row.getCell(1);
                XSSFCell cell2 = row.getCell(2);
                String str1, str2, str3 ;
                str1 = cell1.toString();
                str2 = cell2.toString();
                str3=str2.substring(str2.indexOf('/'),str2.indexOf('周'));
                System.out.println(" " + str1 + " " + str2);
            }
        }
        workbook.close();
    }
}
