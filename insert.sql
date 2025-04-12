create table payment_events
(
    id              bigint auto_increment primary key,
    buyer_id        bigint          not null,
    is_payment_done BOOL            not null default false,
    payment_key     varchar(255) unique,
    order_id        varchar(255) unique,
    type            ENUM ('NORMAL') NOT NULL,
    order_name      varchar(255)    not null,
    method          ENUM ('EASY_PAY'),
    psp_raw_data    JSON,
    approved_at     DATETIME,
    created_at      DATETIME        NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_at       DATETIME        NOT NULL DEFAULT CURRENT_TIMESTAMP
);

create table payment_orders
(
    id                   bigint auto_increment primary key,
    payment_event_id     bigint                                                            not null,
    seller_id            bigint                                                            not null,
    product_id           bigint                                                            not null,
    order_id             varchar(255)                                                      not null,
    amount               decimal(12, 2)                                                    not null,
    payment_order_status ENUM ('NOT_STATED', 'EXECUTING', 'SUCCESS', 'FAILURE', 'UNKNOWN') not null default 'NOT_STATED',
    ledger_updated       BOOLEAN                                                           NOT NULL DEFAULT FALSE,
    wallet_updated       BOOLEAN                                                           NOT NULL DEFAULT FALSE,
    failed_count         TINYINT                                                           NOT NULL DEFAULT 0,
    threshold            TINYINT                                                           NOT NULL DEFAULT 5,
    created_at           DATETIME                                                          NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_at            DATETIME                                                          NOT NULL DEFAULT CURRENT_TIMESTAMP,

    FOREIGN KEY (payment_event_id) REFERENCES payment_events (id)
);

create table payment_order_histories
(
    id               bigint AUTO_INCREMENT PRIMARY KEY,
    payment_order_id BIGINT   NOT NULL,
    previous_status  ENUM ('NOT_STATED', 'EXECUTING', 'SUCCESS', 'FAILURE', 'UNKNOWN'),
    new_status       ENUM ('NOT_STATED', 'EXECUTING', 'SUCCESS', 'FAILURE', 'UNKNOWN'),
    created_at       DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
    update_at        varchar(255),
    reason           varchar(255),

    FOREIGN KEY (payment_order_id) REFERENCES payment_orders (id)
)
