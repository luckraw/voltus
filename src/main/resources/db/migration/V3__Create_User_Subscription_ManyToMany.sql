CREATE TABLE user_subscription (
    user_id INTEGER NOT NULL,
    subscription_id INTEGER NOT NULL,
    PRIMARY KEY (user_id, subscription_id),
    FOREIGN KEY (user_id) REFERENCES user_account(id),
    FOREIGN KEY (subscription_id) REFERENCES subscription(id)
);
