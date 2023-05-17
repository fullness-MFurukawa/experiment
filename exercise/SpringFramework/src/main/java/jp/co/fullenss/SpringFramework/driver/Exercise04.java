package jp.co.fullenss.SpringFramework.driver;

import java.time.LocalDate;
import org.springframework.stereotype.Component;

import jp.co.fullenss.SpringFramework.entity.TableA;
import jp.co.fullenss.SpringFramework.service.Exercise04Service;

@Component
public class Exercise04 implements Driver{

    private Exercise04Service exercise04Service;
    public Exercise04(Exercise04Service exercise04Service) {
        this.exercise04Service = exercise04Service;
    }

    @Override
    public void execute() {
        TableA tableA = new TableA(2 , "テストデータ-B", LocalDate.now());
        exercise04Service.Create(tableA);
    }
    
}
