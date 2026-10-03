-- Medium
-- Query 1:	
SELECT email, COUNT(*) AS duplicate_times
FROM users
GROUP BY email
HAVING COUNT(*) > 1;

-- Query 2:
DELETE FROM users
WHERE id NOT IN (SELECT id FROM users GROUP BY email);


-- Hard
SELECT b1.room_id,
	b1.id,
	b2.id AS overlap_with
FROM bookings b1
JOIN bookings b2
ON b1.room_id = b2.room_id AND b1.id < b2.id AND b2.start_time < b1.end_time;