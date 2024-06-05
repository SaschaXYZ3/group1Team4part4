package at.ac.fhcampuswien.fhmdb.pattern.factory;

import at.ac.fhcampuswien.fhmdb.controllers.MainController;
import at.ac.fhcampuswien.fhmdb.controllers.MainController;

import javax.security.auth.callback.Callback;

public class Factory {//implements Callback<Class<?>, Object> {
    private static MainController homeController;
    public MainController getHomeController(){
        if (homeController == null) {
            homeController = new MainController();
        }
        return homeController;
    }
    //@Override
    public Object call(Class<?> aClass) {
        try {
            return getHomeController();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
