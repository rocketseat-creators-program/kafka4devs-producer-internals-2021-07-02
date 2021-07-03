package com.anabneri.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class BookStoreEvent {

    // first step
    private Integer bookStoreEventId;
    private BookStoreEventType bookStoreEventType;
    private Book book;

}
