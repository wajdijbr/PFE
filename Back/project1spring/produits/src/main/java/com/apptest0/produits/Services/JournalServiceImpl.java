package com.apptest0.produits.Services;


import com.apptest0.produits.Repos.JournalRepository;

import com.apptest0.produits.entity.Caisse;
import com.apptest0.produits.entity.Journal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JournalServiceImpl implements JournalService {
    @Autowired
    JournalRepository journalRepository;

    @Override
    public List<Journal> getJournal() {
        return journalRepository.findAll();
    }



}