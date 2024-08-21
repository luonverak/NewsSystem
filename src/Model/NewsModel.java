package Model;
 
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter

public class NewsModel {

    private int id;
    private String title;
    private String description;
    private String thumbnail;
    private int categoryId; 
    private int userId;
    private String category;
    private String user;

    public NewsModel(String title, String description, String thumbnail, int categoryId, int userId) {
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.categoryId = categoryId;
        this.userId = userId;
    }

    public NewsModel(int id, String title, String description, String thumbnail, String category, String user) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.category = category;
        this.user = user;
    }

   

    @Override
    public String toString() {
        return "NewsModel{" + "id=" + id + ", title=" + title + ", description=" + description + ", thumbnail=" + thumbnail + ", categoryId=" + categoryId + ", userId=" + userId + '}';
    }

    
}
