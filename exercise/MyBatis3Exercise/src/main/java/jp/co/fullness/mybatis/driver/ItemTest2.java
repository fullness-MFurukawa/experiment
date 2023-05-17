package jp.co.fullness.mybatis.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import jp.co.fullness.mybatis.entity.Item;
import jp.co.fullness.mybatis.repository.ItemRepository;

@Component
public class ItemTest2 implements Driver{

    private ItemRepository itemRepository;

    @Autowired
    public ItemTest2(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public void execute() {
        Item item = itemRepository.selectById(2);
        System.out.println(item);
    }
    
}
