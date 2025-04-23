package via.doc1.viatab.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Story {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public int id;
  public String title;
  public String content;
}
