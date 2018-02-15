-- Write queries to return the following:
-- The following changes are applied to the "DVD Store" database.**

-- 1. Add actors, Hampton Avenue, and Lisa Byway to the actor table.
BEGIN TRANSACTION;
INSERT INTO actor (first_name, last_name) 
VALUES ('HAMPTON', 'AVENUE');
INSERT INTO actor (first_name, last_name)
VALUES ('LISA', 'BYWAY');
COMMIT;

ROLLBACK;


SELECT actor_id 
FROM actor
WHERE first_name = 'HAMPTON' AND last_name = 'AVENUE';





-- 2. Add "Euclidean PI", "The epic story of Euclid as a pizza delivery boy in 
-- ancient Greece", to the film table. The movie was released in 2008 in English. 
-- Since its an epic, the run length is 3hrs and 18mins. There are no special 
-- features, the film speaks for itself, and doesn't need any gimmicks.	
BEGIN TRANSACTION;
INSERT INTO film (title, description, release_year, language_id, length) 
VALUES ('Euclidean PI', 
'The epic story of Euclid as a pizza delivery boy in -- ancient Greece', 
2008,
1,
198
);

COMMIT;

ROLLBACK;




-- 3. Hampton Avenue plays Euclid, while Lisa Byway plays his slightly 
-- overprotective mother, in the film, "Euclidean PI". Add them to the film.
-- get values
SELECT actor_id, first_name
FROM actor
WHERE (first_name = 'HAMPTON' AND last_name = 'AVENUE') OR (first_name = 'LISA' AND last_name = 'BYWAY');
SELECT film_id, title
FROM film
WHERE title = 'Euclidean PI';


-- do requested action
BEGIN TRANSACTION;
INSERT INTO film_actor (actor_id, film_id) 
VALUES (205,
1001
);
INSERT INTO film_actor (actor_id, film_id) 
VALUES (206,
1001
);

-- check  results
SELECT film.title
FROM film 
JOIN film_actor ON film.film_id = film_actor.film_id
JOIN actor ON film_actor.actor_id = actor.actor_id
WHERE (first_name = 'HAMPTON' AND last_name = 'AVENUE') OR (first_name = 'LISA' AND last_name = 'BYWAY');

COMMIT;

ROLLBACK;





-- 4. Add Mathmagical to the category table.
BEGIN TRANSACTION;
INSERT INTO category (name) 
VALUES ('Mathmagical');

-- check
SELECT * 
FROM category;

COMMIT;
ROLLBACK;





-- 5. Assign the Mathmagical category to the following films, "Euclidean PI", 
-- "EGG IGBY", "KARATE MOON", "RANDOM GO", and "YOUNG LANGUAGE"
SELECT title, film_id
FROM film 
WHERE title = 'Euclidean PI' OR title = 'EGG IGBY' OR title = 'KARATE MOON' OR title = 'RANDOM GO' OR title = 'YOUNG LANGUAGE';
-- 274, 494, 714, 996, 1001
SELECT * 
FROM category;
--17
SELECT category_id
FROM film_category
WHERE film_id = 274 or film_id = 494 or film_id = 714 or film_id = 996 or film_id = 1001;

BEGIN TRANSACTION;


INSERT INTO film_category (film_id, category_id) 
VALUES (274, 17),
 (494, 17),
 (714, 17),
 (996, 17),
 (1001, 17)

COMMIT;
ROLLBACK;





-- 6. Mathmagical films always have a "G" rating, adjust all Mathmagical films 
-- accordingly.
-- (5 rows affected)
select film.rating 
from film 
join film_category on film.film_id = film_category.film_id
where category_id = 17

BEGIN TRANSACTION;
UPDATE film
SET rating = 'G'
FROM film_category
WHERE category_id = 17 AND film.film_id = film_category.film_id;
COMMIT;

ROLLBACK;




-- 7. Add a copy of "Euclidean PI" to all the stores.
SELECT title, film_id
FROM film 
WHERE title = 'Euclidean PI'; 

SELECT MAX(store_id)
FROM inventory;

SELECT film_id, store_id
FROM inventory
WHERE film_id = 1001;


BEGIN TRANSACTION;
INSERT INTO inventory (film_id, store_id) 
VALUES (1001, 1),
(1001, 2);
COMMIT;



ROLLBACK;





-- 8. The Feds have stepped in and have impounded all copies of the pirated film, 
-- "Euclidean PI". The film has been seized from all stores, and needs to be 
-- deleted from the film table. Delete "Euclidean PI" from the film table. 
-- (Did it succeed? Why?)
SELECT film_id, title
FROM film
WHERE film_id = 1001;


BEGIN TRANSACTION;
DELETE FROM film
WHERE film_id = 1001;
ROLLBACK;
-- No film_actor refernces the film

COMMIT;






-- 9. Delete Mathmagical from the category table. 
-- (Did it succeed? Why?)
SELECT category_id, name
FROM category
WHERE category_id = 17;

BEGIN TRANSACTION;
DELETE FROM category
WHERE category_id = 17;
ROLLBACK;
-- no it is linked to the film_category table by its key
COMMIT;





-- 10. Delete all links to Mathmagical in the film_category tale. 
-- (Did it succeed? Why?)
SELECT *
FROM film_category
WHERE category_id = 17;

BEGIN TRANSACTION;
DELETE FROM film_category
WHERE category_id = 17;
--Yes this film_category is pulling column name from category and is linked only as a top level table  to the category by the category_id
COMMIT;
ROLLBACK;





-- 11. Retry deleting Mathmagical from the category table, followed by retrying
-- to delete "Euclidean PI". 
-- (Did either deletes succeed? Why?)

BEGIN TRANSACTION;
DELETE FROM category
WHERE category_id = 17;
--yes there are no remaining rows in film_category linked to the category table
COMMIT;


BEGIN TRANSACTION;
DELETE FROM film
WHERE film_id = 1001;
-- No film_actor still refernces the film
ROLLBACK;





-- 12. Check database metadata to determine all constraints of the film id, and 
-- describe any remaining adjustments needed before the film "Euclidean PI" can 
-- be removed from the film table.

-- all rows linked to the film must be removed from film_actor table
-- all rows linked to the film must be removed from inventory table

BEGIN TRANSACTION;
-- remove from film_actor table
DELETE FROM film_actor
WHERE film_id = 1001;
-- remove from inventory table
DELETE FROM inventory
WHERE film_id = 1001;
-- remove from film table
DELETE FROM film
WHERE film_id = 1001;
-- success
COMMIT;

