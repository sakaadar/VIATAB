package via.doc1.viatab.Service;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import via.doc1.viatab.Model.Story;
import via.doc1.viatab.Repository.StoryRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class StoryService
{
  @Autowired
  private StoryRepository storyRepo;

  public Story getStoryById(int id)
  {
    return storyRepo.findById(id).orElseThrow(() -> new RuntimeException("Story not found"));

  }
  public List<Story> getAllStories(){
    return storyRepo.findAll();
  }

  public Story addStory(Story story)
  {
    return storyRepo.save(story);
  }

  public void deleteStoryById(int id)
  {
    try{
      if(storyRepo.existsById(id))
      {
         storyRepo.deleteById(id);
      }
    } catch (Exception e)
    {
     System.out.println(e.getMessage());
    }
  }
}
