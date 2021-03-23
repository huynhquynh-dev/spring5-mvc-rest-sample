package guru.springfamework.bootstrap;

import guru.springfamework.domain.Category;
import guru.springfamework.repositories.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    CategoryRepository categoryRepository;

    public DataLoader(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Category spring1 = new Category();
        spring1.setName("Spring");

        Category spring2 = new Category();
        spring2.setName("Framework");

        Category spring3 = new Category();
        spring3.setName("Boot");

        Category spring4 = new Category();
        spring4.setName("Security");

        Category spring5 = new Category();
        spring5.setName("Core");

        categoryRepository.save(spring1);
        categoryRepository.save(spring2);
        categoryRepository.save(spring3);
        categoryRepository.save(spring4);
        categoryRepository.save(spring5);

        System.out.println("Data loader: " + categoryRepository.count());
    }
}
