package ManageBeans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;


@ManagedBean
public class imagesView {
     
    private List<String> images;
    private List<String> images2;
    private List<String> images3;
    private List<String> images4;
    
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        images2 = new ArrayList<String>();
        images3 = new ArrayList<String>();
        images4 = new ArrayList<String>();
        
        for (int i = 4; i <= 10; i++) {
            images.add("tshirt" + i + ".jpg");
        }
        
        for(int i=4;i<=6 ;i++) {
        	images2.add("Girl" + i + ".jpg");
        }
        
        for(int i=1;i<=3 ;i++) {
        	images3.add("Girl" + i + ".jpg");
        }
        
        for(int i=5;i<=6 ;i++) {
        	images4.add("Boy" + i + ".jpg");
        }
    }
    
    public List<String> getImages() {
        return images;
    }
    
    public List<String> getImages2(){
    	return images2;
    }
    
    public List<String> getImages3(){
    	return images3;
    }
    
    public List<String> getImages4(){
    	return images4;
    }
}