package cn.itcast.crm.service.impl;

import cn.itcast.crm.mapper.CustomerMapper;
import cn.itcast.crm.pojo.Customer;
import cn.itcast.crm.pojo.QueryVo;
import cn.itcast.crm.service.CustomerService;
import cn.itcast.crm.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Page<Customer> queryCustomerByQueryVo(QueryVo queryVo) {
        // 设置查询条件，从哪一条数据开始查
        queryVo.setStart((queryVo.getPage() - 1) * queryVo.getRows());

        //查询数据结果集
        List<Customer> list = customerMapper.queryCustomerByQueryVo(queryVo);

        //查询到的数据总条数
        int total = customerMapper.queryCountByQueryVo(queryVo);

        //封装返回的Page对象
        Page<Customer> page = new Page<Customer>(total, queryVo.getPage(), queryVo.getRows(), list);

        return page;
    }

    @Override
    public Customer queryCustomerById(Long id) {
        Customer customer = customerMapper.queryCustomerById(id);
        return customer;
    }

    @Override
    public void updateCustomerById(Customer customer) {
        customerMapper.updateCustomerById(customer);
    }

    @Override
    public void deleteCustomerById(Long id) {
        customerMapper.deleteCustomerById(id);
    }
}
