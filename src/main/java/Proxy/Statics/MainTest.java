package Proxy.Statics;

import Proxy.Statics.Normal.IOrderService;
import Proxy.Statics.Normal.Order;
import Proxy.Statics.Normal.OrderService;
import Proxy.Statics.Proxy.OrderServiceStaticProxy;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author : Mr.Huang
 * @date : 2019/12/26 14:36
 */
public class MainTest {
    public static void main(String[] args) {
        try {
            Order order = new Order();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2017/02/01");
            order.setCreateTime(date.getTime());
            IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
            orderService.createOrder(order);
        }catch (Exception e){
            e.printStackTrace();;
        }
    }
}
