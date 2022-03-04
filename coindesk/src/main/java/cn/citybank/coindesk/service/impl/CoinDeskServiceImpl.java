package cn.citybank.coindesk.service.impl;

import cn.citybank.coindesk.Repository.BpiRepository;
import cn.citybank.coindesk.model.Bpi;
import cn.citybank.coindesk.service.CoinDeskService;
import cn.citybank.coindesk.vo.BpiVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
@Slf4j
public class CoinDeskServiceImpl implements CoinDeskService {

    @Resource
    BpiRepository bpiRepository;

    @Override
    public Bpi saveBpi(BpiVO bpiVO) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        Bpi bpi=new Bpi()
                .setCodeName(bpiVO.getCodeName())
                .setDescription(bpiVO.getDescription())
                .setRate(bpiVO.getRate())
                .setRateFloat(bpiVO.getRateFloat())
                .setSymbol(bpiVO.getSymbol())
                .setUpdated(LocalDateTime.parse(bpiVO.getUpdated(),df))
                .setUpdated(LocalDateTime.parse(bpiVO.getUpdatedISO(),df))
                .setUpdated(LocalDateTime.parse(bpiVO.getUpdateduk(),df));
        bpi= bpiRepository.save(bpi);

        return bpi;
    }

    @Override
    public BpiVO updateBpi() {
        RestTemplate restTemplate=new RestTemplate();
        String url="https://api.coindesk.com/v1/bpi/currentprice.json";
        String bpiVO=restTemplate.getForObject(url,String.class);
        log.info("BpiVO:{}",bpiVO);
        return new BpiVO();
    }
}
