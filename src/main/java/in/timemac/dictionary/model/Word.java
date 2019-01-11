package in.timemac.dictionary.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@DynamoDBTable(tableName = "dict")
public class Word {



    @DynamoDBHashKey(attributeName = "wordItem")
    private String wordItem;
    private String category;
    private String meaning;

}

