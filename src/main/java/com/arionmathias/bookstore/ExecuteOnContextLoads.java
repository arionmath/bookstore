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
		b1.setTotalPages(208);
		
		Book b2 = new Book();
		b2.setTitle("Harry Potter and the Chamber of Secrets");
		b2.setDescription(
				"Harry Potter's summer has included the worst birthday ever, doomy warnings from a house-elf called Dobby, and "
				+ "rescue from the Dursleys by his friend Ron Weasley in a magical flying car! Back at Hogwarts School of "
				+ "Witchcraft and Wizardry for his second year, Harry hears strange whispers echo through empty corridors - and "
				+ "then the attacks start. Students are found as through turned to stone . Dobby's sinister predictions seem to be "
				+ "coming true.");
		b2.setTotalPages(224);		
		
		Book b3 = new Book();
		b3.setTitle("Harry Potter and the Prisoner of Azkaban");
		b3.setDescription(
				"When the Knight Bus crashes through the darkness and screeches to a halt in front of him, it's the start of "
				+ "another far from ordinary year at Hogwarts for Harry Potter. Sirius Black, escaped mass-murderer and follower "
				+ "of Lord Voldemort, is on the run - and they say he is coming after Harry. In his first ever Divination class, "
				+ "Professor Trelawney sees an omen of death in Harry's tea leaves . But perhaps most terrifying of all are the "
				+ "Dementors patrolling the school grounds, with their soul-sucking kiss.");
		b3.setTotalPages(348);			
		
		Book b4 = new Book();
		b4.setTitle("Harry Potter and the Goblet of Fire");
		b4.setDescription(
				"Harry Potter is midway through his training as a wizard and his coming of age. Harry wants to get away from the pernicious Dursleys and go to the International Quidditch Cup. He wants to find out about the mysterious event that's supposed to take place at Hogwarts this year, an event involving two other rival schools of magic, and a competition that hasn't happened for a hundred years. He wants to be a normal, fourteen-year-old wizard. But unfortunately for Harry Potter, he's not normal - even by wizarding standards. And in his case, different can be deadly.");
		b4.setTotalPages(480);
		
		Book b5 = new Book();
		b5.setTitle(" Harry Potter and the Order of the Phoenix ");
		b5.setDescription(
				"Harry Potter and the Order of the Phoenix is a fantasy novel written by British author J. K. Rowling and the fifth novel in the Harry Potter series. It follows Harry Potter's struggles through his fifth year at Hogwarts School of Witchcraft and Wizardry, including the surreptitious return of the antagonist Lord Voldemort, O.W.L. exams, and an obstructive Ministry of Magic. The novel was published on 21 June 2003 by Bloomsbury in the United Kingdom, Scholastic in the United States, and Raincoast in Canada. It sold five million copies in the first 24 hours of publication");
		b5.setTotalPages(766 );
		
		Book b6 = new Book();
		b6.setTitle("Harry Potter and the Half-Blood Prince");
		b6.setDescription(
				"Harry Potter and the Half-Blood Prince is a fantasy novel written by British author J. K. Rowling and the sixth and penultimate novel in the Harry Potter series. Set during Harry Potter's sixth year at Hogwarts, the novel explores the past of the boy wizard's nemesis, Lord Voldemort, and Harry's preparations for the final battle against Voldemort alongside his headmaster and mentor Albus Dumbledore");
		b6.setTotalPages(671);
		
		Book b7 = new Book();
		b7.setTitle("Harry Potter and the Deathly Hallows");
		b7.setDescription(
				"Readers beware. The brilliant, breathtaking conclusion to J.K. Rowling's spellbinding series is not for the faint of heart--such revelations, battles, and betrayals await in Harry Potter and the Deathly Hallows that no fan will make it to the end unscathed. Luckily, Rowling has prepped loyal readers for the end of her series by doling out increasingly dark and dangerous tales of magic and mystery, shot through with lessons about honor and contempt, love and loss, and right and wrong. Fear not, you will find no spoilers in our review--to tell the plot would ruin the journey, and Harry Potter and the Deathly Hallows is an odyssey the likes of which Rowling's fans have not yet seen, and are not likely to forget. But we would be remiss if we did not offer one small suggestion before you embark on your final adventure with Harry--bring plenty of tissues.\r\n");
		b7.setTotalPages(784);
		
		Book b8 = new Book();
		b8.setTitle("Billy Summers");
		b8.setDescription(
				"Chances are, if you're a target of Billy Summers, two immutable truths apply: You'll never even know what hit you, and you're really getting what you deserve. He's a killer for hire and the best in the business--but he'll do the job only if the assignment is a truly bad person. But now, time is catching up with him, and Billy wants out. Before he can do that though, there's one last hit, which promises a generous payday at the end of the line even as things don't seem quite on the level here. Given that Billy is among the most talented snipers in the world, a decorated Iraq war vet, and a virtual Houdini when it comes to vanishing after the job is done, what could possibly go wrong? How about everything. ");
		b8.setTotalPages(528);
		
		Book b9 = new Book();
		b9.setTitle("Clean Code");
		b9.setDescription(
				"\r\n"
				+ "Even bad code can function. But if code isn’t clean, it can bring a development organization to its knees. Every year, countless hours and significant resources are lost because of poorly written code. But it doesn’t have to be that way. ");
		b9.setTotalPages(464);
		
		Book b10 = new Book();
		b10.setTitle("The Pragmatic Programmer");
		b10.setDescription(
				"The Pragmatic Programmer is one of those rare tech books you’ll read, re-read, and read again over the years. Whether you’re new to the field or an experienced practitioner, you’ll come away with fresh insights each and every time.\r\n"
				+ "\r\n"
				+ "Dave Thomas and Andy Hunt wrote the first edition of this influential book in 1999 to help their clients create better software and rediscover the joy of coding. These lessons have helped a generation of programmers examine the very essence of software development, independent of any particular language, framework, or methodology, and the Pragmatic philosophy has spawned hundreds of books, screencasts, and audio books, as well as thousands of careers and success stories.\r\n"
				+ "");
		b10.setTotalPages(352);
		
		Book b11= new Book();
		b11.setTitle("Design Patterns: Elements of Reusable Object-Oriented Software");
		b11.setDescription(
				"Capturing a wealth of experience about the design of object-oriented software, four top-notch designers present a catalog of simple and succinct solutions to commonly occurring design problems. Previously undocumented, these 23 patterns allow designers to create more flexible, elegant, and ultimately reusable designs without having to rediscover the design solutions themselves.\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "The authors begin by describing what patterns are and how they can help you design object-oriented software. They then go on to systematically name, explain, evaluate, and catalog recurring designs in object-oriented systems. With Design Patterns as your guide, you will learn how these important patterns fit into the software development process, and how you can leverage them to solve your own design problems most efficiently.");
		b11.setTotalPages(416);
		
		bookDao.createMany(b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11);

	}

}
