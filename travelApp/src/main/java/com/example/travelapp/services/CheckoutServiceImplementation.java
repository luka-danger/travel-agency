package com.example.travelapp.services;

import com.example.travelapp.dao.CartRepository;
import com.example.travelapp.dao.CustomerRepository;
import com.example.travelapp.entities.Cart;
import com.example.travelapp.entities.CartItem;
import com.example.travelapp.entities.Customer;
import com.example.travelapp.entities.StatusType;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImplementation implements CheckoutService{

    private CustomerRepository customerRepository;

    private CartRepository cartRepository;

    public CheckoutServiceImplementation(CustomerRepository customerRepository, CartRepository cartRepository) {
        this.customerRepository = customerRepository;
        this.cartRepository = cartRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {
        // retrieve cart info
        Cart cart = purchase.getCart();

        // generate tracking number
        String orderTrackingNumber = generateOrderTrackingNumber();
        cart.setOrderTrackingNumber(orderTrackingNumber);

        // populate cart with cartItems
        Set<CartItem> cartItems = purchase.getCartItems();
        cartItems.forEach(item -> cart.add(item));

        // populate cart with customer and cart items
        cart.setCustomer(purchase.getCustomer());
        cart.setCartItems(purchase.getCartItems());

        // populate customer with cart
        Customer customer = purchase.getCustomer();
        customer.add(cart);

        // save to the database
        customerRepository.save(customer);
        cartRepository.save(cart);

        // Set Cart Status to Ordered
        cart.setStatus(StatusType.ORDERED);

        // return a response
        return new PurchaseResponse(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber() {

        // generate a random UUID number (UUID version-4)
        // (Universally Unique Identifier)
        return UUID.randomUUID().toString();
    }
}
