insert into eventtype (id, name) VALUES (1, 'concert');
insert into eventtype (id, name) VALUES (2, 'event');
insert into eventtype (id, name) values (3, 'exhibition');
insert into eventtype (id, name) values (4, 'convention');

insert into event (id, address, ageRange, description, endDate, limitedNumberOfSeats, pictures, startDate, title, eventType_id) VALUES (1,'Żapkowska 15;15-040;Przyjemnowo;Strefa K','7','Światowej sławy wokaliska, kompozytorka, projektantka mody i celebrytka Dziunia zaprezentuje swój najnowszy album pt. "Dziunia" pierwszy raz na scenie! Album porusza niezwykle ważne tematy takie jak: sława, przepych, władza i pół dżdżownicy. Jest wszystkim  Jest to świetna okazja, aby zabrać całą rodzinę i zgniłe pomidory ze sobą.',str_to_date('2024-05-18', '%Y-%m-%d'),true,'https://i.ytimg.com/vi/DppVi0ycHxQ/maxresdefault.jpg',str_to_date('2024-05-18', '%Y-%m-%d'),'Dziunia Show',1);

insert into zone (id, name, price, event_id) VALUES (1, 'Sala 1', 152.99, 1);

-- Row 1
insert into seat (id, number, row, status, zone_id) VALUES (1, 1, 1, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (2, 2, 1, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (3, 3, 1, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (4, 4, 1, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (5, 5, 1, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (6, 6, 1, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (7, 7, 1, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (8, 8, 1, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (9, 9, 1, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (10, 10, 1, 'Free', 1);
-- Row 2
insert into seat (id, number, row, status, zone_id) VALUES (11, 1, 2, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (12, 2, 2, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (13, 3, 2, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (14, 4, 2, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (15, 5, 2, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (16, 6, 2, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (17, 7, 2, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (18, 8, 2, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (19, 9, 2, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (20, 10, 2, 'Free', 1);
-- Row 3
insert into seat (id, number, row, status, zone_id) VALUES (21, 1, 3, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (22, 2, 3, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (23, 3, 3, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (24, 4, 3, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (25, 5, 3, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (26, 6, 3, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (27, 7, 3, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (28, 8, 3, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (29, 9, 3, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (30, 10, 3, 'Free', 1);
-- Row 4
insert into seat (id, number, row, status, zone_id) VALUES (31, 1, 4, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (32, 2, 4, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (33, 3, 4, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (34, 4, 4, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (35, 5, 4, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (36, 6, 4, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (37, 7, 4, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (38, 8, 4, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (39, 9, 4, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (40, 10, 4, 'Free', 1);
-- Row 5
insert into seat (id, number, row, status, zone_id) VALUES (41, 1, 5, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (42, 2, 5, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (43, 3, 5, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (44, 4, 5, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (45, 5, 5, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (46, 6, 5, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (47, 7, 5, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (48, 8, 5, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (49, 9, 5, 'Free', 1);
insert into seat (id, number, row, status, zone_id) VALUES (50, 10, 5, 'Free', 1);

insert into event (id, address, ageRange, description, endDate, limitedNumberOfSeats, pictures, startDate, title, eventType_id) VALUES (2,'Siankowa 32;35-187;Siamko;Strefa K','14','Też masz dosyć wrogów zbrodniczego reżimu? Jest to doskonała okazja, aby zobaczyć jak dokonują żywota. Zabierz całą swoją rodzinę, znajomych i nieznajomych i przeżyjmy tę niezykłą chwilę razem.',str_to_date('2024-06-23', '%Y-%m-%d'),true,'https://pbs.twimg.com/media/F9bi8zyWUAAPnPv.jpg',str_to_date('2024-06-23', '%Y-%m-%d'),'Publiczna egzekucja wrogów reżimu',2);

insert into zone (id, name, price, event_id) VALUES (2, 'Trybuna 1', 23.99, 2);

-- Row 1
insert into seat (id, number, row, status, zone_id) VALUES (51, 1, 1, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (52, 2, 1, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (53, 3, 1, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (54, 4, 1, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (55, 5, 1, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (56, 6, 1, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (57, 7, 1, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (58, 8, 1, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (59, 9, 1, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (60, 10, 1, 'Free', 2);
-- Row 2
insert into seat (id, number, row, status, zone_id) VALUES (61, 1, 2, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (62, 2, 2, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (63, 3, 2, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (64, 4, 2, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (65, 5, 2, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (66, 6, 2, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (67, 7, 2, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (68, 8, 2, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (69, 9, 2, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (70, 10, 2, 'Free', 2);
-- Row 3
insert into seat (id, number, row, status, zone_id) VALUES (71, 1, 3, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (72, 2, 3, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (73, 3, 3, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (74, 4, 3, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (75, 5, 3, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (76, 6, 3, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (77, 7, 3, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (78, 8, 3, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (79, 9, 3, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (80, 10, 3, 'Free', 2);
-- Row 4
insert into seat (id, number, row, status, zone_id) VALUES (81, 1, 4, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (82, 2, 4, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (83, 3, 4, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (84, 4, 4, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (85, 5, 4, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (86, 6, 4, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (87, 7, 4, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (88, 8, 4, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (89, 9, 4, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (90, 10, 4, 'Free', 2);
-- Row 5
insert into seat (id, number, row, status, zone_id) VALUES (91, 1, 5, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (92, 2, 5, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (93, 3, 5, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (94, 4, 5, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (95, 5, 5, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (96, 6, 5, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (97, 7, 5, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (98, 8, 5, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (99, 9, 5, 'Free', 2);
insert into seat (id, number, row, status, zone_id) VALUES (100, 10, 5, 'Free', 2);

insert into zone (id, name, price, event_id) VALUES (3, 'Trybuna 2', 23.99, 2);

-- Row 1
insert into seat (id, number, row, status, zone_id) VALUES (101, 1, 1, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (102, 2, 1, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (103, 3, 1, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (104, 4, 1, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (105, 5, 1, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (106, 6, 1, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (107, 7, 1, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (108, 8, 1, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (109, 9, 1, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (110, 10, 1, 'Free', 3);
-- Row 2
insert into seat (id, number, row, status, zone_id) VALUES (111, 1, 2, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (112, 2, 2, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (113, 3, 2, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (114, 4, 2, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (115, 5, 2, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (116, 6, 2, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (117, 7, 2, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (118, 8, 2, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (119, 9, 2, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (120, 10, 2, 'Free', 3);
-- Row 3
insert into seat (id, number, row, status, zone_id) VALUES (121, 1, 3, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (122, 2, 3, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (123, 3, 3, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (124, 4, 3, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (125, 5, 3, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (126, 6, 3, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (127, 7, 3, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (128, 8, 3, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (129, 9, 3, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (130, 10, 3, 'Free', 3);
-- Row 4
insert into seat (id, number, row, status, zone_id) VALUES (131, 1, 4, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (132, 2, 4, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (133, 3, 4, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (134, 4, 4, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (135, 5, 4, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (136, 6, 4, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (137, 7, 4, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (138, 8, 4, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (139, 9, 4, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (140, 10, 4, 'Free', 3);
-- Row 5
insert into seat (id, number, row, status, zone_id) VALUES (141, 1, 5, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (142, 2, 5, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (143, 3, 5, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (144, 4, 5, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (145, 5, 5, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (146, 6, 5, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (147, 7, 5, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (148, 8, 5, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (149, 9, 5, 'Free', 3);
insert into seat (id, number, row, status, zone_id) VALUES (150, 10, 5, 'Free', 3);

insert into zone (id, name, price, event_id) VALUES (4, 'Przy scenie', 150.99, 2);

-- Row 1
insert into seat (id, number, row, status, zone_id) VALUES (161, 1, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (162, 2, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (163, 3, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (164, 4, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (165, 5, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (166, 6, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (167, 7, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (168, 8, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (169, 9, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (170, 10, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (171, 11, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (172, 12, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (173, 13, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (174, 14, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (175, 15, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (176, 16, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (177, 17, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (178, 18, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (179, 19, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (180, 20, 1, 'Free', 4);
-- Row 2
insert into seat (id, number, row, status, zone_id) VALUES (181, 1, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (182, 2, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (183, 3, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (184, 4, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (185, 5, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (186, 6, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (187, 7, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (188, 8, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (189, 9, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (190, 10, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (191, 11, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (192, 12, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (193, 13, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (194, 14, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (195, 15, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (196, 16, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (197, 17, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (198, 18, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (199, 19, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (200, 20, 1, 'Free', 4);
-- Row 3
insert into seat (id, number, row, status, zone_id) VALUES (201, 1, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (202, 2, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (203, 3, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (204, 4, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (205, 5, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (206, 6, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (207, 7, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (208, 8, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (209, 9, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (210, 10, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (211, 11, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (212, 12, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (213, 13, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (214, 14, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (215, 15, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (216, 16, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (217, 17, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (218, 18, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (219, 19, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (220, 20, 1, 'Free', 4);
-- Row 4
insert into seat (id, number, row, status, zone_id) VALUES (221, 1, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (222, 2, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (223, 3, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (224, 4, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (225, 5, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (226, 6, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (227, 7, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (228, 8, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (229, 9, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (230, 10, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (231, 11, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (232, 12, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (233, 13, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (234, 14, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (235, 15, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (236, 16, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (237, 17, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (238, 18, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (239, 19, 1, 'Free', 4);
insert into seat (id, number, row, status, zone_id) VALUES (240, 20, 1, 'Free', 4);

insert into event (id, address, ageRange, description, endDate, limitedNumberOfSeats, pictures, startDate, title, eventType_id) VALUES (3,'Piankowa 16/45;45-454;Słodycze;Strefa K','7','Kurowa jak co roku ma przyjemność zaprosić wszystkie chętne Kuce na Najważniejsze Wydarzenie Roku, czyli Bal u Kurowej!!!1 Bal jak co roku odbędzie się na zamku, także załóżcie najlepsze łachmany i przybywajcie!! Miejsca ograniczone.',str_to_date('2024-10-25', '%Y-%m-%d'),true,'data:image/jpeg;base64,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',str_to_date('2024-10-28', '%Y-%m-%d'),'Bal u Kurowej',2);

insert into zone (id, name, price, event_id) VALUES (5, 'Sala bankietowa', 1500, 3);

-- Row 1
insert into seat (id, number, row, status, zone_id) VALUES (241, 1, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (242, 2, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (243, 3, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (244, 4, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (245, 5, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (246, 6, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (247, 7, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (248, 8, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (249, 9, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (240, 10, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (251, 11, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (252, 12, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (253, 13, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (254, 14, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (255, 15, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (256, 16, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (257, 17, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (258, 18, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (259, 19, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (260, 20, 1, 'Free', 5);

-- Row 2
insert into seat (id, number, row, status, zone_id) VALUES (261, 1, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (262, 2, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (263, 3, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (264, 4, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (265, 5, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (266, 6, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (267, 7, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (268, 8, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (269, 9, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (270, 10, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (271, 11, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (272, 12, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (273, 13, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (274, 14, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (275, 15, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (276, 16, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (277, 17, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (278, 18, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (279, 19, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (280, 20, 2, 'Free', 5);

insert into event (id, address, ageRange, description, endDate, limitedNumberOfSeats, pictures, startDate, title, eventType_id) VALUES (4,'Gryfowa 15;15-454;Gryfowa Góra;Strefa K','3','Mamy przyjemność zaprosić wszyskich na Grykon 2024. Jest to fantastyczna okazja, aby zobaczyć gryfy na własne oczy i przekonać się, dlaczego są cool. Podczas konwentu możliwe będzie zebranie autografów od gryfów, zrobienie sobie zdjęcia z gryfami, czy też przeprowadzenie krótkiej rozmowy z nimi.',str_to_date('2024-12-01', '%Y-%m-%d'),true,'data:image/jpeg;base64,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',str_to_date('2024-12-01', '%Y-%m-%d'),'Gryfkon',4);

insert into zone (id, name, price, event_id) VALUES (6, 'Sala A', 150, 4);

-- Row 1
insert into seat (id, number, row, status, zone_id) VALUES (291, 1, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (292, 2, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (293, 3, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (294, 4, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (295, 5, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (296, 6, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (297, 7, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (298, 8, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (299, 9, 1, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (300, 10, 1, 'Free', 5);
-- Row 2
insert into seat (id, number, row, status, zone_id) VALUES (301, 1, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (302, 2, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (303, 3, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (304, 4, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (305, 5, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (306, 6, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (307, 7, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (308, 8, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (309, 9, 2, 'Free', 5);
insert into seat (id, number, row, status, zone_id) VALUES (310, 10, 2, 'Free', 5);