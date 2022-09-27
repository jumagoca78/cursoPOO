// Fig. 13.15: MultipleSelectionTest.java
// Copying items from one List to another.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class MultipleSelectionTest extends JFrame {
    private JList colorList, copyList;
    private JButton copyButton;
    private final String colorNames[] = { "Black", "Blue", "Cyan", 
"Dark Gray", "Gray", "Green", "Light Gray", "Magenta", "Orange", 
"Pink", "Red", "White", "Yellow" };
    public MultipleSelectionTest(){
        super( "Multiple Selection Lists" );
        Container container = getContentPane();
        container.setLayout(new FlowLayout());    
        colorList = new JList( colorNames );
        colorList.setVisibleRowCount( 5 );
        colorList.setSelectionMode(
                ListSelectionModel.MULTIPLE_INTERVAL_SELECTION );
        container.add( new JScrollPane( colorList ) );
        copyButton = new JButton( "Copy >>>" );
        copyButton.addActionListener(
                new ActionListener() { 
                    public void actionPerformed( ActionEvent event ){
                            copyList.setListData( colorList.getSelectedValues() );
                }
                }
);
container.add( copyButton );
copyList = new JList();
copyList.setVisibleRowCount( 5 );
copyList.setFixedCellWidth( 100 );
copyList.setFixedCellHeight( 15 );
copyList.setSelectionMode(                        
ListSelectionModel.SINGLE_INTERVAL_SELECTION );
container.add( new JScrollPane( copyList ) );
setSize( 300, 130 );
setVisible( true );
} // end constructor MultipleSelectionTest

public static void main(String args[])
{ 
MultipleSelectionTest application = new MultipleSelectionTest();
application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
}
}
