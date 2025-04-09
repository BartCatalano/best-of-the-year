package org.lesson.java.thymeleaf.best_of_the_year.classi;

public class Movie {
    private int id;
   private String titolo;

// creo il costruttore
public Movie (int id, String titolo){
    this.id = id;
    this.titolo = titolo;
  }

//   creo getter e setter

  public void setTitolo(String titolo){
    this.titolo = titolo;
  }
  public String getTitolo(){
    return this.titolo;
  }
    
  public void setId(int id){
    this.id = id;
  }
  public int getId(){
    return this.id;
  }



}
