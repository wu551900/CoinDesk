package cn.citybank.coindesk.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name="bpi")
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Bpi {

    @Id
    @Column(name = "bpi_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bpi_id;

    @Column(name = "updated")
    private LocalDateTime updated;

    @Column(name = "updatedISO")
    private LocalDateTime updatedISO;

    @Column(name = "updateduk")
    private LocalDateTime updateduk;

    @Column(name = "code_name")
    private String codeName;

    @Column(name = "symbol")
    private String symbol;

    @Column(name = "rate")
    private Double rate;

    @Column(name = "description")
    private String description;

    @Column(name = "rate_float")
    private Double rateFloat;
}
