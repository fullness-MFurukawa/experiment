package jp.co.fullness.mybatis.driver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import jp.co.fullness.mybatis.entity.Item;
import jp.co.fullness.mybatis.repository.ItemRepository;

@Component
public class ItemTest1 implements Driver {

    @Autowired
    private ItemRepository itemRepository;

    @Transactional(readOnly = true)
    @Override
    public void execute() {
       List<Item> items = itemRepository.selectAll();
       items.forEach(System.out::println);
    }
    
}
