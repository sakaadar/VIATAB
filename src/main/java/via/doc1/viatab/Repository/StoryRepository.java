package via.doc1.viatab.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import via.doc1.viatab.Model.Story;

@Repository
public interface StoryRepository extends JpaRepository<Story,Integer>
{

}
