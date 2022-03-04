package cn.citybank.coindesk.Repository;

import cn.citybank.coindesk.model.Bpi;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BpiRepository extends CrudRepository <Bpi,Integer>{


}
