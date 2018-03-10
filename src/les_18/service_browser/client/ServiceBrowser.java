package les_18.service_browser.client;

import les_18.service_browser.Service;
import les_18.service_browser.ServiceServer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;

public class ServiceBrowser {
    JPanel mainPanel;
    JComboBox serviceList;
    ServiceServer server;
    public void buildGUI(){
        JFrame frame = new JFrame("RMI Browser");
        mainPanel = new JPanel();
        frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
        Object[] services = getServiceList();
        serviceList = new JComboBox(services);
        frame.getContentPane().add(BorderLayout.NORTH, serviceList);
        serviceList.addActionListener(new MyListListener());
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    void loadService(Object serviseSelection){
        try{
            Service svc = server.getService(serviseSelection);
            mainPanel.removeAll();
            mainPanel.add(svc.getGUIPanel());
            mainPanel.validate();
            mainPanel.repaint();
        }catch(Exception ex){ex.printStackTrace();}
    }
    Object[] getServiceList(){
        Object obj = null;
        Object[] services = null;
        try{
            obj = Naming.lookup("rmi://127.0.0.1/ServiceServer");
        }catch(Exception ex){ex.printStackTrace();}
        server = (ServiceServer)obj;
        try{
            services = server.getServiceList();
        }catch(Exception ex){ex.printStackTrace();}
        return services;
    }
    class MyListListener implements ActionListener {
        public void actionPerformed(ActionEvent event){
            Object selection = serviceList.getSelectedItem();
            loadService(selection);
        }
    }
    public static void main(String[]args){
        new ServiceBrowser().buildGUI();
    }
}
