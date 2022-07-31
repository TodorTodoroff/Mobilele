INSERT INTO users (id, email, first_name, last_name, image_url, is_active, password)
VALUES (1, 'todor.todoroff@gmail.com', 'Todor', 'Todorov', null, 1,
        '4aae635f71116bbb81942c947db9e999e4be9437cd7a939d9fe444a8a24fee20b17d7c3ced7196ea');

INSERT INTO brands (id, name)
VALUES (1, 'Ford'),
       (2, 'Toyota');

INSERT INTO models (id, name, category, start_year, end_year, brand_id, image_url)
VALUES (1, 'Fiesta', 'CAR', '1976', null, 1,
        'https://www.carmag.co.za/wp-content/uploads/2017/08/Ford-Fiesta-ST200_01.jpg'),
       (2, 'Escort', 'CAR', 1968, 2000, 1, 'https://www.auto-data.net/images/f48/Ford-Escort-VI-Hatch-GAL.jpg'),
       (3, 'Yaris', 'CAR', 1999, null, 2,
        'https://automedia.investor.bg/media/files/resized/gallery/760x/bb8/9001b5fe742698ef0d5344a221e74bb8-toyota-yaris-gr-sport%20(6).jpg');



INSERT INTO offers (id, description, engine, image_url, mileage, price, transmission, year, model_id, seller_id)
VALUES (4, 'Качваш са, караш са, отиваш на фиеста 1. С Форд Фиеста.', 'GASOLINE',
        'https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg/280px-2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg',
        320001, 2601, 'MANUAL', 2005, 1, 1),
       (5, 'Качваш са, караш са, отиваш на фиеста 2. С Форд Фиеста.', 'GASOLINE',
        'https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg/280px-2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg',
        320002, 2602, 'MANUAL', 2005, 1, 1),
       (6, 'Качваш са, караш са, отиваш на фиеста 3. С Форд Фиеста.', 'GASOLINE',
        'https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg/280px-2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg',
        320003, 2603, 'MANUAL', 2005, 1, 1),
       (7, 'Качваш са, караш са, отиваш на фиеста 4. С Форд Фиеста.', 'GASOLINE',
        'https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg/280px-2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg',
        320004, 2605, 'MANUAL', 2005, 1, 1),
       (8, 'Качваш са, караш са, отиваш на фиеста 5. С Форд Фиеста.', 'GASOLINE',
        'https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg/280px-2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg',
        320005, 2604, 'MANUAL', 2005, 1, 1),
       (9, 'Качваш са, караш са, отиваш на фиеста 6. С Форд Фиеста.', 'GASOLINE',
        'https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg/280px-2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg',
        320006, 2606, 'MANUAL', 2005, 1, 1),
       (10, 'Качваш са, караш са, отиваш на фиеста 7. С Форд Фиеста.', 'GASOLINE',
        'https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg/280px-2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg',
        320007, 2607, 'MANUAL', 2005, 1, 1),
       (11, 'Качваш са, караш са, отиваш на фиеста 8. С Форд Фиеста.', 'GASOLINE',
        'https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg/280px-2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg',
        320008, 2609, 'MANUAL', 2005, 1, 1),
       (12, 'Качваш са, караш са, отиваш на фиеста 9. С Форд Фиеста.', 'GASOLINE',
        'https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg/280px-2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg',
        320009, 2640, 'MANUAL', 2005, 1, 1),
       (13, 'Качваш са, караш са, отиваш на фиеста 10. С Форд Фиеста.', 'GASOLINE',
        'https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg/280px-2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg',
        320010, 2630, 'MANUAL', 2005, 1, 1),
       (14, 'Качваш са, караш са, отиваш на фиеста 11. С Форд Фиеста.', 'GASOLINE',
        'https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg/280px-2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg',
        320011, 2633, 'MANUAL', 2005, 1, 1),
       (15, 'Качваш са, караш са, отиваш на фиеста 12. С Форд Фиеста.', 'GASOLINE',
        'https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg/280px-2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg',
        320012, 2654, 'MANUAL', 2005, 1, 1),
       (16, 'Качваш са, караш са, отиваш на фиеста 13. С Форд Фиеста.', 'GASOLINE',
        'https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg/280px-2005_Ford_Fiesta_%28WP%29_Ghia_5-door_hatchback_%282015-07-24%29_01.jpg',
        320013, 2612, 'MANUAL', 2005, 1, 1);