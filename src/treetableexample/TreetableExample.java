/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package treetableexample;



import Entities.Department;
import Entities.Employee;
import java.util.*;
import javax.swing.*;
import org.jdesktop.swingx.JXTreeTable;
/**
 *
 * @author Usuario
 */
public class TreetableExample extends JFrame {

    private final JXTreeTable treeTable;

    public TreetableExample() {
        //sample doj
        final Date doj = Calendar.getInstance().getTime();        
        List<Department> departmentList = new ArrayList();

        //create and add the first department with its list of Employee objects
        List<Employee> empList1 = new ArrayList();
        empList1.add(new Employee(1, "Kiran", doj, "emp1.jpg"));
        empList1.add(new Employee(2, "Prabhu", doj, "emp2.jpg"));
        empList1.add(new Employee(3, "Murugavel", doj, "emp1.jpg"));        
        empList1.add(new Employee(4, "Carlos", doj, "emp2.jpg"));
        departmentList.add(new Department(1, "Sales", empList1));

        //create and add the second department with its list of Employee objects
        List<Employee> empList2 = new ArrayList();
        empList2.add(new Employee(5, "Deiveegan", doj, "emp2.jpg"));
        empList2.add(new Employee(6, "Saravanan", doj, "emp1.jpg"));
        empList2.add(new Employee(7, "Eduardo", doj, "emp3.jpg"));
        departmentList.add(new Department(2, "Production", empList2));
        
        //we use a no root model
        NoRootTreeTableModel noRootTreeTableModel = new NoRootTreeTableModel(departmentList);
        treeTable = new JXTreeTable(noRootTreeTableModel);
        treeTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);        
        treeTable.setRootVisible(false);  // hide the root

        add(new JScrollPane(treeTable));

        setTitle("JXTreeTable Example");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {        
                TreetableExample treetableExample = new TreetableExample();
            }
        });
    }
    
}
