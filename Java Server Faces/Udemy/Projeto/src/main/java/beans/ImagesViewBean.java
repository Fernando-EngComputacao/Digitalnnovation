
import java.util.*;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class ImagesViewBean {

    private List<String> images;

    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        for (int i = 1; i <= 11; i++) {
            images.add("hotel" + i + ".jpg");
        }
    }

    public List<String> getImages() {
        return images;
    }
}