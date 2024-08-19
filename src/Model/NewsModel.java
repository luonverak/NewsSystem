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
    private int categoryId; // foreign key
    private int userId; // foreign key

    public NewsModel(String title, String description, String thumbnail, int categoryId, int userId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.thumbnail = thumbnail;
        this.categoryId = categoryId;
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "NewsModel{" + "id=" + id + ", title=" + title + ", description=" + description + ", thumbnail=" + thumbnail + ", categoryId=" + categoryId + ", userId=" + userId + '}';
    }

    
}
