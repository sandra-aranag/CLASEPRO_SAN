package model;


import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Libro implements Serializable {

    @SerializedName("id")
    private int id;

    @SerializedName("Year")
    private int year;

    @SerializedName("Title")
    private String title;

    private String handle;

    @SerializedName("Publisher")
    private String publisher;

    @SerializedName("ISBN")
    private String isbn;

    @SerializedName("Pages")
    private int pages;

    @Override
    public String toString() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                getId(),
                getYear(),
                getTitle(),
                getHandle(),
                getPublisher(),
                getIsbn(),
                getPages());
    }
}
