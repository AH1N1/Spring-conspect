package AH1N1.controller;

import AH1N1.entity.Hotel;
import AH1N1.entity.repository.HotelsRepository;
import org.springframework.stereotype.Service;

/**
 * Created by RENT on 2017-01-24.
 */
@Service
public class BasicSearchService {
    private final HotelsRepository hotelsRepository;

    public BasicSearchService(HotelsRepository hotelsRepository) {
        this.hotelsRepository = hotelsRepository;
    }

    public Hotel findById(Long id) {


        return hotelsRepository.findOne(id);
    }
}
