
package domain;

import java.io.Serializable;

/**
 *
 * @author Nathan Ryan
 */
public class Note implements Serializable {
    
    String title;
    String contents;
    
    public Note() {
        title = "";
        contents = "";
    }
    
    public Note(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setContents(String contents) {
        this.contents = contents;
    }
    
    public String getContents() {
        return contents;
    }
    
}
