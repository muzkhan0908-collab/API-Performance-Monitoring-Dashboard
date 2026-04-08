-- 🔹 Insert Users
INSERT INTO users (user_id, name, email, password, role)
VALUES (1, 'Admin', 'admin@gmail.com', '1234', 'ADMIN');

INSERT INTO users (user_id, name, email, password, role)
VALUES (2, 'User1', 'user1@gmail.com', '1234', 'USER');


-- 🔹 Insert APIs (linked to users)
INSERT INTO api (api_id, api_name, endpoint_url, method, user_id)
VALUES (1, 'Login API', '/login', 'POST', 1);

INSERT INTO api (api_id, api_name, endpoint_url, method, user_id)
VALUES (2, 'Payment API', '/payment', 'POST', 2);


-- 🔹 Insert API Logs (if using ApiLog entity)
INSERT INTO api_log (id, api_name, status, response_time)
VALUES (1, 'Login API', 'SUCCESS', 120);

INSERT INTO api_log (id, api_name, status, response_time)
VALUES (2, 'Payment API', 'FAILED', 450);