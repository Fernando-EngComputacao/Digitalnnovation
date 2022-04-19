package udemy.projeto;

import java.util.*;

/**
 *
 * @author Fernando Furtado
 */
public class ImagesView {
    private List<String> images;

    public void init() {
        images = new ArrayList<String>();
        for (int i = 1; i < 12; i++) {
            images.add("hotel" + i + ".jpg");
        }
    }

    public List<String> getImages() {
        init();
        return images;
    }
}


