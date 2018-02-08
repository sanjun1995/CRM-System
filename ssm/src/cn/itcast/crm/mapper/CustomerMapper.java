package cn.itcast.crm.mapper;

import cn.itcast.crm.pojo.Customer;
import cn.itcast.crm.pojo.QueryVo;

import java.util.List;

public interface CustomerMapper {
    /**
     *  根据queryVo分页查询数据
     *
     *  @param queryVo
     *  @return
     */
    List<Customer> queryCustomerByQueryVo(QueryVo queryVo);

    /**
     *  根据queryVo查询数据条数
     *
     *  @param queryVo
     *  @return
     */
    int queryCountByQueryVo(QueryVo queryVo);

    /**
     *  根据id查询用户
     *
     *  @param id
     *  @return
     */
    Customer queryCustomerById(Long id);

    /**
     *  根据id编辑客户
     *
     *  @param customer
     */
    void updateCustomerById(Customer customer);

    /**
     *  根据id删除用户
     *
     *  @param id
     */
    void deleteCustomerById(Long id);
}
