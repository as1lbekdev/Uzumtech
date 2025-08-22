package uz.pdp.library.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.UUID;
@Getter
@Setter
@ToString
public class Library {
    private UUID bookId;
    private  String bookName;
    private String aboutBook;
    private String author;

}
