package com.hb.services;

import com.hb.domain.Adress;

public interface IAdressService {
	
	public void saveAdress(Adress adress);
	public Adress getAdress(Integer id);
	public void updateAdress(int id,String adress);

}
