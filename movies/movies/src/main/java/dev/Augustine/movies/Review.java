package dev.Augustine.movies;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {


    @Id
    private ObjectId Id;
    private String body;

    public Review(String body) {
        this.body = body;
    }
}
