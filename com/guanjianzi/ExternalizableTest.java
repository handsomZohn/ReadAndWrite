package com.guanjianzi;

import java.io.Externalizable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizableTest implements Externalizable {

	private transient String content = "�������Ƿ�transient����ֻҪ���ֹ�ָ��Ҫ���л��Ҷ������л�";
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(content);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		content = (String) in.readObject();
	}

	public static void main(String[] args) throws ClassNotFoundException {
		ExternalizableTest et = new ExternalizableTest();
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("e:/test.txt")));
			oos.writeObject(et);
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("e:/test.txt")));
			et = (ExternalizableTest) ois.readObject();
			System.out.println(et.content);
			ois.close();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
