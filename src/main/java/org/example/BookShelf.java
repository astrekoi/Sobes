package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BookShelf {
    private static final int NUMBER_SELVES = 5;

    public List<List<String>> distributeBook(List<String> books){

        List<List<String>> shelves = new ArrayList<>();
        for(int i = 0; i < NUMBER_SELVES; i++){
            shelves.add(new ArrayList<>());
        }

        Collections.sort(books);
        int shelfIndex = 0;
        for (String book : books ){
            shelves.get(shelfIndex).add(book);
            shelfIndex = (shelfIndex + 1) % NUMBER_SELVES;
        }

        return shelves;
    }

}
