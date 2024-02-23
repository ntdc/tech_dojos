package com.ntatc.katas.mars;

public enum Direction {

	NORD(new Mouvement2DNord()), SUD(new Mouvement2DSud()), OUEST(new Mouvement2DOuest()), EST(new Mouvement2DEst());

	private final Mouvement2D mouvement2D;

	Direction(Mouvement2D mouvement2D){
		this.mouvement2D = mouvement2D;
	}


	public Mouvement2D getMouvement2D(){
		return this.mouvement2D;
	}

}