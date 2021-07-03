package com.anabneri.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Book {

    // second step
    // class to model the book from friends
    private Integer bookId;
    private  String bookName;
    private String bookAuthor;

}
