package homeWork3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kullan�c�s� eklendi");
	}

	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "Kullan�c�s� silindi");
	}

	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "Kullan�c�s� g�ncellendi");
	}

}
