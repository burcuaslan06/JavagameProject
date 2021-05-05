package Concrete;

import Abstract.UserCheckService;
import Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {

	UserCheckService _userCheckService;
	
	public UserManager(UserCheckService _userCheckService) {
		super();
		this._userCheckService = _userCheckService;
	}

	@Override
	public void save(User user) {
		if(_userCheckService.checkIfRealPerson(user)) {
			System.out.println("Kullanici ismi :"+user.getFirstName()+"\n"+" Kimlik numarasi :"+user.getNationalityId()+"\n"+" Dogum tarihi :"+user.getDateOfBirth()+"\n"+" kullanici sisteme kaydedildi.");
		}
		else {
			System.out.println("Kullanici Bilgileri do�rulanamadi. TC hatal� girildi�i i�in. ");
		}
		
	}

	@Override
	public void update(User user) {
		System.out.println("Kullanici bilgileri g�ncellendi : ");

		
	}

	@Override
	public void delete(User user) {
		System.out.println("Kullanici Bilgileri silindi");
		
	}

}
