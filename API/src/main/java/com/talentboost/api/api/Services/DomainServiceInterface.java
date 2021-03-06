package com.talentboost.api.api.Services;

import com.talentboost.api.api.Models.Domain;
import com.talentboost.api.api.Models.Meme;

import java.util.List;

public interface DomainServiceInterface {

    public void register();
    public Domain[] getDomains();
    public Meme[] getMemes(String domain);
    public void onDestroy() throws Exception;
    public List<Meme> getFilteredMemes(String filter);
}
