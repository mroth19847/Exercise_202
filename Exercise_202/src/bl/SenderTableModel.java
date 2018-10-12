package bl;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class SenderTableModel extends AbstractTableModel{

    private static String[] colNames = {"Sender","Frequenz","Band"};
    private ArrayList<Sender> sender = new ArrayList<>();
    
    
    public void add(Sender s) {
        sender.add(s);
        fireTableDataChanged();
    }
    
    public void hide() {
        colNames = new String[]{"Sender","Frequenz"};
        fireTableStructureChanged();
    }
    
    public void show() {
        colNames = new String[]{"Sender","Frequenz","Band"};
        fireTableStructureChanged();
    }
    
    @Override
    public int getRowCount() {
        return sender.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }
    
    @Override
    public String getColumnName(int i) {
        return colNames[i];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return sender.get(rowIndex);
    }
    
}
