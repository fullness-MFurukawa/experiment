package jp.co.fullenss.SpringFramework.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.fullenss.SpringFramework.entity.TableA;
import jp.co.fullenss.SpringFramework.repository.TableARepository;
import java.util.List;

@Service
@Transactional
public class Exercise04Service {
    
    private TableARepository tableARepository;
    public Exercise04Service(TableARepository tableARepository) {
        this.tableARepository = tableARepository;
    }

    public void Create(TableA tableA){
        tableARepository.save(tableA);
    }

    @Transactional(readOnly = true)
    public List<TableA> GetAll() {
        return tableARepository.findAll();
    }

}
