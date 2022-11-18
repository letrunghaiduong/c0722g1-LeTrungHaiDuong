package repostory;

import model.BenhAn;

import java.util.List;

public interface IBenhAnRepostory {
    List<BenhAn> findAll();
    boolean update(BenhAn benhAn);
}
