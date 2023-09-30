package ModelEliments;

import java.util.ArrayList;
import java.util.List;

public class Scene {
    public int ID;
    public List<PolygonalModel> Models;
    public List<Flash> Flashes;
    public List<Camera> cameras = new ArrayList<Camera>();
    private List<PolygonalModel> models;

    public Scene(int id, List<PolygonalModel> models2, List<Flash> flashes, List<Camera> cameras) throws Exception {
        this.ID = id;
        if (models.size() > 0) {
            this.Models = models;
        } else {
            throw new Exception("Должна быть одна модель");
        }
        this.Flashes = flashes;
        if (cameras.size() > 0) {
            this.cameras = cameras;
        } else {
            throw new Exception("Должна быть одна модель");
        }
    }

    public <T> T method1(T flash) {
        return flash;
    }

    public <T, E> T method2(T Model, E Flash) {
        return Model;
    }

    // /**
    // * просто заглушка
    // */
    // public Type1 method1(Type1 t) {
    // return t;
    // }

    // /**
    // * просто заглушка
    // */
    // public Type1 method1(Type1 t1, Type2 t2) {
    // return t1;
    // }
}
