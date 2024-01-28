
import java.io.IOException;
import javax.swing.JOptionPane;

public class AddProfile extends javax.swing.JFrame implements Buttons {

    private final int NUMBER_OF_ROOMS = 20;

    @Override
    public void reset() {
        firstNameField.setText("");
        middleNameField.setText("");
        lastNameField.setText("");
        fatherNameField.setText("");
        phoneNoField.setText("");
        emailField.setText("");
        studentIdField.setText("");
        genderRadioBtngroup.clearSelection();
        countryCbox.setSelectedIndex(0);
        roomCbox.setSelectedItem(roomCbox.getItemAt(0));
        ageField.setText("");
        addressTextarea.setText("");

        //Room Reset
        roomCbox.removeAllItems();
        for (int i = 1; i <= NUMBER_OF_ROOMS; i++) {
            roomCbox.addItem("ROOM " + i);
        }
        runned = 0;
    }
    
    @Override
    public void back(){
        dispose();
        Option obj = new Option();
        obj.setVisible(true);

    }
    
    @Override
    public void cancel(){
        dispose();
    }
    @Override
    public void search() {
    }

    @Override
    public void loadAll() {
    }

    /**
     * Creates new form AddProfile
     */
    public AddProfile() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderRadioBtngroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        firstnameLabel = new javax.swing.JLabel();
        middleNameField = new javax.swing.JTextField();
        middleNameLabel = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        fatherNameField = new javax.swing.JTextField();
        fatherNameLabel = new javax.swing.JLabel();
        phoneNoField = new javax.swing.JTextField();
        phoneNoLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        studentIdField = new javax.swing.JTextField();
        schoolUniversityLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        maleRadiobtn = new javax.swing.JRadioButton();
        femaleRadiobtn = new javax.swing.JRadioButton();
        ageField = new javax.swing.JTextField();
        ageLabel = new javax.swing.JLabel();
        roomCbox = new javax.swing.JComboBox<>();
        addressLabel = new javax.swing.JLabel();
        countryLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTextarea = new javax.swing.JTextArea();
        savebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        Resetbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cancelbtn1 = new javax.swing.JButton();
        countryCbox = new javax.swing.JComboBox<>();
        roomLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add a Profile");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 24, 69));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\HMS Project\\SelectOption\\icons\\add-user (2).png")); // NOI18N
        jLabel1.setText(" Add Profile");

        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });

        firstnameLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        firstnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstnameLabel.setText("First Name :");

        middleNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleNameFieldActionPerformed(evt);
            }
        });

        middleNameLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        middleNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        middleNameLabel.setText("Middle Name :");

        lastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameFieldActionPerformed(evt);
            }
        });

        lastNameLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Last Name :");

        fatherNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fatherNameFieldActionPerformed(evt);
            }
        });

        fatherNameLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        fatherNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        fatherNameLabel.setText("Father Name :");

        phoneNoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNoFieldActionPerformed(evt);
            }
        });

        phoneNoLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        phoneNoLabel.setForeground(new java.awt.Color(255, 255, 255));
        phoneNoLabel.setText("Phone No :");

        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });

        emailLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        emailLabel.setForeground(new java.awt.Color(255, 255, 255));
        emailLabel.setText("Email :");

        studentIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentIdFieldActionPerformed(evt);
            }
        });

        schoolUniversityLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        schoolUniversityLabel.setForeground(new java.awt.Color(255, 255, 255));
        schoolUniversityLabel.setText("Student ID");

        genderLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(255, 255, 255));
        genderLabel.setText("Gender :");

        maleRadiobtn.setBackground(new java.awt.Color(255, 255, 255));
        genderRadioBtngroup.add(maleRadiobtn);
        maleRadiobtn.setForeground(new java.awt.Color(255, 255, 255));
        maleRadiobtn.setText("Male");
        maleRadiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadiobtnActionPerformed(evt);
            }
        });

        femaleRadiobtn.setBackground(new java.awt.Color(255, 255, 255));
        genderRadioBtngroup.add(femaleRadiobtn);
        femaleRadiobtn.setForeground(new java.awt.Color(255, 255, 255));
        femaleRadiobtn.setText("Female");

        ageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageFieldActionPerformed(evt);
            }
        });

        ageLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(255, 255, 255));
        ageLabel.setText("Age :");

        roomCbox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        roomCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ROOM 1", "ROOM 2", "ROOM 3", "ROOM 4", "ROOM 5", "Room 6", "ROOM 7", "ROOM 8", "ROOM 9", "ROOM 10", "ROOM 11", "ROOM 12", "ROOM 13", "ROOM 14", "ROOM 15", "ROOM 16", "ROOM 17", "ROOM 18", "ROOM 19", "ROOM 20" }));
        roomCbox.setBorder(null);
        roomCbox.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                roomCboxMouseMoved(evt);
            }
        });
        roomCbox.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                roomCboxFocusGained(evt);
            }
        });
        roomCbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                roomCboxMouseClicked(evt);
            }
        });
        roomCbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomCboxActionPerformed(evt);
            }
        });

        addressLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        addressLabel.setForeground(new java.awt.Color(255, 255, 255));
        addressLabel.setText("Address :");

        countryLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        countryLabel1.setForeground(new java.awt.Color(255, 255, 255));
        countryLabel1.setText("Country :");

        addressTextarea.setColumns(20);
        addressTextarea.setRows(5);
        jScrollPane1.setViewportView(addressTextarea);

        savebtn.setBackground(new java.awt.Color(255, 255, 255));
        savebtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        savebtn.setIcon(new javax.swing.ImageIcon("C:\\HMS Project\\SelectOption\\icons\\save.png")); // NOI18N
        savebtn.setText("Save");
        savebtn.setBorder(null);
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        backbtn.setBackground(new java.awt.Color(255, 255, 255));
        backbtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        backbtn.setIcon(new javax.swing.ImageIcon("C:\\HMS Project\\SelectOption\\icons\\back.png")); // NOI18N
        backbtn.setText("Back");
        backbtn.setBorder(null);
        backbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backbtnMouseEntered(evt);
            }
        });
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        Resetbtn.setBackground(new java.awt.Color(255, 255, 255));
        Resetbtn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Resetbtn.setIcon(new javax.swing.ImageIcon("C:\\HMS Project\\SelectOption\\icons\\reload.png")); // NOI18N
        Resetbtn.setText("Reset");
        Resetbtn.setBorder(null);
        Resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetbtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("   HMS 2021   Version 1.0                                                                                                                                                                  Need Help ?");

        cancelbtn1.setBackground(new java.awt.Color(255, 255, 255));
        cancelbtn1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cancelbtn1.setIcon(new javax.swing.ImageIcon("C:\\HMS Project\\SelectOption\\icons\\cancel.png")); // NOI18N
        cancelbtn1.setText("Cancel");
        cancelbtn1.setBorder(null);
        cancelbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelbtn1ActionPerformed(evt);
            }
        });

        countryCbox.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        countryCbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PAKISTAN", "BANGLADESH", "AFGHANISTAN", "NEPAL" }));

        roomLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        roomLabel.setForeground(new java.awt.Color(255, 255, 255));
        roomLabel.setText("Room :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emailLabel)
                                    .addComponent(phoneNoLabel)
                                    .addComponent(fatherNameLabel)
                                    .addComponent(lastNameLabel)
                                    .addComponent(middleNameLabel)
                                    .addComponent(firstnameLabel)
                                    .addComponent(firstNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                                    .addComponent(middleNameField)
                                    .addComponent(lastNameField)
                                    .addComponent(fatherNameField)
                                    .addComponent(phoneNoField)
                                    .addComponent(emailField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(schoolUniversityLabel)
                                    .addComponent(studentIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(genderLabel)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(maleRadiobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(femaleRadiobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ageLabel)
                                    .addComponent(addressLabel)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(ageField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(countryCbox, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(countryLabel1))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(roomLabel)
                                                .addComponent(roomCbox, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addGap(39, 39, 39))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 889, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(firstnameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(middleNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(middleNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lastNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fatherNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fatherNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneNoLabel)
                            .addComponent(addressLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(schoolUniversityLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(studentIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(genderLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(maleRadiobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(femaleRadiobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(ageLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(countryLabel1)
                            .addComponent(roomLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roomCbox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(countryCbox, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(phoneNoField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(emailLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageFieldActionPerformed

    private void maleRadiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadiobtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadiobtnActionPerformed

    private void studentIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentIdFieldActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void phoneNoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNoFieldActionPerformed

    private void fatherNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fatherNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fatherNameFieldActionPerformed

    private void lastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameFieldActionPerformed

    private void middleNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middleNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middleNameFieldActionPerformed

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed


    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:
        String firstName = firstNameField.getText().trim();
        String middleName = middleNameField.getText().trim();
        String lastName = lastNameField.getText().trim();
        String fatherName = fatherNameField.getText().trim();
        String phoneNo = phoneNoField.getText().trim();
        String email = emailField.getText().trim();
        String studentId = studentIdField.getText().trim();
        String gender;
        if (maleRadiobtn.isSelected()) {
            gender = "MALE";
        } else {
            gender = "FEMALE";
        }
        String age = ageField.getText().trim();
        String country = countryCbox.getSelectedItem().toString();
        String room = roomCbox.getSelectedItem().toString();
        String address = addressTextarea.getText().replaceAll("\n", " ").trim();

        //TO CHECK IF ANY INPUT IS BLANK OR NULL
        if (Validation.isBlank(firstName)
                || Validation.isBlank(middleName)
                || Validation.isBlank(lastName)
                || Validation.isBlank(fatherName)
                || Validation.isBlank(phoneNo)
                || Validation.isBlank(email)
                || Validation.isBlank(studentId)
                || Validation.isBlank(age)
                || Validation.isBlank(address)
                || !(maleRadiobtn.isSelected() || femaleRadiobtn.isSelected())) {
            JOptionPane.showMessageDialog(null, "Can't Leave Any Box Empty.");

            //TO CHECK IF FORMAT IS WRONG OR NOT VALID
        } else if (!Validation.nameIsValid(firstName)) {
            JOptionPane.showMessageDialog(null, "Invalid First Name.");
        } else if (!Validation.nameIsValid(middleName)) {
            JOptionPane.showMessageDialog(null, "Invalid Middle Name.");
        } else if (!Validation.nameIsValid(lastName)) {
            JOptionPane.showMessageDialog(null, "Invalid Last Name.");
        } else if (!Validation.fatherNameIsValid(fatherName)) {
            JOptionPane.showMessageDialog(null, "Invalid Father Name.");
        } else if (!Validation.phoneNoIsValid(phoneNo)) {
            JOptionPane.showMessageDialog(null, "Invalid Phone No.");
        } else if (!Validation.emailIsValid(email)) {
            JOptionPane.showMessageDialog(null, "Invalid Email.");
        } else if (!Validation.studentIdIsValid(studentId)) {
            JOptionPane.showMessageDialog(null, "Invalid Student ID/Format\ne.g. : cs201062");
        } else if (Record.recordExist(studentId)) {
            JOptionPane.showMessageDialog(null, "Student Id Already Exist In Record.");
        } else if (!Validation.ageIsValid(age)) {
            JOptionPane.showMessageDialog(null, "Invalid Age.");
        } else if (Record.recordExist(room)) {
            JOptionPane.showMessageDialog(null, "Room is Taken.");
        } else if (!Validation.addressIsValid(address)) {
            JOptionPane.showMessageDialog(null, "Invalid Address\nDon't Use '|'.");
        } else {
            try {
                Student std = new Student(firstName, middleName, lastName, fatherName, phoneNo, email, studentId, gender, age, country, room, address);
                Record.saveRecord(std);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error Occurd\nWhile saving the file.");
            }
            JOptionPane.showMessageDialog(null, "Record Have been Saved.");
            reset();
        }
    }//GEN-LAST:event_savebtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        back();
    }//GEN-LAST:event_backbtnActionPerformed

    private void ResetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetbtnActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_ResetbtnActionPerformed

    private void cancelbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelbtn1ActionPerformed
        // TODO add your handling code here:
        cancel();
    }//GEN-LAST:event_cancelbtn1ActionPerformed

    private void roomCboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomCboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roomCboxActionPerformed

    private void backbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backbtnMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_backbtnMouseEntered

    private void roomCboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomCboxMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_roomCboxMouseClicked
    private static int runned = 0;

    private void roomCboxMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_roomCboxMouseMoved
        // TODO add your handling code here:

        if (runned <= roomCbox.getItemCount()) {
            for (int i = 0; i < roomCbox.getItemCount(); i++) {
                if (Record.recordExist(roomCbox.getItemAt(i))) {
                    roomCbox.removeItemAt(i);
                }
            }
            runned++;
        }
    }//GEN-LAST:event_roomCboxMouseMoved

    private void roomCboxFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_roomCboxFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_roomCboxFocusGained

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(AddProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(AddProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(AddProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(AddProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new AddProfile().setVisible(true);
//            }
//        });
//    }
//    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Resetbtn;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextArea addressTextarea;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton backbtn;
    private javax.swing.JButton cancelbtn1;
    private javax.swing.JComboBox<String> countryCbox;
    private javax.swing.JLabel countryLabel1;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField fatherNameField;
    private javax.swing.JLabel fatherNameLabel;
    private javax.swing.JRadioButton femaleRadiobtn;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JLabel firstnameLabel;
    private javax.swing.JLabel genderLabel;
    private javax.swing.ButtonGroup genderRadioBtngroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JRadioButton maleRadiobtn;
    private javax.swing.JTextField middleNameField;
    private javax.swing.JLabel middleNameLabel;
    private javax.swing.JTextField phoneNoField;
    private javax.swing.JLabel phoneNoLabel;
    private javax.swing.JComboBox<String> roomCbox;
    private javax.swing.JLabel roomLabel;
    private javax.swing.JButton savebtn;
    private javax.swing.JLabel schoolUniversityLabel;
    private javax.swing.JTextField studentIdField;
    // End of variables declaration//GEN-END:variables
}