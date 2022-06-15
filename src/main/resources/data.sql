INSERT INTO users (id,email,first_name, last_name, image_url, is_active, password)
VALUES(1,'todor.todoroff@gmail.com','Todor','Todorov', null,1,'4aae635f71116bbb81942c947db9e999e4be9437cd7a939d9fe444a8a24fee20b17d7c3ced7196ea');

INSERT INTO brands (id,name)
VALUES (1,'Ford'),(2,'Toyota');

INSERT INTO models (id, name, category, start_year, end_year, brand_id, image_url)
VALUES(1,'Fiesta', 'CAR', '1976', null, 1, 'https://www.carmag.co.za/wp-content/uploads/2017/08/Ford-Fiesta-ST200_01.jpg'),
       (2,'Escort', 'CAR', 1968, 2000,1,'https://www.auto-data.net/images/f48/Ford-Escort-VI-Hatch-GAL.jpg'),
       (3,'Yaris', 'CAR', 1999, null, 2, 'https://automedia.investor.bg/media/files/resized/gallery/760x/bb8/9001b5fe742698ef0d5344a221e74bb8-toyota-yaris-gr-sport%20(6).jpg')
