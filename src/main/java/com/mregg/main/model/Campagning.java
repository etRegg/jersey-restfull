package com.mregg.main.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Campagning {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	private String name;
	private String texto;
	public Long getId() {
		return id;
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	 public boolean equals(Object obj) {
	      if (obj == null) return false;
	      if (!this.getClass().equals(obj.getClass())) return false;

	      Campagning obj2 = (Campagning)obj;
	      if((this.id == obj2.getId()) && (this.name.equals(obj2.getName()))) {
	         return true;
	      }
	      return false;
	   }
	   
	   public int hashCode() {
	      int tmp = 0;
	      tmp = ( id + name ).hashCode();
	      return tmp;
	   }
}
