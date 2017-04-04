BEGIN TRANSACTION;
CREATE TABLE `user` (
	`ID`	INTEGER PRIMARY KEY AUTOINCREMENT,
	`name`	TEXT,
	`email`	TEXT,
	`password`	TEXT,
	`image`	INTEGER
);
CREATE TABLE `auction_item` (
	`ID`	INTEGER PRIMARY KEY AUTOINCREMENT,
	`name`	TEXT,
	`description`	TEXT,
	`price`	NUMERIC,
	`image`	TEXT,
	`user_id`	INTEGER,
	`winner_bid_id`	INTEGER,
	`date`	NUMERIC
);
CREATE TABLE `auction_bid` (
	`ID`	INTEGER PRIMARY KEY AUTOINCREMENT,
	`user_id`	INTEGER,
	`auction_item_id`	INTEGER,
	`value`	NUMERIC,
	`date`	NUMERIC
);
COMMIT;
