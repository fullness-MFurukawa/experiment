package jp.co.fullenss.SpringFramework.driver;

import java.util.List;

import org.springframework.stereotype.Component;

import jp.co.fullenss.SpringFramework.entity.TableA;
import jp.co.fullenss.SpringFramework.service.Exercise04Service;

@Component
public class Exercise05 implements Driver{
    
    private Exercise04Service exercise04Service;
    public Exercise05(Exercise04Service exercise04Service) {
        this.exercise04Service = exercise04Service;
    }

    @Override
    public void execute() {
        List<TableA> result = exercise04Service.GetAll();        
        result.forEach(r -> System.out.println(r));
    }

}
