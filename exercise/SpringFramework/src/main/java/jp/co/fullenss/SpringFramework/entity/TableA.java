package jp.co.fullenss.SpringFramework.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "table_a")
public class TableA {
    @Id
    private int         a;
    private String      b;
    private LocalDate   c;
}
