# spring-cloud-alibaba-seata-demo

## 说明

该案例有三个服务：

- seata-order-service2001 订单服务
- seata-storage-service2002 库存服务
- seata-account-service2003 账户服务

当用户下单时，会在订单服务中创建一个订单，然后通过远程调用库存服务来扣减下单商品的库存，再通过远程调用账户服务来扣减用户账户里面的余额，最后在订单服务中修改订单状态为已完成。

简单来说：
下订单->减库存->减余额->改状态

对应三张表的sql文件已包含在demo中

测试api地址：http://localhost:2001/order/create?userId=1&productId=1&count=10&money=100

## 问题

当我在账户服务中加入一个除0异常，订单和库存表并不能正常回滚？