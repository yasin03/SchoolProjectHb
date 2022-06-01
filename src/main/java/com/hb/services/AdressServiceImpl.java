package com.hb.services;

import com.hb.domain.Adress;
import com.hb.repository.AdressRepository;

public class AdressServiceImpl implements IAdressService {
	
	private static final AdressRepository adressRepo = new AdressRepository();

	@Override
	public void saveAdress(Adress adress) {
		adressRepo.saveAdress(adress);
	}

	@Override
	public Adress getAdress(Integer id) {
		return adressRepo.findById(id);
	}

	@Override
	public void updateAdress(int id,String adress) {
		adressRepo.UpdateAdress(id, adress);
	}

}
