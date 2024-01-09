
public class TestCity {

	public static void main(String[] args) {
		
		City toulouse1 = new City("Toulouse","France",450000);
		City toulouse2 = new City("Bordeaux","France",350000);
		City toulouse3 = new City("Canne","France",550000);
		
		//affichage de la vile grace a la méthodes cityVue
		toulouse1.cityVue();
		toulouse2.cityVue();
		toulouse3.cityVue();
		
		toulouse1.nbinhabitants +=20000;
		toulouse1.cityVue();
	}
	
	

}
