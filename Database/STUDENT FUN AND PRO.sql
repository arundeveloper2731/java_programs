-- FUNCTION: public.student(integer, integer, integer)

-- DROP FUNCTION IF EXISTS public.student(integer, integer, integer);

CREATE OR REPLACE FUNCTION public.student(
	mark1 integer,
	mark2 integer,
	mark3 integer)
    RETURNS integer
    LANGUAGE 'plpgsql'
   
AS $$
DECLARE
RESULT INT;

BEGIN 
RESULT := (MARK1 + MARK2 + MARK3);

	
	IF RESULT >= 150
	RAISE NOTICE 'RESULT = PASS';
	ELSE 
	RAISE NOTICE 'RESULT = FAIL';
	END IF;
RETURN RESULT;
END
$$;



CREATE OR REPLACE FUNCTION SIMPLE_INTEREST(PRINCIPAL INT,RATE INT , YEARS INT)
RETURNS INT AS $$
DECLARE 
SI INT;
BEGIN 
SI = (PRINCIPAL * RATE * YEARS)/100;
RETURN SI INT;
END;
$$ LANGUAGE PLPGSQL;


CREATE OR REPLACE PROCEDURE interest(
    principal INT,
    rate INT,
    years INT
)
AS $$
DECLARE
    simple_interest INT;
    total_amount INT;
BEGIN
    simple_interest := SIMPLE_INTEREST(principal, rate, years);

    total_amount := principal + simple_interest;

    RAISE NOTICE 'Principal Amount : %', principal;
    RAISE NOTICE 'Simple Interest  : %', simple_interest;
    RAISE NOTICE 'Total Amount     : %', total_amount;
END;
$$
LANGUAGE plpgsql;


call interest (10000,5,2);






