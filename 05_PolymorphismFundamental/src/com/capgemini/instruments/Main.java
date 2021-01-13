package com.capgemini.instruments;

public class Main {

	public static void main(String[] args) {
		Instrument[] instruments = new Instrument[10];
		
		Piano piano = new Piano();
		Flute flute = new Flute();
		Guitar guitar = new Guitar();
		
		instruments[0] = piano;
		instruments[1] = flute;
		instruments[2] = guitar;
		instruments[3] = flute;
		instruments[4] = piano;
		instruments[5] = flute;
		instruments[6] = guitar;
		instruments[7] = flute;
		instruments[8] = guitar;
		instruments[9] = guitar;
		
		//instruments[0].play();
		/*for(int i=0; i<instruments.length; i++) {
			instruments[i].play();
		}*/
		
		//added in java5
		for(Instrument i:instruments) {
			 i.play();
		}
	}

}
