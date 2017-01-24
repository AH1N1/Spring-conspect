package AH1N1.controller;

import AH1N1.entity.Hotel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.GeneratedValue;

/**
 * Created by RENT on 2017-01-24.
 */
@RestController
public class HotelsController {
    private final BasicSearchService basicSearchService;

    public HotelsController(BasicSearchService basicSearchService) {
        this.basicSearchService = basicSearchService;
    }

    @GetMapping("{id}")
    public Hotel view(@PathVariable Long id) {


        return basicSearchService.findById(id);
    }
}
