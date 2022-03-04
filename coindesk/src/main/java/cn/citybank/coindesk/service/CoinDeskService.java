package cn.citybank.coindesk.service;

import cn.citybank.coindesk.model.Bpi;
import cn.citybank.coindesk.vo.BpiVO;

import java.util.List;

public interface CoinDeskService {

    Bpi saveBpi(BpiVO bpiVO);

    BpiVO updateBpi();
}
