package cn.citybank.coindesk.vo;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BpiVO {

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String updated;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String updatedISO;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String updateduk;

    @NotNull(message = "不得為空")
    @JsonProperty("code")
    private String codeName;

    @NotNull(message = "不得為空")
    private String symbol;

    @NotNull(message = "不得為空")
    private Double rate;

    @NotNull(message = "不得為空")
    private String description;

    @NotNull(message = "不得為空")
    @JsonProperty("rate_float")
    private Double rateFloat;

}
