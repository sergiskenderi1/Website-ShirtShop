package ManageBeans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class imagesView {
     
    private List<String> images;
     
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        for (int i = 4; i <= 10; i++) {
            images.add("tshirt" + i + ".jpg");
        }
    }
    
    public List<String> getImages() {
        return images;
    }
}