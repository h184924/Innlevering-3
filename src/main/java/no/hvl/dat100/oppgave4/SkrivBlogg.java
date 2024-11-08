package no.hvl.dat100.oppgave4;
import java.io.*;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		File file = new File(mappe, filnavn);

		try(BufferedWriter skriver = new BufferedWriter(new FileWriter(filnavn))){
			skriver.write(samling.toString());
			return true;
		} catch (IOException e) {
			return false;
		}
	}
}
