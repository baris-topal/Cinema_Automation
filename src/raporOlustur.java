import java.io.File;
import javax.swing.*;
import javax.swing.table.*;
import jxl.*;
import jxl.write.*;
import java.lang.Object.*;
import jxl.Workbook;
public class raporOlustur {
void fillData(JTable table, File file)
 {
 
try
 {
 
WritableWorkbook calismakitabi1 = Workbook.createWorkbook(file);
 WritableSheet yaprak1 = calismakitabi1.createSheet("İlk Sayfa", 0);
 TableModel model = table.getModel();
 
for (int i = 0; i < model.getColumnCount(); i++)
 {
 Label column = new Label(i, 0, model.getColumnName(i));
 yaprak1.addCell(column);
 }
 int j = 0;
 for (int i = 0; i < model.getRowCount(); i++)
 {
 for (j = 0; j < model.getColumnCount(); j++)
 {
 Label row = new Label(j, i + 1, model.getValueAt(i, j).toString());
 yaprak1.addCell(row);
 }
 }
 calismakitabi1.write();
 calismakitabi1.close();
 }
 catch (Exception ex)
 {
 ex.printStackTrace();
 }
 }
 
}