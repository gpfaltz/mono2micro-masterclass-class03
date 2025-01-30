CREATE SEQUENCE HOTEL_SEQUENCE START WITH 1 INCREMENT BY 1;
INSERT INTO Hotel(id, travelOrderId, nights) VALUES (nextval('HOTEL_SEQUENCE'), 1, 5);
INSERT INTO Hotel(id, travelOrderId, nights) VALUES (nextval('HOTEL_SEQUENCE'), 2, 10);
INSERT INTO Hotel(id, travelOrderId, nights) VALUES (nextval('HOTEL_SEQUENCE'), 3, 15);
INSERT INTO Hotel(id, travelOrderId, nights) VALUES (nextval('HOTEL_SEQUENCE'), 4, 20);
INSERT INTO Hotel(id, travelOrderId, nights) VALUES (nextval('HOTEL_SEQUENCE'), 5, 25);