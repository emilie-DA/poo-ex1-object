

public class City {
		// Atrtributs
		public String nameCity;
		public String country;
		public int nbinhabitants;
		
		// le constructeur (objet)
		public City(String nameCity, String country, int nbinhabitants) {
			super();
			this.nameCity = nameCity;
			this.country = country;
			this.nbinhabitants = nbinhabitants;
		}
		
		
		//accesseurs
		public String getNameCity() {
			return nameCity;
		}

		public void setNameCity(String nameCity) {
			this.nameCity = nameCity;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public int getNbinhabitants() {
			return nbinhabitants;
		}

		public void setNbinhabitants(int nbinhabitants) {
			this.nbinhabitants = nbinhabitants;
		}
		//méthodes
				public void cityVue() {
					System.out.println("Nom de la vile  :" +  this.nameCity + "\t" + 
												"pays :" +  this.country + "\t" +
												"Nombres d'habitent :" +  this.nbinhabitants );
				}
}
