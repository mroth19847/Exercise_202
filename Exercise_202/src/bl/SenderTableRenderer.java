package bl;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

public class SenderTableRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Sender s = (Sender) value;
        JLabel l = new JLabel();
        l.setOpaque(true);
        l.setForeground(Color.lightGray);
        if(s.getBand().equals("FM")){
            l.setBackground(Color.red);
        } else {
            l.setBackground(Color.blue);
        } if(hasFocus){
            l.setForeground(Color.white);
            l.setBackground(Color.black);
        }
        l.setFont(new Font("Arial",Font.BOLD+Font.ITALIC,14));
        l.setHorizontalAlignment(SwingConstants.CENTER);
        switch (column) {
            case 0:
                l.setText(s.getSender());
                break;
            case 1:
                l.setText(String.format("%.2f",s.getFrequence()));
                break;
            case 2:
                l.setText(s.getBand());
                break;
        }
        return l;
    }

}
