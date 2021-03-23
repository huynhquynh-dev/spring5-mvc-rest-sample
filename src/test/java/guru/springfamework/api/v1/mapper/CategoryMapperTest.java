package guru.springfamework.api.v1.mapper;

import guru.springfamework.api.v1.model.CategoryDTO;
import guru.springfamework.domain.Category;
import junit.framework.TestCase;
import org.junit.Test;

public class CategoryMapperTest extends TestCase {

    private static final String NAME = "Spring";
    private static final Long ID = 1L;

    CategoryMapper categoryMapper = CategoryMapper.INSTANCE;

    public void setUp() throws Exception {
        super.setUp();
    }

    @Test
    public void testCategoryToCategoryDTO() {

        //given
        Category category = new Category();
        category.setName(NAME);
        category.setId(ID);

        //when
        CategoryDTO categoryDTO = categoryMapper.categoryToCategoryDTO(category);

        //then
        assertEquals(Long.valueOf(ID), categoryDTO.getId());
        assertEquals(NAME, categoryDTO.getName());
    }
}