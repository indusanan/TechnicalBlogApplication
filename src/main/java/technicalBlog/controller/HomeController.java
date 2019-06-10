package technicalBlog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import technicalBlog.model.Post;

import java.util.ArrayList;
import java.util.Date;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String getAllPosts(Model model) {


        ArrayList<Post> posts = new ArrayList<Post>();
        Post post = new Post();
        post.setTitle("Post ");
        post.setBody("Post  body");
        post.setDate(new Date());

        Post post1 = new Post();
        post1.setTitle("Post 1");
        post1.setBody("Post 1 body");
        post1.setDate(new Date());

        Post post2 = new Post();
        post2.setTitle("Post 2");
        post2.setBody("Post 2 body");
        post2.setDate(new Date());

        posts.add(post);
        posts.add(post1);
        posts.add(post2);

        model.addAttribute("posts", posts);


        return "index";


    }
}
