package com.geography.worldgeography;

public class Universe {
	Universe uni1=new Universe();
	public static void main(String[] args) {
		Universe uni=new Universe();
		uni.galaxy();
		
	}
	public void galaxy() {
		System.out.println("Our Galaxy: Milky Way");
		System.out.println("Nearest Galaxy : Andromeda");
		System.out.println("Latest Known Galaxy: Dwarf Galaxy");
		System.out.println("Neutron Star:- star having diameter of 20kmand mass is 1.4times greater than sun");
		System.out.println("Brightest Star outside solar system:- Sirius/dogstar");
		System.out.println("Proxima centuria is nearest star to our solar system after that alpha centuria after that barnard star ");
		System.out.println("Black Hole:- when the stars die");
		System.out.println("chandrashekhar limit:-upper limit of any star can be 1.44 time the mass of sun");
		System.out.println("LIght year:9.46*10^12Km");
		System.out.println("Parsec:- 3.42 light year");
		System.out.println("1 asteronomical unit:- 150 * 10^6 km i.e 150 million km");
		solarSystem();
		uni1.solarTerms();
		
	}
	public static void solarSystem() {
		System.out.println("Solar system is sun with its 8 planet");
		System.out.println("All planet revolve around sun in elliptical paths");
		System.out.println("End of solar system is 122AU from the sun");
		System.out.println("5 Dwarf planet:- ceres,pluto,eris,MakeMake and haumea");
		
		sun();
		
	}
	public static void sun() {
		System.out.println("Sun is the centre of solar system and it has 99% mass of the solar system");
		System.out.println("Source of energy for sun is nuclear fusion: 2hydrogen convert to helium");
		System.out.println("surface of sun:- photosphere(middle of sun hottest zone),chromosphere:-red color,Corona:- that we see in eclipse");
		System.out.println("temp of sun suface:-6000degree celsius");
		System.out.println("224million year is the time taken by sun to revlove around the milky way centre");
		System.out.println("sun is bigger than earth by 1.3 million time and time taken by light to reach is 8min 16.6 sec");
		System.out.println("sun to earth distance is 149.6 million km");
		//uni1.solarTerms();
		
		
	}
	public void solarTerms() {
		System.out.println("solar wind:- emitting photon in all direction and solar flare:-bouts of incandescent material");
		System.out.println("Aurora:- photon get trap in earths magnetic field. 2aurora are there 1.Borelis aurora 2.australis aurora");
		System.out.println("Plages:-Bright spots on the chromosphere  and sunspots:-dark region");
	}
	
}