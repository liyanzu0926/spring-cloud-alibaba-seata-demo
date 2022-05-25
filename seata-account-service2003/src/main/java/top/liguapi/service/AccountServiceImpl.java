package top.liguapi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import top.liguapi.mapper.AccountMapper;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class AccountServiceImpl implements AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountServiceImpl.class);


    @Resource
    AccountMapper accountMapper;

    /**
     * 扣减账户余额
     */
    @Override
    public void decrease(Long userId, BigDecimal money) {
        LOGGER.info("------->account-service中扣减账户余额开始");
        int i = 1 / 0;
        accountMapper.decrease(userId, money);
        LOGGER.info("------->account-service中扣减账户余额结束");
    }
}
