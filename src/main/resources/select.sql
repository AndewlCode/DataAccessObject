select public.orders.product_name from public.customers
join orders on customers.id = orders.customer_id
where lower(customers.name) = lower(:name);