CREATE SEQUENCE FLIGHT_SEQUENCE START WITH 1 INCREMENT BY 1;
INSERT INTO Flight(id, travelOrderId, sourceAirport, destinyAirport) VALUES (nextval('FLIGHT_SEQUENCE'), 1, 'GRU', 'GIG');
INSERT INTO Flight(id, travelOrderId, sourceAirport, destinyAirport) VALUES (nextval('FLIGHT_SEQUENCE'), 2, 'GRU', 'SDU');
INSERT INTO Flight(id, travelOrderId, sourceAirport, destinyAirport) VALUES (nextval('FLIGHT_SEQUENCE'), 3, 'GRU', 'CWB');
INSERT INTO Flight(id, travelOrderId, sourceAirport, destinyAirport) VALUES (nextval('FLIGHT_SEQUENCE'), 4, 'GRU', 'FLN');
INSERT INTO Flight(id, travelOrderId, sourceAirport, destinyAirport) VALUES (nextval('FLIGHT_SEQUENCE'), 5, 'GRU', 'POA');