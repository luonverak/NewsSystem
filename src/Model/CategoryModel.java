package Model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter

public class CategoryModel {

    
    private String table = "category";
    private int id;
    private String categoryTitle;

    public CategoryModel(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public CategoryModel(int id, String categoryTitle) {
        this.id = id;
        this.categoryTitle = categoryTitle;
    }

  
}
