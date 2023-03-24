package com.example.Library.web;

import com.example.Library.data.AuthorRepository;
import com.example.Library.data.BookRepository;
import com.example.Library.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("reservationOfBook")

public class BookReservationController {

    @GetMapping
    public String showDesignForm() {
        return "reservationOfBook";
    }

//    @ModelAttribute(name = "all_books")


}
