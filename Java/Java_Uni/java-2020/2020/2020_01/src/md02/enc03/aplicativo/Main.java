package md02.enc03.aplicativo;

public class Main {

	public static void main(String[] args) {
		// Atividade N° 2
		System.out.println("++++++++++ ATIVIDADE N° 02 ++++++++++++");
		Cachorro c = new Cachorro("Vira-lata", 1);
		Cavalo cv = new Cavalo("Mangalarga Marchador", 2);
		Preguica p = new Preguica("Preguiça Comum", 5);

		c.emitirSom();
		cv.emitirSom();
		p.emitirSom();

		// Atividade NÂ° 3
		System.out.println("\n++++++++++ ATIVIDADE N° 03 +++++++++++");
		Veterinario v = new Veterinario();
		v.examinar((Animal) c);
		v.examinar((Animal) cv);
		v.examinar((Animal) p);

		// Atividade NÂ° 4
		System.out.println("\n+++++++++++ ATIVIDADE N° 04 +++++++++++");
		Cavalo cv2 = new Cavalo("Manga Larga", 5);
		Cavalo cv3 = new Cavalo("Marchador", 3);
		Cavalo cv4 = new Cavalo("Pampa", 1);
		Cachorro c2 = new Cachorro("Pit Bull", 1);
		Cachorro c3 = new Cachorro("Krikri", 2);
		Preguica p2 = new Preguica("Trepadeira", 3);
		Preguica p3 = new Preguica("Dalva", 5);

		Zoologico fogoAlto = new Zoologico();
		fogoAlto.setJaula(new Animal[] { c, cv, p, cv2, p2, cv3, c2, p3, c3, cv4 });

		int a = 1;
		for (Animal jaulaIndividual : fogoAlto.getJaula()) {
			System.out.println("---------- Jaula " + (a) + " -----------");
			a++;
			jaulaIndividual.emitirSom();
			if ((jaulaIndividual instanceof Cachorro))
				((Cachorro) jaulaIndividual).correr();

			if ((jaulaIndividual instanceof Cavalo))
				((Cavalo) jaulaIndividual).correr();

		}

	}

}
