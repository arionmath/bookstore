package com.arionmathias.bookstore.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
public class Book implements Serializable {

	private static final long serialVersionUID = -732051171124891557L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "Title is required.")
	private String title;
	
	@Column(length = 1000)
	private String description;
	
	@NotNull(message = "Amount pages is a required.")
	private Integer totalPages;

	public String getDescriptionBriefly(){
		if(this.description==null) {
			return "";
		}
		if(this.description.length()<=100) {
			return this.description;
		}else {
			return this.description.substring(0, 99)+"...";
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
