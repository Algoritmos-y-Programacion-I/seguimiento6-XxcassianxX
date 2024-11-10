package model;

abstract class Specie {
	protected String name;
	protected String scientificName;

	public Specie(String name, String scientificName) {
		this.name = name;
		this.scientificName = scientificName;
	}

	public String getName() {
		return name;
	}

	public String getCientificName() {
		return scientificName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCientificName(String cientificName) {
		this.scientificName = cientificName;
	}

	public abstract void showDetail(); // Método abstracto para mostrar detalles específicos
}
