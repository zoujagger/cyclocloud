/**
 * 
 */
package com.cyclobox.cloud;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zouj
 *
 */
public class SignalService {

	private int id;
	private int rms;
	private int frequence;
	private List<SignalService> listSignal;
	
	public SignalService(){}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRms() {
		return rms;
	}

	public void setRms(int rms) {
		this.rms = rms;
	}

	public int getFrequence() {
		return frequence;
	}

	public void setFrequence(int frequence) {
		this.frequence = frequence;
	}

	public SignalService(int frequence) {
		super();
		this.frequence = frequence;
	}

	public SignalService(int rms, int frequence) {
		super();
		this.rms = rms;
		this.frequence = frequence;
	}
	
	public void addSignal(SignalService ss){
		listSignal = new ArrayList<SignalService>();
		listSignal.add(ss);
	}

	public List<SignalService> getListSignal() {
		return listSignal;
	}	
	@Override
	public String toString() {
		return "[id=" + id + ", rms=" + rms + ", freq="+frequence+ "]";
	}

	public SignalService(int id, int rms, int frequence) {
		super();
		this.id = id;
		this.rms = rms;
		this.frequence = frequence;
	}
	

}
