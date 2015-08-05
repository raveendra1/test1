

/**
 * Created by ravee2 on 16/05/2015.
 */
public class Note {
    private long id;
    private String title;
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    // Will be used by the ArrayAdapter in the ListView
    @Override
    public String toString() {
        return title +" , "+description;
    }

}