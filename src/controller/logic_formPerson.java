package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.List;

import javax.swing.JOptionPane;

import lib_genericP65v0.files;
import model.person;
import model.personDAO;
import view.view_formPerson;

public class logic_formPerson implements ActionListener{
	
	private view_formPerson vfp;
	private personDAO pdao=new personDAO();

	public logic_formPerson(view_formPerson vfp) {
		super();
		this.vfp = vfp;
		this.vfp.btn_clean.addActionListener(this);
		this.vfp.btn_save.addActionListener(this);
		loadPerson();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==vfp.btn_clean) {
			clean();
		}else if(e.getSource()==vfp.btn_save) {
			if(validateField()) {
				vfp.txt_name.setBackground(Color.green);
				vfp.sp_age.setBackground(Color.green);
				save();
				
			}
		}
	}

	private boolean validateField() {
		// TODO Auto-generated method stub
		boolean flag=true;
		if(!files.validateByER(vfp.txt_name.getText(), "^([A-Z][a-zá-ú]+\\s?){2,4}$")) {
			flag=false;
			vfp.txt_name.setBackground(Color.red);
		}
		
		if(!files.validateByER(vfp.sp_age.getValue().toString(), "^\\d{1,2}$")) {
			flag=false;
			vfp.sp_age.setBackground(Color.red);
		}
		
		//Implementar en clase
		return flag;
	}

	private void clean() {
		// TODO Auto-generated method stub
		vfp.txt_name.setText("");
		vfp.sp_age.setValue(0);
		vfp.txt_dni.setText("");
		vfp.txt_email.setText("");
	}
	
	private void save() {
		person p=new person();
		p.setName(vfp.txt_name.getText());
		p.setAge(Integer.parseInt(vfp.sp_age.getValue().toString()));
		p.setDni(Integer.parseInt(vfp.txt_dni.getText()));
		p.setEmail(vfp.txt_email.getText());
		pdao=new personDAO(p);
	
		try {
			if(pdao.write()) {
				JOptionPane.showMessageDialog(vfp,"Registro Exitoso","Formulario", JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(vfp,"Problemas al registrar en el archivo","Formulario",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	private void loadPerson() {
		try {
			List<person>persons=pdao.read();
			for(person p:persons) {
				System.out.println(p.toString());
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
