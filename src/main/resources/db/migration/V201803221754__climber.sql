DROP TABLE public.climbers;
CREATE TABLE public.climbers
(
  ID SERIAL PRIMARY KEY NOT NULL,
  NAME TEXT NOT NULL,
  PASSWORD TEXT NOT NULL
);