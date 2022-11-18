package service.impl;

import model.BenhAn;
import repostory.IBenhAnRepostory;
import repostory.impl.BenhAnRepostory;
import service.IBenhAnService;

import java.util.List;

public class BenhAnService implements IBenhAnService {
    IBenhAnRepostory benhAnRepostory = new BenhAnRepostory();
    @Override
    public List<BenhAn> findAll() {
        return benhAnRepostory.findAll();
    }

    @Override
    public boolean update(BenhAn benhAn) {
        return benhAnRepostory.update(benhAn);
    }
}
