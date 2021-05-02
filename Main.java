package homeWork3;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("�mer");
		student1.setLastName("Tayfun");
		student1.setDepartment("International Relations");
		student1.seteMail("omertayfun@gmail.com");

		Instructor instructor1 = new Instructor();
		instructor1.setId(2);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiro�");
		instructor1.setMainProgrammingLanguage("Csharp,JAVA etc.");
		instructor1.seteMail("engindemirog@gmail.com");

		// ��rencileri ve E�itmenleri tek bir operasyon ile ekleme,silme ve g�ncelleme
		// i�lemi yap�labilir hale getirildi.
		UserManager userManager = new UserManager();
		userManager.add(instructor1);
		userManager.delete(instructor1);
		userManager.update(instructor1);

		userManager.add(student1);
		userManager.delete(student1);
		userManager.update(student1);

	}

}
