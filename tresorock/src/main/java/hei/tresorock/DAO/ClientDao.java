package hei.tresorock.DAO;

public interface ClientDao {
    public List<Film> listFilms();

    public Film getFilm(Integer id);

    public Film getRandomFilm();

    public Film addFilm(Film film);

}
