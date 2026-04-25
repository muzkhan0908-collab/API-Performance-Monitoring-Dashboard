-- =========================================
-- Consolidated Data File for H2 Database
-- =========================================

-- 🔹 Insert Users
INSERT INTO users (user_id, name, email, password, role) VALUES
                                                             (1, 'Admin', 'admin@gmail.com', '1234', 'ADMIN'),
                                                             (2, 'User1', 'user1@gmail.com', '1234', 'USER'),
                                                             (3, 'User2', 'user2@gmail.com', 'abcd', 'USER'),
                                                             (4, 'Manager', 'manager@gmail.com', 'pass123', 'MANAGER'),
                                                             (5, 'Developer', 'dev@gmail.com', 'devpass', 'DEVELOPER'),
                                                             (6, 'Tester', 'tester@gmail.com', 'test123', 'QA'),
                                                             (7, 'Support', 'support@gmail.com', 'helpme', 'SUPPORT'),
                                                             (8, 'Analyst', 'analyst@gmail.com', 'analysis', 'ANALYST');

-- 🔹 Insert APIs (linked to users)
INSERT INTO api (api_id, api_name, endpoint_url, method, user_id) VALUES
                                                                      (1, 'Login API', '/login', 'POST', 1),
                                                                      (2, 'Payment API', '/payment', 'POST', 2),
                                                                      (3, 'User Profile API', '/profile', 'GET', 2),
                                                                      (4, 'Transaction API', '/transaction', 'POST', 3),
                                                                      (5, 'Report API', '/report', 'GET', 4),
                                                                      (6, 'Notification API', '/notify', 'POST', 5),
                                                                      (7, 'Feedback API', '/feedback', 'POST', 6),
                                                                      (8, 'Helpdesk API', '/helpdesk', 'GET', 7),
                                                                      (9, 'Analytics API', '/analytics', 'GET', 8),
                                                                      (10, 'Export API', '/export', 'POST', 8);

-- 🔹 Insert API Logs
INSERT INTO api_log (id, api_name, status, response_time) VALUES
                                                              (1, 'Login API', 'SUCCESS', 120),
                                                              (2, 'Payment API', 'FAILED', 450),
                                                              (3, 'User Profile API', 'SUCCESS', 200),
                                                              (4, 'Transaction API', 'SUCCESS', 350),
                                                              (5, 'Report API', 'FAILED', 500),
                                                              (6, 'Notification API', 'SUCCESS', 180),
                                                              (7, 'Feedback API', 'SUCCESS', 95),
                                                              (8, 'Helpdesk API', 'FAILED', 600),
                                                              (9, 'Analytics API', 'SUCCESS', 220),
                                                              (10, 'Export API', 'SUCCESS', 310);
