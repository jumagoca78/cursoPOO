import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GridLayoutDemo extends JFrame implements ActionListener
{
    private JButton buttons[];
    private final String names[] = {"one", "two", "three", "four", "five", "six"};
    private boolean toggle = true;
    private Container container;
    private GridLayout grid1, grid2;

    // GUI set up
    public GridLayoutDemo()
    {
        super("GridLayout Demo");

        //set up layouts
        grid1 = new GridLayout(2,3,5,5); //create gridlayout with 2 rows and 3 columns
        grid2 = new GridLayout(3,2); //create gridlayout grid2 with 3 rows and 2 columns

        //get content pane and set its Layout
        container = getContentPane();
        container.setLayout(grid1);

        //create and add buttons
        buttons = new JButton[names.length];

        for (int count = 0; count < names.length; count++)
        {
            buttons[count] = new JButton(names[count]);
            buttons[count].addActionListener(this);
            container.add(buttons[count]);
        }

        setSize(300,150);
        setVisible(true);
    } //end constructor GridLayoutDemo

    //handdle button events by toggling between layouts
    public void actionPerformed(ActionEvent event)
    {
        if (toggle)
            container.setLayout(grid2); //toggle current gridlayout when the user presses JButton
        else
            container.setLayout(grid1);

        toggle = !toggle; //set toggle to opposite value
        container.validate();
    }

    public static void main(String args[])
    {
        GridLayoutDemo application = new GridLayoutDemo();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} //END CLASS GRIDLAYOUTDEMO
