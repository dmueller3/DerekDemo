package edu.matc.persistence;

import edu.matc.entity.Order;
import edu.matc.entity.User;
import edu.matc.util.Database;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderDaoTest {

    OrderDao orderDao;

    @BeforeEach
    void setUp() {
        Database database = Database.getInstance();
        database.runSQL("cleanDB.sql");
        orderDao = new OrderDao();
    }

    @Test
    void getById() {
        Order retrievedOrder = orderDao.getById(1);
        assertNotNull(retrievedOrder);
        assertEquals("party supplies", retrievedOrder.getDescription());
        assertEquals(3, retrievedOrder.getUser().getId());
    }

    @Test
    void update() {
        Order order = orderDao.getById(1);
        order.setDescription("pool noodles");
        orderDao.update(order);
        Order retrievedOrder = orderDao.getById(1);
        assertEquals("pool noodles", retrievedOrder.getDescription());
    }

    @Test
    void insert() {
        // Get a user
        UserDao userDao = new UserDao();
        User user = userDao.getById(6);
        // Create an order with that user
        Order order = new Order("fun things", user);
        // Insert the order
        orderDao.insert(order);
        // Retrieve the order
        Order retrievedOrder = orderDao.getById(order.getId());
        // Verify
        assertNotNull(retrievedOrder);
        assertEquals("fun things", retrievedOrder.getDescription());
        assertEquals("Dawn", retrievedOrder.getUser().getFirstName());
    }

    @Test
    void delete() {
        orderDao.delete(orderDao.getById(4));
        assertNull(orderDao.getById(4));
    }

    @Test
    void getAll() {
        List<Order> orders = orderDao.getAll();
        assertEquals(4, orders.size());
    }

    @Test
    void getByPropertyEqual() {
    }

    @Test
    void getByPropertyLike() {
    }
}