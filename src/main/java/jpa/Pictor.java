package jpa;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="PICTOR")
public class Pictor {
	 private String nume, nastere, moarte, biografie;

		public String getBiografie() {
			return biografie;
		}

		public void setBiografie(String biografie) {
			this.biografie = biografie;
		}

		public String getMoarte() {
			return moarte;
		}

		public void setMoarte(String moarte) {
			this.moarte = moarte;
		}

		public String getNume() {
			return nume;
		}

		public void setNume(String nume) {
			this.nume = nume;
		}
		@Override
		public String toString() {
			return nume+ " s-a nascut la "+ nastere+" si a murit la "+moarte+".  "+biografie;
		}

}
