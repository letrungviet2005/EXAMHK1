package Interface1;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class QuantityCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        int quantity = Integer.parseInt(value.toString());
        
        if (quantity < 10) {
            cell.setForeground(Color.RED);
        } else if (quantity >= 10 && quantity <= 30) {
            cell.setForeground(new Color(255, 0, 0));
        } else {
            cell.setForeground(Color.GREEN);
        }
        
        return cell;
    }
}
