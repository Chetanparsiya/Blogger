package com.unborn.blogger.datatransferobject;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CategoryDto {

    private Long categoryId;
    private String categoryTitle;
    private String categoryDescription;
}
