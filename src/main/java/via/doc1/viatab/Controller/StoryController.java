package via.doc1.viatab.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import via.doc1.viatab.Model.Story;
import via.doc1.viatab.Repository.StoryRepository;
import via.doc1.viatab.Service.StoryService;

import java.util.List;

@RestController
@RequestMapping("api/stories")
public class StoryController
{
  @Autowired
  private StoryService service;

  @GetMapping
  public List<Story> getAllStories()
  {
    return service.getAllStories();
  }
  @GetMapping("/id")
  public Story getStory(@PathVariable int id)
  {
   return service.getStoryById(id);
  }
  @PostMapping public Story createStory(@RequestBody Story story)
  {
    return service.addStory(story);
  }
}
