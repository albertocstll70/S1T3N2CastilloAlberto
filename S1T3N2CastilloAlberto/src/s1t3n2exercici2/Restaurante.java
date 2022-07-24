package s1t3n2exercici2;

import java.util.Objects;

@SuppressWarnings("rawtypes")
public class Restaurante implements Comparable {
	private String nombre;
	private int puntuacion;

	public Restaurante(String nombre, int puntuacion) {

		this.nombre = nombre;
		this.puntuacion = puntuacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	@Override
	public int compareTo(Object obj) {

		Restaurante other = (Restaurante) obj;
		if (this.nombre.equals(other.nombre) && this.puntuacion == other.puntuacion) {

			return 0;
		} else if (other.puntuacion > this.puntuacion) {
			return 1;
		} else {

			return -1;

		}

	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Restaurante) {
			Restaurante other = (Restaurante) obj;
			if (this.nombre.equals(other.nombre) && this.puntuacion == other.puntuacion) {

				return true;
			} else {
				return false;
			}

		} else {

			return false;
		}

	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Restaurante other = (Restaurante) obj;
//		return Objects.equals(nombre, other.nombre) && puntuacion == other.puntuacion;
//	}

	@Override
	public int hashCode() {
		return Objects.hash(nombre, puntuacion);
	}

	@Override
	public String toString() {
		return "Restaurante [nombre=" + nombre + ", puntuacion=" + puntuacion + "]";
	}

}
