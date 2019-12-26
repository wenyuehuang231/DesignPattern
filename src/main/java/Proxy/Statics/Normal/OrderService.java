package Proxy.Statics.Normal;

/**
 * @author : Mr.Huang
 * @date : 2019/12/26 14:25
 */
public class OrderService implements IOrderService {

    private OrderDao orderDao;

    public OrderService(){
        orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderService 调用 orderDao 创建订单");
        return orderDao.insert(order);
    }

}
