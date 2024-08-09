package org.fundatec.apirestmongo.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Document(collection = "show")
public class Show {

    @Id
    private String id;
    private int show_id;
    private String location;
    private String date;
    private int available_tickets;

}
