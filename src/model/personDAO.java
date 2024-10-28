package model;

import java.io.File;
import java.io.IOException;
import java.util.List;

import lib_genericP65v0.files;
import lib_genericP65v0.generic;

public class personDAO {
	
	private person p;
	private files f;

	public personDAO() {
		p=new person();
		loadFile();
	}
	public personDAO(person p) {
		super();
		this.p = p;
		loadFile();
	}
	private void loadFile() {
		f=new files("src/agenda");
		f.create(0);
		f.setFile(new File(f.getFile().getPath(),"persons.txt"));
		f.create(1);
	}
	public boolean write() throws IOException {
		return f.writerFile(p.toString(), false);
	}
	
	public List<person> read() throws IOException{
		generic<person,String>persons=new generic<>();
		persons.setAttribute3(f.readerFile());//almacenar los datos del archivo en un string
		persons.setAttArray2(persons.getAttribute3().split("\n"));
		for(String ps:persons.getAttArray2()) {
			p=new person();
			p.setName(ps.split(";")[0]);
			p.setAge(Integer.parseInt(ps.split(";")[1]));
			p.setDni(Integer.parseInt(ps.split(";")[2]));
			p.setEmail(ps.split(";")[3]);
			persons.addElementList2(p);
		}
		
		return persons.getAttList2();
	}

}
