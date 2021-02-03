package com.fastcode.dvdrental.application.core.inventory;

import com.fastcode.dvdrental.application.core.inventory.dto.*;
import com.fastcode.dvdrental.domain.core.film.FilmEntity;
import com.fastcode.dvdrental.domain.core.inventory.InventoryEntity;
import java.time.*;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IInventoryMapper {
    InventoryEntity createInventoryInputToInventoryEntity(CreateInventoryInput inventoryDto);

    @Mappings(
        {
            @Mapping(source = "entity.film.filmId", target = "filmId"),
            @Mapping(source = "entity.film.filmId", target = "filmDescriptiveField"),
        }
    )
    CreateInventoryOutput inventoryEntityToCreateInventoryOutput(InventoryEntity entity);

    InventoryEntity updateInventoryInputToInventoryEntity(UpdateInventoryInput inventoryDto);

    @Mappings(
        {
            @Mapping(source = "entity.film.filmId", target = "filmId"),
            @Mapping(source = "entity.film.filmId", target = "filmDescriptiveField"),
        }
    )
    UpdateInventoryOutput inventoryEntityToUpdateInventoryOutput(InventoryEntity entity);

    @Mappings(
        {
            @Mapping(source = "entity.film.filmId", target = "filmId"),
            @Mapping(source = "entity.film.filmId", target = "filmDescriptiveField"),
        }
    )
    FindInventoryByIdOutput inventoryEntityToFindInventoryByIdOutput(InventoryEntity entity);

    @Mappings({ @Mapping(source = "foundInventory.inventoryId", target = "inventoryInventoryId") })
    GetFilmOutput filmEntityToGetFilmOutput(FilmEntity film, InventoryEntity foundInventory);
}
