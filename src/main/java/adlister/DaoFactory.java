package adlister;

public class DaoFactory {
    private static Todos todoDao;
    public static Todos getTodosDao(){
        if (todoDao == null){
            todoDao = new MySQLTodoDao(new Config());
        }
        return todoDao;
    }
//    private static Ads adsDao;
//private static Authors authorsDao;
//private static Quotes quotesDao;
//private static Config config = new Config();
//    public static Ads getAdsDao() {
//        if (adsDao == null) {
//            adsDao = new ListAdsDao();
//        }
//        return adsDao;
//    }
//    public static Authors getAuthorsDao(){
//        if(authorsDao == null){
//            authorsDao = new AuthorsDao(config);
//        }
//        return authorsDao;
//    }
//    public static Quotes getQuotesDao(){
//        if ( quotesDao == null){
//            quotesDao = new QoutesDao(config);
//        }
//        return quotesDao;
//    }
}
