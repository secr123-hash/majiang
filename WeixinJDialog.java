/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uitrs.game.majiang;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JOptionPane;

import com.uitrs.game.majiang.client.service.CommonSevice;
import com.uitrs.game.majiang.common.msg.sub.UserInfo;

/**
 *
 * @author lucio
 */
public class WeixinJDialog extends javax.swing.JDialog {

	private static final long serialVersionUID = -7472671926555891336L;
	private MainJFrame frame;

	/**
	 * Creates new form WeixinJDialog
	 */
	public WeixinJDialog(MainJFrame parent, boolean modal) {
		super(parent, modal);
		this.frame = parent;
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screensize = tk.getScreenSize();
		int height = screensize.height;
		int width = screensize.width;
		initComponents();
		this.setLocation(width / 2 - this.getWidth() / 2, height / 2 - this.getHeight() / 2);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jScrollPane1 = new javax.swing.JScrollPane();
		jEditorPaneOpenId = new javax.swing.JEditorPane();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jScrollPane3 = new javax.swing.JScrollPane();
		jEditorPaneFaceIcon = new javax.swing.JEditorPane();
		jLabel3 = new javax.swing.JLabel();
		jScrollPane4 = new javax.swing.JScrollPane();
		jEditorPaneSex = new javax.swing.JEditorPane();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jScrollPane5 = new javax.swing.JScrollPane();
		jEditorPaneIp = new javax.swing.JEditorPane();
		jScrollPane6 = new javax.swing.JScrollPane();
		jEditorPaneRoomId = new javax.swing.JEditorPane();
		jLabel6 = new javax.swing.JLabel();
		jButtonOk = new javax.swing.JButton();
		jScrollPane7 = new javax.swing.JScrollPane();
		jEditorPaneNickName = new javax.swing.JEditorPane();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("Login Info");
		setLocation(new java.awt.Point(600, 300));
		setModal(true);

		jEditorPaneOpenId.setText("51800");
		jScrollPane1.setViewportView(jEditorPaneOpenId);

		jLabel1.setText("openId:");

		jLabel2.setText("nickName:");

		jEditorPaneFaceIcon.setText("http://192.168.0.114:8080/quanzhou/img/single-cute.png");
		jScrollPane3.setViewportView(jEditorPaneFaceIcon);

		jLabel3.setText("faceIcon:");

		jEditorPaneSex.setText("1");
		jScrollPane4.setViewportView(jEditorPaneSex);

		jLabel4.setText("sex:");

		jLabel5.setText("ip:");

		jEditorPaneIp.setText("127.0.0.1");
		jScrollPane5.setViewportView(jEditorPaneIp);

		jScrollPane6.setViewportView(jEditorPaneRoomId);

		jLabel6.setText("roomId:");

		jButtonOk.setText("Login");
		jButtonOk.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonOkActionPerformed(evt);
			}
		});

		jEditorPaneNickName.setText("Player");
		jScrollPane7.setViewportView(jEditorPaneNickName);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				layout.createSequentialGroup().addContainerGap(40, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jButtonOk)
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(jLabel2).addComponent(jLabel1).addComponent(jLabel3)
												.addComponent(jLabel4).addComponent(jLabel6).addComponent(jLabel5))
										.addGap(18, 18, 18)
										.addGroup(layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
												.addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING,
														javax.swing.GroupLayout.PREFERRED_SIZE, 284,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jScrollPane7,
														javax.swing.GroupLayout.Alignment.LEADING))))
						.addGap(28, 28, 28)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addGap(17, 17, 17)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jScrollPane1).addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(
								layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(layout.createSequentialGroup().addGap(18, 18, 18).addComponent(
												jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 42,
												javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(layout.createSequentialGroup()
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jScrollPane4).addComponent(jLabel4,
										javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jScrollPane5).addComponent(jLabel5,
										javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(jScrollPane6).addComponent(jLabel6,
										javax.swing.GroupLayout.PREFERRED_SIZE, 23,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jButtonOk)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		UserInfo ui = new UserInfo();
		ui.setOpenId(this.jEditorPaneOpenId.getText());
		ui.setUserId(Long.parseLong(this.jEditorPaneOpenId.getText()));
		ui.setNickName(this.jEditorPaneNickName.getText());
		ui.setFaceIcon(this.jEditorPaneFaceIcon.getText());
		ui.setIp(this.jEditorPaneIp.getText());
		ui.setSex("2".equals(this.jEditorPaneSex.getText()) ? 2 : 1);
		ui.setRoomId(this.jEditorPaneRoomId.getText());
		ui = CommonSevice.getInstance().login(ui);
		if (null == ui) {
			JOptionPane.showMessageDialog(this, "登录失败", "错误", JOptionPane.ERROR_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(this, "登录成功", "提示", JOptionPane.INFORMATION_MESSAGE);
		}
		setVisible(false);
		dispose();
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting
		// code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.
		 * html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(WeixinJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(WeixinJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(WeixinJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(WeixinJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null,
					ex);
		}
		// </editor-fold>

		/* Create and display the dialog */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				WeixinJDialog dialog = new WeixinJDialog(new MainJFrame(), true);
				dialog.addWindowListener(new java.awt.event.WindowAdapter() {
					@Override
					public void windowClosing(java.awt.event.WindowEvent e) {
						System.exit(0);
					}
				});
				dialog.setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton jButtonOk;
	private javax.swing.JEditorPane jEditorPaneFaceIcon;
	private javax.swing.JEditorPane jEditorPaneIp;
	private javax.swing.JEditorPane jEditorPaneNickName;
	private javax.swing.JEditorPane jEditorPaneOpenId;
	private javax.swing.JEditorPane jEditorPaneRoomId;
	private javax.swing.JEditorPane jEditorPaneSex;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JScrollPane jScrollPane5;
	private javax.swing.JScrollPane jScrollPane6;
	private javax.swing.JScrollPane jScrollPane7;
	// End of variables declaration
}
