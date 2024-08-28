CREATE TABLE if not exists public.Flats (
    id BIGSERIAL PRIMARY KEY AUTOINCREMENT,
    room_count INTEGER NOT NULL,
    floor INTEGER NOT NULL;
    area DOUBLE NOT NULL;;
    price BIGINT NOT NULL;
    nearest_metro TEXT NOT NULL;
);