import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.FilmManager;

public class FilmManagerTest {
    @Test
    public void shouldAddFilm() {
        FilmManager manager = new FilmManager();

        manager.addFilm("film 1");
        manager.addFilm("film 2");
        manager.addFilm("film 3");

        String[] expected = {"film 1", "film 2", "film 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilms() {
        FilmManager manager = new FilmManager();

        manager.addFilm("film 1");
        manager.addFilm("film 2");
        manager.addFilm("film 3");
        manager.addFilm("film 4");
        manager.addFilm("film 5");

        manager.findLast();

        String[] expected = {"film 5", "film 4", "film 3", "film 2", "film 1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsLimit() {
        FilmManager manager = new FilmManager();

        manager.addFilm("film 1");
        manager.addFilm("film 2");
        manager.addFilm("film 3");
        manager.addFilm("film 4");
        manager.addFilm("film 5");
        manager.addFilm("film 1");
        manager.addFilm("film 2");
        manager.addFilm("film 3");
        manager.addFilm("film 4");
        manager.addFilm("film 5");

        manager.findLast();

        String[] expected = {"film 1", "film 2", "film 3", "film 4", "film 5", "film 1", "film 2", "film 3", "film 4", "film 5"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowFilmsAboveMax() {
        FilmManager manager = new FilmManager();

        manager.addFilm("film 1");
        manager.addFilm("film 2");
        manager.addFilm("film 3");
        manager.addFilm("film 4");
        manager.addFilm("film 5");
        manager.addFilm("film 1");
        manager.addFilm("film 2");
        manager.addFilm("film 3");
        manager.addFilm("film 4");
        manager.addFilm("film 5");
        manager.addFilm("film 5");

        manager.findLast();

        String[] expected = {"film 1", "film 2", "film 3", "film 4", "film 5", "film 1", "film 2", "film 3", "film 4", "film 5", "film 5"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }
}
