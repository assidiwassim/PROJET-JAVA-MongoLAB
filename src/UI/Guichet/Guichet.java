/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.Guichet;

import UI.Admin.MenuAdmin;
import UI.Login.Login;
import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DToshiba
 */
public class Guichet extends javax.swing.JFrame {
    Login L;
              String item="vide";
              String salle="";
              String place="";
             MongoClientURI uri  = new MongoClientURI("mongodb://wassimwajdi:kahri20917537@ds025232.mlab.com:25232/datab"); 
             MongoClient client = new MongoClient(uri);
             DB db = client.getDB(uri.getDatabase());
             
             
    public Guichet() {
        initComponents();
         
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Jokerman", 0, 24)); // NOI18N
        jLabel1.setText("Vendre ticket");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select item ...", "Skanes", "Agba" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                v2(evt);
            }
        });

        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ccc(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Confirmer");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Admin/images.jpg"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setText("numero de chaise");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addGap(54, 54, 54))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        int x=Integer.parseInt(this.jTextField1.getText());
         if(this.item.equals("vide"))
        {
          JOptionPane.showMessageDialog(rootPane, "Selectionner un element ","Erreur dans les entrées",1);
        }  
        if(this.item.equals("Skanes"))
        {    
                
                 
                 
                  
                 
                  
                   if(place.equals("chaise honneur"))
                   {
                        int a=0;
                  DBCollection collection3 = db.getCollection("SalleSkanes");
                  BasicDBObject whereQuery = new BasicDBObject();
                  whereQuery.put("_id", salle);
                  DBCursor cursor = collection3.find(whereQuery);
                  DBObject obj = cursor.next();
                    cursor.close();
                  BasicDBList Tabh =  (BasicDBList) obj.get("tabh");
                
                  
                  
                  Object [] t= Tabh.toArray();
                         for(int i=0;i<t.length;i++){
                      
                      
                    
                       
                      if (t[i].toString().equals("false")&&(i==x-1))
                      {
                       t[i]=true;
                        a=1;
                     break;
                       
                       }
                 
             
                  }
                  
                  
                  
                  
                  
                    if (a==1)
                   {
                     // JOptionPane.showMessageDialog(null, "il y a une place :v");
                        BasicDBObject newDocument = new BasicDBObject();
                   newDocument.put("_id", obj.get("_id"));
                  newDocument.put("cho", obj.get("cho"));
                   newDocument.put("chb", obj.get("chb"));
                   newDocument.put("chh", obj.get("chh"));
                    newDocument.put("prixo", obj.get("prixo"));
                     newDocument.put("prixb", obj.get("prixb"));
                      newDocument.put("prixh", obj.get("prixh"));
                      newDocument.put("Tb", obj.get("Tb"));
                      newDocument.put("To", obj.get("To"));
                     newDocument.put("tabh", t);
                     
                     BasicDBObject searchQuery = new BasicDBObject().append("_id",  obj.get("_id"));

                    collection3.update(searchQuery, newDocument);
                        JOptionPane.showMessageDialog(null, " Bienvenue \n\n La salle de "+item+ " \n Nom de la salle est " +salle+ "\nVotre place est en "+ place+" numero "+x+"\n Le prix de votre tiket est "+obj.get("prixb")+"\n\n");
                    //ajout des prix ,,,7otha mba3JOptionPane.showMessageDialog(null, "il y a une place :)");d  collection3.update(searchQuery, newDocument);
                    DBCollection collection4 = db.getCollection("Recet");
                       BasicDBObject b = new BasicDBObject();
                         b.put("prix",obj.get("prixh"));
                         collection4.insert(b);
                  
                   }
                  
                   else
                   {
                   JOptionPane.showMessageDialog(null, "il n'ya pas plus de place");
                   }
                 
                   
                   
                   
                   }
                  
       
            
                     if(place.equals("chaise balcon"))
                   {
                     int a=0;
                  DBCollection collection3 = db.getCollection("SalleSkanes");
                  BasicDBObject whereQuery = new BasicDBObject();
                  whereQuery.put("_id", salle);
                  DBCursor cursor = collection3.find(whereQuery);
                  DBObject obj = cursor.next();
                   cursor.close();
                  BasicDBList Tb =  (BasicDBList) obj.get("Tb");
               Object [] t= Tb.toArray();
                         for(int i=0;i<t.length;i++){
                      
                      
                    
                       
                      if (t[i].toString().equals("false")&&(i==x-1))
                      {
                       t[i]=true;
                        a=1;
                     break;
                       
                       }
                 
             
                  }
                  
                  
                  
                  
                  
                    if (a==1)
                   {
                     // JOptionPane.showMessageDialog(null, "il y a une place :)");
                        BasicDBObject newDocument = new BasicDBObject();
                   newDocument.put("_id", obj.get("_id"));
                  newDocument.put("cho", obj.get("cho"));
                   newDocument.put("chb", obj.get("chb"));
                   newDocument.put("chh", obj.get("chh"));
                    newDocument.put("prixo", obj.get("prixo"));
                     newDocument.put("prixb", obj.get("prixb"));
                      newDocument.put("prixh", obj.get("prixh"));
                      newDocument.put("tabh", obj.get("tabh"));
                      newDocument.put("To", obj.get("To"));
                     newDocument.put("Tb", t);
                     
                     BasicDBObject searchQuery = new BasicDBObject().append("_id",  obj.get("_id"));

                    collection3.update(searchQuery, newDocument);
                        JOptionPane.showMessageDialog(null, " Bienvenue \n\n La salle de "+item+ " \n Nom de la salle est " +salle+ "\nVotre place est en "+ place+" numero "+x+"\n Le prix de votre tiket est "+obj.get("prixb")+"\n\n");
                    //ajout des prix ,,,7otha mba3JOptionPane.showMessageDialog(null, "il y a une place :)");d  collection3.update(searchQuery, newDocument);
                    DBCollection collection4 = db.getCollection("Recet");
                       BasicDBObject b = new BasicDBObject();
                         b.put("prix",obj.get("prixb"));
                         collection4.insert(b);
                   }
                   else
                   {
                   JOptionPane.showMessageDialog(null, "il n'ya pas plus de place");
                   }
                   
       }
                  
       
              if(place.equals("chaise ordinaire"))
                   {
                     int a=0;
                  DBCollection collection3 = db.getCollection("SalleSkanes");
                  BasicDBObject whereQuery = new BasicDBObject();
                  whereQuery.put("_id", salle);
                  DBCursor cursor = collection3.find(whereQuery);
                  DBObject obj = cursor.next();
                     cursor.close();
                  BasicDBList Tabh =  (BasicDBList) obj.get("To");
                
                   Object [] t= Tabh.toArray();
                         for(int i=0;i<t.length;i++){
                      
                      
                    
                       
                       if (t[i].toString().equals("false")&&(i==x-1))
                      {
                       t[i]=true;
                        a=1;
                     break;
                       
                       }
                 
             
                  }
             
                
                   if (a==1)
                   {
                      // JOptionPane.showMessageDialog(null, "il y a une place :p");
                        BasicDBObject newDocument = new BasicDBObject();
                   newDocument.put("_id", obj.get("_id"));
                  newDocument.put("cho", obj.get("cho"));
                   newDocument.put("chb", obj.get("chb"));
                    newDocument.put("chh", obj.get("chh"));
                    newDocument.put("prixo", obj.get("prixo"));
                     newDocument.put("prixb", obj.get("prixb"));
                      newDocument.put("prixh", obj.get("prixh"));
                      newDocument.put("tabh", obj.get("tabh"));
                      newDocument.put("Tb", obj.get("Tb"));
                     newDocument.put("To", t);
                     
                     BasicDBObject searchQuery = new BasicDBObject().append("_id",  obj.get("_id"));

                    collection3.update(searchQuery, newDocument);
                        JOptionPane.showMessageDialog(null, " Bienvenue \n\n La salle de "+item+ " \n Nom de la salle est " +salle+ "\nVotre place est en "+ place+" numero "+x+"\n Le prix de votre tiket est "+obj.get("prixb")+"\n\n");
                    //ajout des prix ,,,7otha mba3JOptionPane.showMessageDialog(null, "il y a une place :)");d  collection3.update(searchQuery, newDocument);
                    DBCollection collection4 = db.getCollection("Recet");
                       BasicDBObject b = new BasicDBObject();
                         b.put("prix",obj.get("prixo"));
                         collection4.insert(b);
                   
                   }
                     else
                   {
                   JOptionPane.showMessageDialog(null, "il n'ya pas plus de place");
                   }
                   
                   }
                  
       
            
            
        }
      
        if(this.item.equals("Agba"))
        {
                   
            
                 
                  
                  
       
            
                     if(place.equals("chaise balcon"))
                   {
                     int a=0;
                  DBCollection collection3 = db.getCollection("SalleAgba");
                  BasicDBObject whereQuery = new BasicDBObject();
                  whereQuery.put("_id", salle);
                  DBCursor cursor = collection3.find(whereQuery);
                  DBObject obj = cursor.next();
                   cursor.close();
                  BasicDBList Tb =  (BasicDBList) obj.get("Tb");
                   Object [] t= Tb.toArray();
                         for(int i=0;i<t.length;i++){
                      
                    
                       
                      if (t[i].toString().equals("false")&&(i==x-1))
                      {
                       t[i]=true;
                        a=1;
                     break;
                       
                       }
                 
             
                  }
             
                    if (a==1)
                   {
                  //  JOptionPane.showMessageDialog(null, "il y a une place :*");
                        BasicDBObject newDocument = new BasicDBObject();
                   newDocument.put("_id", obj.get("_id"));
                  newDocument.put("cho", obj.get("cho"));
                   newDocument.put("chb", obj.get("chb"));
                  
                    newDocument.put("prixo", obj.get("prixo"));
                     newDocument.put("prixb", obj.get("prixb"));
                      newDocument.put("To", obj.get("To"));
                     newDocument.put("Tb", t);
                     
                     BasicDBObject searchQuery = new BasicDBObject().append("_id",  obj.get("_id"));

                    collection3.update(searchQuery, newDocument);
                        JOptionPane.showMessageDialog(null, " Bienvenue \n\n La salle de "+item+ " \n Nom de la salle est " +salle+ "\nVotre place est en "+ place+" numero "+x+"\n Le prix de votre tiket est "+obj.get("prixb")+"\n\n");
                    //ajout des prix ,,,7otha mba3JOptionPane.showMessageDialog(null, "il y a une place :)");d  collection3.update(searchQuery, newDocument);
                    DBCollection collection4 = db.getCollection("Recet");
                       BasicDBObject b = new BasicDBObject();
                         b.put("prix",obj.get("prixb"));
                         collection4.insert(b);
                   }
                   else
                   {
                   JOptionPane.showMessageDialog(null, "il n'ya pas plus de place");
                   }
                   
       }
                  
       
              if(place.equals("chaise ordinaire"))
                   {boolean y=true;
                     int a=0;
                  DBCollection collection3 = db.getCollection("SalleAgba");
                  BasicDBObject whereQuery = new BasicDBObject();
                  whereQuery.put("_id", salle);
                  DBCursor cursor = collection3.find(whereQuery);
                  DBObject obj = cursor.next();
                     cursor.close();
                  BasicDBList Tabh =  (BasicDBList) obj.get("To");
                         Object [] t= Tabh.toArray();
                        
                  for(int i=0;i<t.length;i++){
                      
                      
                    
                       
                       if (t[i].toString().equals("false")&&(i==x-1))
                      {
                       t[i]=true;
                        a=1;
                     break;
                       
                       }
                 
             
                  }
                
                   if (a==1)
                   {
                   //    JOptionPane.showMessageDialog(null, "il y a une place ;)");
                        BasicDBObject newDocument = new BasicDBObject();
                   newDocument.put("_id", obj.get("_id"));
                  newDocument.put("cho", obj.get("cho"));
                   newDocument.put("chb", obj.get("chb"));
                  
                    newDocument.put("prixo", obj.get("prixo"));
                     newDocument.put("prixb", obj.get("prixb"));
                      newDocument.put("Tb", obj.get("Tb"));
                     newDocument.put("To", t);
                     
                     BasicDBObject searchQuery = new BasicDBObject().append("_id",  obj.get("_id"));

                    collection3.update(searchQuery, newDocument);
                        JOptionPane.showMessageDialog(null, " Bienvenue \n\n La salle de "+item+ " \n Nom de la salle est " +salle+ "\nVotre place est en "+ place+" numero "+x+"\n Le prix de votre tiket est "+obj.get("prixb")+"\n\n");
                    //ajout des prix ,,,7otha mba3JOptionPane.showMessageDialog(null, "il y a une place :)");d  collection3.update(searchQuery, newDocument);
                    DBCollection collection4 = db.getCollection("Recet");
                       BasicDBObject b = new BasicDBObject();
                         b.put("prix",obj.get("prixo"));
                         collection4.insert(b);
                   
                   }
                     else
                   {
                   JOptionPane.showMessageDialog(null, "il n'ya pas plus de place");
                   }
                   
                   }
                  
       
            
            
            
            
            
            
            
            

        }
      
        
    }//GEN-LAST:event_jButton1ActionPerformed

                                             
 
  
    /**/
    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
       
        if(this.jComboBox1.getSelectedItem().equals("Skanes"))
        {
             item="Skanes";
        this.jComboBox2.removeAllItems();
           
             
             DBCollection collection = db.getCollection("SalleSkanes");
             DBCursor cursor = collection.find( );
             while(cursor.hasNext()) {
             jComboBox2.addItem(cursor.next().get("_id").toString());}
        
        this.jComboBox3.removeAllItems();
        this.jComboBox3.addItem("chaise ordinaire");      
        this.jComboBox3.addItem("chaise balcon");
        this.jComboBox3.addItem("chaise honneur");
        
       
         
        }
        
        
        
        
        
        if(this.jComboBox1.getSelectedItem().equals("Agba"))
        {
              item="Agba";
        this.jComboBox2.removeAllItems();
             DBCollection collection2 = db.getCollection("SalleAgba");
             DBCursor cursor2 = collection2.find();
             while(cursor2.hasNext()) {
             jComboBox2.addItem(cursor2.next().get("_id").toString());  }
               salle=jComboBox2.getItemAt(0);
        this.jComboBox3.removeAllItems();
        this.jComboBox3.addItem("chaise ordinaire");
        this.jComboBox3.addItem("chaise balcon");
       place=jComboBox3.getItemAt(0);
         if(this.jComboBox1.getSelectedItem().equals("Select item ..."))
        {
        this.jComboBox2.removeAllItems();
        this.jComboBox3.removeAllItems();
      
       
       
    }              
    
        }
    
    }//GEN-LAST:event_jComboBox1ItemStateChanged


    private void ccc(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ccc
          place=(String) this.jComboBox3.getSelectedItem();
    }//GEN-LAST:event_ccc

    private void v2(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_v2
        salle=(String) this.jComboBox2.getSelectedItem();
    }//GEN-LAST:event_v2

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
// TODO add your handling code here:
        L=new Login(); 
        L.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked
    

    
   
    
    
 
    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guichet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
