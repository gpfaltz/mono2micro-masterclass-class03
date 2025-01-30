CREATE SEQUENCE TRAVELORDER_SEQUENCE START WITH 1 INCREMENT BY 1;
INSERT INTO TravelOrder(id) VALUES (nextval('TRAVELORDER_SEQUENCE'));
INSERT INTO TravelOrder(id) VALUES (nextval('TRAVELORDER_SEQUENCE'));
INSERT INTO TravelOrder(id) VALUES (nextval('TRAVELORDER_SEQUENCE'));
INSERT INTO TravelOrder(id) VALUES (nextval('TRAVELORDER_SEQUENCE'));
INSERT INTO TravelOrder(id) VALUES (nextval('TRAVELORDER_SEQUENCE'));

CREATE SEQUENCE FLIGHT_SEQUENCE START WITH 1 INCREMENT BY 1;
INSERT INTO Flight(id, travelOrderId, sourceAirport, destinyAirport) VALUES (nextval('FLIGHT_SEQUENCE'), 1, 'GRU', 'GIG');
INSERT INTO Flight(id, travelOrderId, sourceAirport, destinyAirport) VALUES (nextval('FLIGHT_SEQUENCE'), 2, 'GRU', 'SDU');
INSERT INTO Flight(id, travelOrderId, sourceAirport, destinyAirport) VALUES (nextval('FLIGHT_SEQUENCE'), 3, 'GRU', 'CWB');
INSERT INTO Flight(id, travelOrderId, sourceAirport, destinyAirport) VALUES (nextval('FLIGHT_SEQUENCE'), 4, 'GRU', 'FLN');
INSERT INTO Flight(id, travelOrderId, sourceAirport, destinyAirport) VALUES (nextval('FLIGHT_SEQUENCE'), 5, 'GRU', 'POA');

CREATE SEQUENCE HOTEL_SEQUENCE START WITH 1 INCREMENT BY 1;
INSERT INTO Hotel(id, travelOrderId, nights) VALUES (nextval('HOTEL_SEQUENCE'), 1, 5);
INSERT INTO Hotel(id, travelOrderId, nights) VALUES (nextval('HOTEL_SEQUENCE'), 2, 10);
INSERT INTO Hotel(id, travelOrderId, nights) VALUES (nextval('HOTEL_SEQUENCE'), 3, 15);
INSERT INTO Hotel(id, travelOrderId, nights) VALUES (nextval('HOTEL_SEQUENCE'), 4, 20);
INSERT INTO Hotel(id, travelOrderId, nights) VALUES (nextval('HOTEL_SEQUENCE'), 5, 25);