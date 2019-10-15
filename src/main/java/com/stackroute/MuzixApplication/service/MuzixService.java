package com.stackroute.MuzixApplication.service;

import com.stackroute.MuzixApplication.domain.Muzix;
import com.stackroute.MuzixApplication.exception.MuzixNotFoundException;

import java.util.ArrayList;
import java.util.List;

public interface MuzixService {
    public ArrayList<Muzix> getAllMuzix();
    void updateMuzixByComment(Muzix muzix,String comment);
    void deleteMuzixById(int id) throws MuzixNotFoundException;
    public Muzix saveNewMuzix(Muzix muzix);
    public void updateMuzix(Muzix muzix) throws MuzixNotFoundException;

}
