package jp.co.fullenss.SpringFramework.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.fullenss.SpringFramework.entity.TableA;

public interface TableARepository  extends JpaRepository<TableA,Integer>{
    
}
