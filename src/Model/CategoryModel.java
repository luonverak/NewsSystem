
package Model;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter

public class CategoryModel {
    
    private String table= "category";
    private String categoryTitle;

    public CategoryModel(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }
    
}
