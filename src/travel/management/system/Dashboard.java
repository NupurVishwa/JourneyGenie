package travel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dashboard extends JFrame
{
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
String username;
Dashboard(){
setExtendedState(JFrame.MAXIMIZED_BOTH);
JPanel p1 = new JPanel();
p1.setLayout(null);
p1.setBounds(0,0,1950,65);
p1.setBackground(new Color(0,0,102));
add(p1);

ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/dashboard.jpg"));
Image i5 =i4.getImage().getScaledInstance(150,100,Image.SCALE_DEFAULT);
ImageIcon i6= new ImageIcon(i5);
JLabel l2 = new JLabel(i6);
l2.setBounds(10,10,40,40);
p1.add(l2);
    int JLabel = 0;

JLabel l3 = new JLabel("Dashboard");
l3.setFont(new Font("Tahoma",Font.BOLD, 30));
l3.setForeground(Color.WHITE);
l3.setBounds(80,10,300,40);
p1.add(l3);


JPanel p2 = new JPanel();
p2.setLayout(null);
p2.setBounds(0,65,300,1000);
p2.setBackground(new Color(0,0,102));
add(p2);

b1 = new JButton("MY PERSONAL DETAILS");
b1.setBackground(new Color(0,0,102));
b1.setFont(new Font("Tahoma" , Font.PLAIN, 20));
b1.setForeground(Color.WHITE);
b1.setMargin(new Insets(0,0,0,130));
b1.setBounds(0,0,300,50);
b1.addActionListener((java.awt.event.ActionEvent evt) -> {
    try {
        b1ActionPerformed(evt);
    } catch (Exception ex) {
        Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
    }
});
p2.add(b1);

b2 = new JButton("UPDATE PERSONAL DETAILS");
b2.setBackground(new Color(0,0,102));
b2.setFont(new Font("Tahoma" , Font.PLAIN, 20));
b2.setForeground(Color.WHITE);
b2.setMargin(new Insets(0,0,0,130));
b2.setBounds(0,50,300,50);
b2.addActionListener((java.awt.event.ActionEvent evt) -> {
    try {
        b2ActionPerformed(evt);
    } catch (Exception ex) {
        Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
    }
});
p2.add(b2);

JButton b3 = new JButton("VIEW DETAILS");
b3.setBackground(new Color(0,0,102));
b3.setFont(new Font("Tahoma" , Font.PLAIN, 20));
b3.setForeground(Color.WHITE);
b3.setMargin(new Insets(0,0,0,130));
b3.setBounds(0,100,300,50);
b3.addActionListener((java.awt.event.ActionEvent evt) -> {
    try {
        b3ActionPerformed(evt);
   
    } catch (Exception ex) {
        Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
    }
});
p2.add(b3);

JButton b4 = new JButton("DELETE PERSONAL DETAILS");
b4.setBackground(new Color(0,0,102));
b4.setFont(new Font("Tahoma" , Font.PLAIN, 20));
b4.setForeground(Color.WHITE);
b4.setMargin(new Insets(0,0,0,30));
b4.setBounds(0,150,300,50);
b4.addActionListener((java.awt.event.ActionEvent evt) -> {
    try {
        b4ActionPerformed(evt);
    } 
     catch (Exception ex) {
        Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
    }
});
p2.add(b4);

JButton b5 = new JButton("CHECK PACKAGE");
b5.setBackground(new Color(0,0,102));
b5.setFont(new Font("Tahoma" , Font.PLAIN, 20));
b5.setForeground(Color.WHITE);
b5.setMargin(new Insets(0,0,0,110));
b5.setBounds(0,200,300,50);
b5.addActionListener((java.awt.event.ActionEvent evt) -> {
    b5ActionPerformed(evt);
});
p2.add(b5);

JButton b6 = new JButton("BOOK PACKAGE");
b6.setBackground(new Color(0,0,102));
b6.setFont(new Font("Tahoma" , Font.PLAIN, 20));
b6.setForeground(Color.WHITE);
b6.setMargin(new Insets(0,0,0,115));
b6.setBounds(0,250,300,50);
b6.addActionListener((java.awt.event.ActionEvent evt) -> {
    try {
        b6ActionPerformed(evt);
    } catch (Exception ex) {
        Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
    }
});
p2.add(b6);

JButton b7 = new JButton("VIEW PACKAGE");
b7.setBackground(new Color(0,0,102));
b7.setFont(new Font("Tahoma" , Font.PLAIN, 20));
b7.setForeground(Color.WHITE);
b7.setMargin(new Insets(0,0,0,120));
b7.setBounds(0,300,300,50);
b7.addActionListener((java.awt.event.ActionEvent evt) -> {
    try {
        b7ActionPerformed(evt);
    } catch (Exception ex) {
        Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
    }
});
p2.add(b7);

JButton b8 = new JButton("VIEW HOTELS");
b8.setBackground(new Color(0,0,102));
b8.setMargin(new Insets(0,0,0,130));
b8.setFont(new Font("Tahoma" , Font.PLAIN, 20));
b8.setForeground(Color.WHITE);
b8.setBounds(0,350,300,50);
b8.addActionListener((java.awt.event.ActionEvent evt) -> {
    b8ActionPerformed(evt);
});
p2.add(b8);

JButton b9 = new JButton("BOOK HOTEL");
b9.setBackground(new Color(0,0,102));
b9.setMargin(new Insets(0,0,0,140));
b9.setFont(new Font("Tahoma" , Font.PLAIN, 20));
b9.setForeground(Color.WHITE);
b9.setBounds(0,400,300,50);
b9.addActionListener((java.awt.event.ActionEvent evt) -> {
    try {
        b9ActionPerformed(evt);
    } catch (Exception ex) {
        Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
    }
});
p2.add(b9);

JButton b10 = new JButton("VIEW BOOKED HOTEL");
b10.setBackground(new Color(0,0,102));
b10.setMargin(new Insets(0,0,0,70));
b10.setFont(new Font("Tahoma" , Font.PLAIN, 20));
b10.setForeground(Color.WHITE);
b10.setBounds(0,450,300,50);
b10.addActionListener((java.awt.event.ActionEvent evt) -> {
    try {
        b10ActionPerformed(evt);
    } catch (Exception ex) {
        Logger.getLogger(Dashboard.class.getName()).log(Level.SEVERE, null, ex);
    }
});
p2.add(b10);

JButton b11 = new JButton("DESTINATIONS");
b11.setBackground(new Color(0,0,102));
b11.setMargin(new Insets(0,0,0,125));
b11.setFont(new Font("Tahoma" , Font.PLAIN, 20));
b11.setForeground(Color.WHITE);
b11.setBounds(0,500,300,50);
b11.addActionListener((java.awt.event.ActionEvent evt) -> {
    b11ActionPerformed(evt);
});
p2.add(b11);

b12 = new JButton("PAYMENT");
b12.setBackground(new Color(0,0,155));
b12.setFont(new Font("Tahoma" , Font.PLAIN, 20));
b12.setForeground(Color.WHITE);
b12.setMargin(new Insets(0,0,0,60));
b12.setBounds(0,550,300,50);
b12.addActionListener((java.awt.event.ActionEvent evt) -> {
    b12ActionPerformed(evt);
});
p2.add(b12);

b13 = new JButton("CALCULATOR");
b13.setBackground(new Color(0,0,102));
b1.setMargin(new Insets(0,0,0,145));
b13.setFont(new Font("Tahoma" , Font.PLAIN, 20));
b13.setForeground(Color.WHITE);
b13.setMargin(new Insets(0,0,0,60));
b13.setBounds(0,600,300,50);
b13.addActionListener((java.awt.event.ActionEvent evt) -> {
    b13ActionPerformed(evt);
});
p2.add(b13);

b14 = new JButton("NOTEPAD");
b14.setBackground(new Color(0,0,102));
b14.setMargin(new Insets(0,0,0,155));
b14.setFont(new Font("Tahoma" , Font.PLAIN, 20));
b14.setForeground(Color.WHITE);
b14.setBounds(0,650,300,50);
b14.addActionListener((java.awt.event.ActionEvent evt) -> {
    b14ActionPerformed(evt);
});
p2.add(b14);

JButton b15 = new JButton("ABOUT");
b15.setBackground(new Color(0,0,102));
b15.setMargin(new Insets(0,0,0,175));
b15.setFont(new Font("Tahoma" , Font.PLAIN, 20));
b15.setForeground(Color.WHITE);
b15.setBounds(0,700,300,50);
b15.addActionListener((java.awt.event.ActionEvent evt) -> {
    b15ActionPerformed(evt);
});
p2.add(b15);



ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("travel/management/system/icons/home.jpg"));
Image i2 =i1.getImage().getScaledInstance(1950,1000,Image.SCALE_DEFAULT);
ImageIcon i3= new ImageIcon(i2);
JLabel l1 = new JLabel(i3);
l1.setBounds(0,0,1950,1000);
add(l1);

JLabel l4 = new JLabel("TRAVEL AND TOURISM MANAGEMENT SYSTEM");
l4.setBounds(600,150,1000,70);
l4.setFont(new Font("Tahoma", Font.PLAIN,55));
l1.add(l4);
}
 
private void b1ActionPerformed(java.awt.event.ActionEvent evt)throws Exception  {                                         
       AddCustomer ac=new AddCustomer("");
       ac.setVisible(true);
  
    }  

private void b2ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {                                         
       UpdateCustomer uc=new UpdateCustomer("");
       uc.setVisible(true);
}  

private void b3ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {                                         
       ViewCustomers ab=new ViewCustomers();
       ab.setVisible(true);
}  
private void b4ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {                                         
       DeleteCustomer ab=new DeleteCustomer();
       ab.setVisible(true);
} 
private void b5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      CheckPackage cp=new CheckPackage();
       cp.setVisible(true);
}
private void b6ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {                                         
       BookPackage bp=new BookPackage("");
       bp.setVisible(true);
      
    }  
private void b7ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {                                         
       ViewPackage vp=new ViewPackage();
       vp.setVisible(true);
     
    }  
private void b8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       CheckHotels ch=new CheckHotels();
       ch.setVisible(true);
       
    }  
private void b9ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {                                         
       BookHotel bh=new BookHotel();
       bh.setVisible(true);
       
    }  
private void b10ActionPerformed(java.awt.event.ActionEvent evt) throws Exception {                                         
       ViewBookedHotel vbh =new ViewBookedHotel();
       vbh.setVisible(true);
      
    }  
private void b11ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Destination d =new Destination();
       d.setVisible(true);
      
    } 
private void b12ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       Payment py =new Payment();
       py.setVisible(true);
       
    }  
private void b15ActionPerformed(java.awt.event.ActionEvent evt) {                                         
       About ab =new About();
       ab.setVisible(true);
       
    }  

private void b13ActionPerformed(java.awt.event.ActionEvent evt) {                                         
         Runtime rs= Runtime.getRuntime();
    try{
             rs.exec("calc.exe");
         }
         catch(Exception e){}
    
 }
   
private void b14ActionPerformed(java.awt.event.ActionEvent evt) {                                         
      Runtime rs= Runtime.getRuntime();
    try{
             rs.exec("notepad.exe");
         }
         catch(Exception e){}
    
 }
      public static void main(String[] args)
    {   
        new Dashboard().setVisible(true);
        
    }
}