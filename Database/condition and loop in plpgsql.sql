CREATE OR REPLACE PROCEDURE check_even_odd(num INTEGER)
LANGUAGE plpgsql
AS $$
BEGIN
    IF num % 2 = 0 THEN
        RAISE NOTICE '% is Even', num;
    ELSE
        RAISE NOTICE '% is Odd', num;
    END IF;
END;
$$;

call check_even_odd(4);

CREATE OR REPLACE PROCEDURE find_greatest(
    a INTEGER,
    b INTEGER,
    c INTEGER
)
LANGUAGE plpgsql
AS $$
BEGIN
    IF a >= b AND a >= c THEN
        RAISE NOTICE 'Greatest number is %', a;
    ELSIF b >= a AND b >= c THEN
        RAISE NOTICE 'Greatest number is %', b;
    ELSE
        RAISE NOTICE 'Greatest number is %', c;
    END IF;
END;
$$;

call find_greatest(44,43,78);


CREATE OR REPLACE PROCEDURE check_voting(num INTEGER)
LANGUAGE plpgsql
AS $$
BEGIN
    IF num > 18 THEN
        RAISE NOTICE 'Eligible for vote';
    ELSE
        RAISE NOTICE 'Not eligible for vote';
    END IF;
END;
$$;

call check_voting(34);


CREATE OR REPLACE PROCEDURE print_num()
LANGUAGE plpgsql
AS $$
DECLARE
    i INTEGER := 1;
BEGIN
    LOOP
        RAISE NOTICE '%', i;
        i := i + 1;

        EXIT WHEN i > 10;
    END LOOP;
END $$;

call print_num();

create or replace procedure sum_of_num()
language plpgsql
as $$
declare
i int :=1;
total  int :=0;

begin 
 LOOP
        total := total + i;
        i := i + 1;

        EXIT WHEN i > 10;
    END LOOP;
	RAISE NOTICE 'Sum = %', total;
	end;
	$$

call sum_of_num();

