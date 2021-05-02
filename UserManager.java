package homeWork3;

public class UserManager {
	public void add(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Kullanýcýsý eklendi");
	}

	public void delete(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "Kullanýcýsý silindi");
	}

	public void update(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "Kullanýcýsý güncellendi");
	}

}
