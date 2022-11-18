package service;

import model.BenhAn;

import java.util.List;

public interface IBenhAnService {
    List<BenhAn> findAll();
    boolean update(BenhAn benhAn);
}
