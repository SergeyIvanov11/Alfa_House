package org.alfa.alfa_house.controller;

import lombok.RequiredArgsConstructor;
import org.alfa.alfa_house.model.Flat;
import org.alfa.alfa_house.model.FlatEntity;
import org.alfa.alfa_house.request.FlatRequest;
import org.alfa.alfa_house.service.DefaultFlatService;
import org.alfa.alfa_house.service.FlatToDtoMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController()
@RequestMapping("/flats")
@RequiredArgsConstructor
public class FlatController {
    private final DefaultFlatService flatService;
    private final FlatToDtoMapper mapper;

    @GetMapping("/{id}")
    public Flat getFlatById(@PathVariable UUID id) {
        return flatService.getFlatById(id);
    }

    @GetMapping
    public List<Flat> getAllFlats() {
        return flatService.getAllFlats();
    }

    @PostMapping
    public void addFlat(@RequestBody FlatRequest request) {
        flatService.addFlat(mapper.flatRequestToFlat(request));
    }

    @GetMapping("/by-room-count")
    public ResponseEntity<List<FlatEntity>> findAllByRoomCountContaining(@RequestParam("roomCount") int roomCount) {
        return ResponseEntity.ok(flatService.findAllByRoomCountContaining(roomCount));
    }

    @GetMapping("/cheaper-than")
    public ResponseEntity<List<FlatEntity>> findByPriceLessThanOrderByPriceAsc(@RequestParam("price") long price) {
        return ResponseEntity.ok(flatService.findByPriceLessThanOrderByPriceAsc(price));
    }


}
