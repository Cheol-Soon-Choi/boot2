package com.example.boot2.repository;

import com.example.boot2.dto.ItemSearchDto;
import com.example.boot2.dto.MainItemDto;
import com.example.boot2.entity.Item;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ItemRepositoryCustom {

    Page<Item> getAdminItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

    Page<MainItemDto> getMainItemPage(ItemSearchDto itemSearchDto, Pageable pageable);

}