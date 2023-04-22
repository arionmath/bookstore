package com.arionmathias.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.arionmathias.bookstore.dao.BookDAO;
import com.arionmathias.bookstore.model.Book;

@Configuration
public class ExecuteOnContextLoads implements CommandLineRunner {

	@Autowired
	BookDAO bookDao;

	@Override
	public void run(String... args) throws Exception {
		
		Book b1 = new Book();
		b1.setTitle("Harry Potter and the Philosopher's Stone");
		b1.setDescription(
				"Harry Potter has never even heard of Hogwarts when the letters start dropping on the doormat at number four, "
				+ "Privet Drive. Addressed in green ink on yellowish parchment with a purple seal, they are swiftly confiscated "
				+ "by his grisly aunt and uncle. Then, on Harry's eleventh birthday, a great beetle-eyed giant of a man called "
				+ "Rubeus Hagrid bursts in with some astonishing news: Harry Potter is a wizard, and he has a place at Hogwarts "
				+ "School of Witchcraft and Wizardry. An incredible adventure is about to begin!");
		b1.setTotalPages(223);
		
		Book b2 = new Book();
		b2.setTitle("Harry Potter and the Chamber of Secrets");
		b2.setDescription(
				"Harry Potter's summer has included the worst birthday ever, doomy warnings from a house-elf called Dobby, and "
				+ "rescue from the Dursleys by his friend Ron Weasley in a magical flying car! Back at Hogwarts School of "
				+ "Witchcraft and Wizardry for his second year, Harry hears strange whispers echo through empty corridors - and "
				+ "then the attacks start. Students are found as through turned to stone . Dobby's sinister predictions seem to be "
				+ "coming true.");
		b2.setTotalPages(384);		
		
		
		bookDao.createMany(b1,b2);

	}

}
