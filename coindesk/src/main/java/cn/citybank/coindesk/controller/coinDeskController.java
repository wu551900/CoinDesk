package cn.citybank.coindesk.controller;

import cn.citybank.coindesk.model.Bpi;
import cn.citybank.coindesk.service.CoinDeskService;
import cn.citybank.coindesk.util.R;
import cn.citybank.coindesk.vo.BpiVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
@RequestMapping("/v1/coin")
public class coinDeskController {

    @Resource
    CoinDeskService coinDeskService;

    @PostMapping("/save")
    public R<Bpi> save(@Validated BpiVO bpiVO, BindingResult result) {
        if (result.hasErrors()) {
            String message = result.getFieldErrors().toString();
            return R.unprocessableEntity(message);
        }
        log.info("BpiVO:{}", bpiVO);
        Bpi bpi = coinDeskService.saveBpi(bpiVO);
        return R.ok(bpi);
    }

    @GetMapping("/update")
    public R<BpiVO> update() {
        log.info("enter");
        BpiVO bpiVO = coinDeskService.updateBpi();
        return R.ok(bpiVO);
    }
}
